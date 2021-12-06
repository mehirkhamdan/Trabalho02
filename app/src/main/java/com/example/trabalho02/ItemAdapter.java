package com.example.trabalho02;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends BaseAdapter {

    private List<String> itens = new ArrayList<>();
    private Context context;

    public ItemAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Object getItem(int position) {
        return itens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public int insertItem(String item) {
        itens.add(item);
        notifyDataSetChanged();
        return itens.size() - 1;
    }

    public void updateItem(int pos, String item) {
        itens.set(pos, item);
        notifyDataSetChanged();
    }

    public void removeItem(int pos) {
        itens.remove(pos);
        notifyDataSetChanged();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        @SuppressLint("ViewHolder") View view = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false);
        TextView textItem = view.findViewById(android.R.id.text1);
        textItem.setText(itens.get(position));

        return view;
    }

}
