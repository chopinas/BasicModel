package com.pzy.chopin.basicmodel.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pzy.chopin.basicmodel.MyDecoration;
import com.pzy.chopin.basicmodel.R;
import com.pzy.chopin.basicmodel.adapter.RecyclerViewAdapter;

/**
 * Created by Chopin on 2017/8/12.
 */

public class FragmentC extends Fragment {

    RecyclerView recyclerView;

    RecyclerViewAdapter adapter;

    RecyclerView.LayoutManager layoutmanager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.c,container,false);
        init(v);
        return v;
    }

    private void init(View v) {
        recyclerView=(RecyclerView) v.findViewById(R.id.recyclerview_c);
        adapter=new RecyclerViewAdapter(getContext(),3);
        layoutmanager=new LinearLayoutManager(getContext());

        recyclerView.setLayoutManager(layoutmanager);

        recyclerView.setAdapter(adapter);
        recyclerView.addItemDecoration(new MyDecoration(getContext(), MyDecoration.VERTICAL_LIST));
    }
}
