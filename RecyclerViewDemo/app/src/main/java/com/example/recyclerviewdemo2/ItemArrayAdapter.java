package com.example.recyclerviewdemo2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemArrayAdapter
        extends RecyclerView.Adapter <ItemArrayAdapter.ViewHolder> {
    private int listItemLayout;
    private ArrayList<Item> itemList;

    public ItemArrayAdapter(int listItemLayout, ArrayList<Item> itemList) {
        this.listItemLayout = listItemLayout;
        this.itemList = itemList;
    }

    @Override
    public int getItemCount(){
        return itemList == null ? 0 : itemList.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int ViewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(listItemLayout, parent, false);
        ViewHolder myViewHolder = new ViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int listPosition){
        TextView item = holder.item;
        item.setText(itemList.get(listPosition).getName());
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView item;

        public ViewHolder(View itemView){
            super(itemView);
            item = itemView.findViewById(R.id.row_item);
        }
    }
}
