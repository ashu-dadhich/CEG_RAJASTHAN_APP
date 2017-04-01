package com.example.hp.ceg;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Facul_list extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] web;

    public Facul_list(Activity context,String[] web)
    {
        super(context, R.layout.list, web);
        this.context = context;
        this.web = web;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.facul_list, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        txtTitle.setText(web[position]);

        return rowView;
    }

}