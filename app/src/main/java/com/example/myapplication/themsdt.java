package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class themsdt extends AppCompatActivity {
    EditText sdt, name;
    SqlHelper sqlHelper;
    Button ok;
    Button back;
    List<contect> contects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themsdt);
        sdt = findViewById(R.id.sdt);
        name = findViewById(R.id.name);
        ok = findViewById(R.id.ok);
        back = findViewById(R.id.back);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String kq = bundle.getString("kq");
            sdt.setText(kq);
        }

        sqlHelper = new SqlHelper(this);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mName = name.getText().toString();
                String mSdt = sdt.getText().toString();
                contect contect = new contect(mName, mSdt);
                contects.add(contect);
                sqlHelper.insertSdt(contect);

                clearData();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }

    private void clearData() {
        name.setText("");
        sdt.setText("");
    }
}