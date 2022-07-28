package com.example.trabalho2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class Adapter extends BaseAdapter {

    private Context context;
    private ArrayList<String> textoDialog;
    private EditText editText;
    private DialogInsert dialogInsert;

    public Adapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return textoDialog.size();
    }

    @Override
    public Object getItem(int position) {
        return textoDialog.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DialogInsert dialogInsert = new DialogInsert();
        textoDialog.add(dialogInsert.getItens().toString());
        String itemDialog = textoDialog.get(position);
        @SuppressLint("ViewHolder") View view = LayoutInflater.from(context).inflate(R.layout.adapter,parent,false);
        TextView textView = (TextView) view.findViewById(R.id.text);
        textView.setText(itemDialog);
        return view;
    }
}
