package com.example.trabalho2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class Adapter extends BaseAdapter {

    private Context context;
    private ArrayList<String> textoDialogList = new ArrayList<>();




    public Adapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return textoDialogList.size();
    }

    @Override
    public Object getItem(int position) {
        return textoDialogList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String itemDialog = textoDialogList.get(position);
        View view = LayoutInflater.from(context).inflate(R.layout.adapter, parent, false);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(itemDialog);
        return view;
    }

    public void insertItem(String item){
        Log.i(item, "item adapter");
        textoDialogList.add(item);
        notifyDataSetChanged();
    }
}
