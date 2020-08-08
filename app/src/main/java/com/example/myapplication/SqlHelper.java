package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SqlHelper extends SQLiteOpenHelper {
    private static final String TAG = "SqlHelper";
    static final String DB_NAME = "DanhBa.db";
    static final String DB_TABLE = "DanhBaDT";
    static final int DB_VERSION = 1;
    SQLiteDatabase sqLiteDatabase;
    ContentValues contentValues;

    public SqlHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String queryCreateTable = "CREATE TABLE DanhBaDT(" +
                "id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
                "name Text," +
                "sdt Text)";
        db.execSQL(queryCreateTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        if (i != i1) {
            db.execSQL("DROP TABLE IF EXISTS " + DB_TABLE);
            onCreate(db);
        }
    }

    public void insertSdt(contect contect) {
        sqLiteDatabase = getWritableDatabase();
        contentValues = new ContentValues();
        contentValues.put("name", contect.getName());
        contentValues.put("sdt", contect.getSdt());
        sqLiteDatabase.insert(DB_TABLE, null, contentValues);

    }

    public List<contect> getAllContect() {
        List<contect> contects = new ArrayList<>();
        contect contect;
        Cursor cursor = sqLiteDatabase.query(false, DB_NAME, null, null, null, null, null, null, null);
        while (cursor.moveToNext()) {
            String mName = cursor.getString(cursor.getColumnIndex("name"));
            String msdt = cursor.getString(cursor.getColumnIndex("sdt"));
            contects.add(new contect(mName, msdt));

        }
//        String selectQuery = "SELECT * FROM " + DB_NAME;
//        SQLiteDatabase db = this.getWritableDatabase();
//        Cursor cursor = db.rawQuery(selectQuery, null);
//        if (cursor.moveToFirst()) {
//            do {
//                contect Contect = new contect();
//                Contect.setName(cursor.getInt(1) + "");
//                Contect.setSdt(cursor.getInt(2) + "");
//                contects.add(Contect);
//            } while (cursor.moveToNext());
//        }
//        db.close();
        return contects;
    }
}
