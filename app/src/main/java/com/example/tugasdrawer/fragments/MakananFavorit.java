
package com.example.tugasdrawer.fragments;

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

public class MakananFavorit extends Fragment implements AdapterList.ItemClickListener{

    private RecyclerView recyclerView;
    private AdapterList adapter;
    private List<DataItem> dataList;

    public MakananFavorit() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_makanan_favorit, container, false);

        recyclerView = view.findViewById(R.id.rvList3);
        dataList = new ArrayList<>();

        dataList.add(new DataItem("Lentog Tanjung", "8.5", R.drawable.lentog_tanjung));
        dataList.add(new DataItem("Nasi Pindang", "9.0", R.drawable.nasi_pindang));
        dataList.add(new DataItem("Sate Kerbau", "9.0", R.drawable.sate_kerbau));
        dataList.add(new DataItem("Kuwut Parijoto", "8.0", R.drawable.kuwut_parijoto));
        dataList.add(new DataItem("Wedang Blung", "8.5", R.drawable.wedang_blung));

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
