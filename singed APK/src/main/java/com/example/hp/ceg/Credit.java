package com.example.hp.ceg;

import android.app.Fragment;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


public class Credit extends More {
    ImageView i1;
    TextView t1,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credit);
        i1=(ImageView)findViewById(R.id.imageView2);
        t1=(TextView)findViewById(R.id.textView23);

     }}
