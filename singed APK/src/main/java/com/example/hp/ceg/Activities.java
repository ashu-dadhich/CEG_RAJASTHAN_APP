package com.example.hp.ceg;

import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

public class Activities extends AppCompatActivity {
    GridView gridView;
    String[] strings = {
            "CMAT",
            "RMCAAT",
            "BHMCT",
            "IGNOU",
            "e Yantra",
            "RSDLC",
            "One day training"

    };
    int[] img = {
            R.drawable.d1,
            R.drawable.pg2,
            R.drawable.pg3,
            R.drawable.pg4,
            R.drawable.ey1,
            R.drawable.rsldc2,
            R.drawable.sumt,


    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activities);
        gridView = (GridView)findViewById(R.id.gridView);
        CustomGrid adapter = new CustomGrid(Activities.this, strings,img);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){
                    String url = "http://cmat-raj.org";
                    Intent intent = new Intent();
                    intent.setAction(intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                else if (position == 1){
                    String url = "http://www.rmcaatonline.com";

                    Intent intent = new Intent();
                    intent.setAction(intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if (position == 2){
                    String url = "http://bhmct-raj.com";

                    Intent intent = new Intent();
                    intent.setAction(intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if (position == 3){
                    String url = "http://ceg.rajasthan.gov.in?ShowResult.aspx";

                    Intent intent = new Intent();
                    intent.setAction(intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);

                }
                if (position == 4) {
                    String url = "http://ceg.rajasthan.gov.in/details.aspx?id=112";

                    Intent intent = new Intent();
                    intent.setAction(intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                if (position == 5){
                    String url = "http://ceg.rajasthan.gov.in/details.aspx?id=90";

                    Intent intent = new Intent();
                    intent.setAction(intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);

                }
                if (position == 6) {
                    String url = "http://ceg.rajasthan.gov.in/details.aspx?id=114";

                    Intent intent = new Intent();
                    intent.setAction(intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
            };

        });


    }
}