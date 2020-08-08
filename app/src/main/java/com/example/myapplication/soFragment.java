package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.myapplication.databinding.ActivitySoBinding;

public class soFragment extends Fragment {
    String str = "";
    ActivitySoBinding activitySoBinding;
SqlHelper sqlHelper;
    public static soFragment newInstance() {
        Bundle bundle = new Bundle();
        soFragment activitySoBinding = new soFragment();
        activitySoBinding.setArguments(bundle);
        return activitySoBinding;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        activitySoBinding = DataBindingUtil.inflate(inflater, R.layout.activity_so, container, false);

        activitySoBinding.so0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        str += 0;
        activitySoBinding.kq.setText(str);
            }
        });
        activitySoBinding.so1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += 1;
                activitySoBinding.kq.setText(str);
            }
        });
        activitySoBinding.so2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += 2;
                activitySoBinding.kq.setText(str);
            }
        });
        activitySoBinding.so3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += 3;
                activitySoBinding.kq.setText(str);
            }
        }); activitySoBinding.so4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += 4;
                activitySoBinding.kq.setText(str);
            }
        }); activitySoBinding.so5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += 5;
                activitySoBinding.kq.setText(str);
            }
        }); activitySoBinding.so6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += 6;
                activitySoBinding.kq.setText(str);
            }
        }); activitySoBinding.so7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += 7;
                activitySoBinding.kq.setText(str);
            }
        }); activitySoBinding.so8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += 8;
                activitySoBinding.kq.setText(str);
            }
        }); activitySoBinding.so9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += 9;
                activitySoBinding.kq.setText(str);
            }
        }); activitySoBinding.sao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += "*";
                activitySoBinding.kq.setText(str);
            }
        });
        activitySoBinding.thang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str += "#";
                activitySoBinding.kq.setText(str);
            }
        });

        activitySoBinding.them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), themsdt.class);
                intent.putExtra("kq", activitySoBinding.kq.getText().toString());
                startActivity(intent);
            }
        });


        return activitySoBinding.getRoot();
    }


}
