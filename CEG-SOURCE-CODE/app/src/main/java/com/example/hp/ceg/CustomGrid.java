package com.example.hp.ceg;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomGrid extends BaseAdapter{
    private Context mContext;
    private final String[] string;
    private final int[] Imageid;

    public CustomGrid(Context c, String[] string , int[] Imageid ) {
        mContext = c;
        this.string = string;
        this.Imageid = Imageid;
    }



    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return string.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.customgrid, null);
            TextView textView = (TextView) grid.findViewById(R.id.textView);
            ImageView imageView = (ImageView)grid.findViewById(R.id.imageView);
            textView.setText(string[position]);
            imageView.setImageResource(Imageid[position]);
        } else {
            grid = (View) convertView;
        }

        return grid;
    }
}

