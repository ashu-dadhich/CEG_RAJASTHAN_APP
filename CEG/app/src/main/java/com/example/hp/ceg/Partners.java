package com.example.hp.ceg;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Partners extends AppCompatActivity {

    ImageView img,img1,img2,img3,img4,img5,img6;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.partners);


        img = (ImageView) findViewById(R.id.logoId);
        img1 = (ImageView) findViewById(R.id.logoId1);
        img2 = (ImageView) findViewById(R.id.logoId2);
        img3 = (ImageView) findViewById(R.id.logoId3);
        img4 = (ImageView) findViewById(R.id.logoId4);
        img5 = (ImageView) findViewById(R.id.logoId5);
        img6 = (ImageView) findViewById(R.id.logoId6);


        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String url = "http://ceg.rajasthan.gov.in";
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        img1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String url = "http://ceg.rajasthan.gov.in";
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String url = "http://ceg.rajasthan.gov.in";
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String url = "http://ceg.rajasthan.gov.in";
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String url = "http://ceg.rajasthan.gov.in";
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String url = "http://ceg.rajasthan.gov.in";
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String url = "http://ceg.rajasthan.gov.in";
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}