package com.example.tugasdrawer.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasdrawer.AdapterList;
import com.example.tugasdrawer.DataItem;
import com.example.tugasdrawer.R;

import java.util.ArrayList;
import java.util.List;

public class MakananKhas extends Fragment implements AdapterList.ItemClickListener{

    private RecyclerView recyclerView;
    private AdapterList adapter;
    private List<DataItem> dataList;

    public MakananKhas() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_makanan_khas, container, false);

        recyclerView = view.findViewById(R.id.rvList);
        dataList = new ArrayList<>();

        dataList.add(new DataItem("Lentog Tanjung", "8.5", R.drawable.lentog_tanjung));
        dataList.add(new DataItem("Nasi Jangkrik", "8.5", R.drawable.nasi_jangkrik));
        dataList.add(new DataItem("Nasi Pindang", "9.0", R.drawable.nasi_pindang));
        dataList.add(new DataItem("Soto Kudus", "8.8", R.drawable.soto_kudus));
        dataList.add(new DataItem("Tahu Kecap", "8.5", R.drawable.tahu_kecap));

        adapter = new AdapterList(dataList, getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}