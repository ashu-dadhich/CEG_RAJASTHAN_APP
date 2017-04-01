package com.example.hp.ceg;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;


import android.widget.GridView;

import android.content.Intent;


public class More extends MainActivity {
    GridView grid;
    String[] web = {
            "Credits",
            "Contact",
            "Faculty",
            "Map",


    };
    int[] imageId = {
            R.drawable.bcredit,
            R.drawable.bcontacta,
            R.drawable.bfacultya,
            R.drawable.bmap,

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more);
        // ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,R.layout.grid_single,web);

        Imageadapter imageadapter = new Imageadapter(More.this, web, imageId);
        grid = (GridView) findViewById(R.id.gridView);
        grid.setAdapter(imageadapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position==0) {
                    Intent intent = new Intent(More.this, Credit.class);
                    startActivity(intent);
                } if (position == 1) {
                    FragmentManager manager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = manager.beginTransaction();
                    Contact contact = new Contact();
                    fragmentTransaction.replace(android.R.id.content, contact);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else if (position == 2) {
                    FragmentManager manager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = manager.beginTransaction();
                    Faculty faculty = new Faculty();
                    fragmentTransaction.replace(android.R.id.content, faculty);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }else if (position==3){
                    double latitude = 26.876867;
                    double longitude = 75.820670;
                    String label = "Centre For Electronic Governence";
                    String uriBegin = "geo:" + latitude + "," + longitude;
                    String query = latitude + "," + longitude + "(" + label + ")";
                    String encodedQuery = Uri.encode(query);
                    String uriString = uriBegin + "?q=" + encodedQuery + "&z=20";
                    Uri uri = Uri.parse(uriString);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                //else if (position == 3) {
//                    FragmentManager manager = getFragmentManager();
//                    FragmentTransaction fragmentTransaction = manager.beginTransaction();
//                    Faculty faculty = new Faculty();
//                    fragmentTransaction.replace(android.R.id.content, faculty);
//                    fragmentTransaction.addToBackStack(null);
//                    fragmentTransaction.commit();
//
//
//                }


            }
        });
    }
}