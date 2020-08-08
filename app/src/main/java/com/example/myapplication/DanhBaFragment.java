package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.DanhbaBinding;

import java.util.ArrayList;
import java.util.List;

public class DanhBaFragment extends Fragment {
    DanhbaBinding danhbaBinding;
    Adrapter adapter;

    SqlHelper sqlHelper;
    List<contect> contects = new ArrayList<>();

    public static DanhBaFragment newInstance() {
        Bundle bundle = new Bundle();
        DanhBaFragment danhBaFragment = new DanhBaFragment();
        danhBaFragment.setArguments(bundle);
        return danhBaFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        danhbaBinding = DataBindingUtil.inflate(inflater, R.layout.danhba, container, false);
        sqlHelper = new SqlHelper(getContext());
        contects =  sqlHelper.getAllContect();
        adapter = new Adrapter(contects);
        danhbaBinding.rcDanhBa.setAdapter(adapter);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext(), 1, RecyclerView.VERTICAL, false);
        danhbaBinding.rcDanhBa.setLayoutManager(layoutManager);
        return danhbaBinding.getRoot();
    }
}

