package com.pzy.chopin.basicmodel.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pzy.chopin.basicmodel.R;

/**
 * Created by Chopin on 2017/8/12.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    int flag;

    public RecyclerViewAdapter(Context context,int flag){
        this.context=context;
        this.flag=flag;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        MyViewHolder vh=new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(flag==1){
            ((MyViewHolder)holder).tv.setText("A");
        }
        if(flag==2){
            ((MyViewHolder)holder).tv.setText("B");
        }
        if(flag==3){
            ((MyViewHolder)holder).tv.setText("C");
        }
        if(flag==4){
            ((MyViewHolder)holder).tv.setText("D");
        }

    }

    @Override
    public int getItemCount() {
        return 100;
    }

    public class  MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv=(TextView) itemView.findViewById(R.id.text);
        }
    }
}
