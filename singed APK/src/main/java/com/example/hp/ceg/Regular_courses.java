package com.example.hp.ceg;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Regular_courses extends MainActivity {
    ListView listView;
    TextView t1,t2;
    int click_counter1 = 0;
    String[] s = {
            "1.Summer Training . ",
            "2. FDP Details ",
            "3. Regular Training Details. ",
    };

    String[] link = new String[]{"http://ceg.rajasthan.gov.in/B.Tech_Industrial_Oriented_Summer_Training_Jaipur.html",
            "http://ceg.rajasthan.gov.in",
            "http://ceg.rajasthan.gov.in/Courses.aspx",
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regular_courses);
        listView = (ListView)findViewById(R.id.listView);
        ArrayAdapter arrayAdapter = new ArrayAdapter(Regular_courses.this,android.support.v7.appcompat.R.layout.support_simple_spinner_dropdown_item,s);
        listView.setAdapter(arrayAdapter);
        showList();
        t1 = (TextView) findViewById(R.id.textView);
        t2 = (TextView) findViewById(R.id.textView2);
        textClick();
    }
    public void textClick() {

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click_counter1 == 0) {
                    t2.setText("\t\t< php \n"+
                            "\t < Linux \n" + "\t < C Language \n" + "\t < Advance C \n"+ "\t < C++ \n"
                            + "\t < Advance C++  \n"+ "\t < Core Java \n"+ "\t < Advance java \n" + "\t < CCNA"+ "\t < Android \n"



                    );
                    click_counter1=1;
                }
                else{
                    t2.setText("");
                    click_counter1=0;
                }
            }
        });}

    public void showList(){

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String url = link[position];
                Intent intent = new Intent(Regular_courses.this, MyWebView.class);
                intent.putExtra("KeyLink", url);
                startActivity(intent);
            }
        });
    }


}


















