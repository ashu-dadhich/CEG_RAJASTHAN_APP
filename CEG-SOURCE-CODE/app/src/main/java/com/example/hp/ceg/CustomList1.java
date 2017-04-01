package com.example.hp.ceg;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Vandana Gandhi on 7/12/2016.
 */

public class CustomList1 extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] web;

    public CustomList1(Activity context,
                       String[] web) {
        super(context, R.layout.list1_row, web);
        this.context = context;
        this.web = web;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list1_row, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        txtTitle.setText(web[position]);
        ImageView im=(ImageView) rowView.findViewById(R.id.img);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri number = Uri.parse("tel:123456789");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                //startActivity(callIntent);
            }
        });
        return rowView;
    }
}
