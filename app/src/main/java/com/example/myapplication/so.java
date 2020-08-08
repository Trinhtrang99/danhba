package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivitySoBinding;

public class so extends AppCompatActivity implements View.OnClickListener {
    ActivitySoBinding activitySoBinding;
    String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_so);
        activitySoBinding = DataBindingUtil.setContentView(this, R.layout.activity_so);


        int[] idButtom = {R.id.so0, R.id.so1, R.id.so2, R.id.so3, R.id.so4, R.id.so5,
                R.id.so6, R.id.so7, R.id.so8, R.id.so9, R.id.sao, R.id.thang};
        for (int id : idButtom) {
            View v = (View) findViewById(id);
            v.setOnClickListener((View.OnClickListener) this);
        }

        activitySoBinding.them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),themsdt.class);
                intent.putExtra("kq",activitySoBinding.kq.getText().toString());
                startActivity(intent);
            }
        });

    }


    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.so0) {
            str = str + 0;

            activitySoBinding.kq.setText(str);
        } else if (view.getId() == R.id.so1) {
            str = str + 1;

            activitySoBinding.kq.setText(str);
        } else if (view.getId() == R.id.so2) {
            str = str + 3;

            activitySoBinding.kq.setText(str);
        } else if (view.getId() == R.id.so3) {
            str = str + 3;

            activitySoBinding.kq.setText(str);
        } else if (view.getId() == R.id.so4) {
            str = str + 4;

            activitySoBinding.kq.setText(str);
        } else if (view.getId() == R.id.so5) {
            str = str + 5;

            activitySoBinding.kq.setText(str);
        } else if (view.getId() == R.id.so6) {
            str = str + 6;

            activitySoBinding.kq.setText(str);
        } else if (view.getId() == R.id.so7) {
            str = str + 7;

            activitySoBinding.kq.setText(str);
        } else if (view.getId() == R.id.so8) {
            str = str + 8;

            activitySoBinding.kq.setText(str);
        } else if (view.getId() == R.id.so9) {
            str = str + 9;

            activitySoBinding.kq.setText(str);
        } else if (view.getId() == R.id.sao) {
            str = str + "*";

            activitySoBinding.kq.setText(str);
        } else if (view.getId() == R.id.thang) {
            str = str + "#";

            activitySoBinding.kq.setText(str);
        }
    }
}