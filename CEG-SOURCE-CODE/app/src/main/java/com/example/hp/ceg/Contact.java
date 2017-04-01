package com.example.hp.ceg;



import android.app.Fragment;
import android.app.ListFragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Contact extends Fragment{
    String num[] = {

            "tel:0141-2702344",
            "tel:9855997791"
    };
    ListView list;
    String c[] = {


            "\t 1.Centre For E-Governence office\tContact No:\n" +
                    "0141-2702344",

            "\t 2.Deepak Gupta\tContact No:\n" +
                    "9855997791",
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.contact, container, false);
        list = (ListView) v.findViewById(R.id.list);
        Customlist adapter = new Customlist(getActivity(), c);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getActivity(), "Calling", Toast.LENGTH_SHORT).show();
                String temp=num[position];
                Uri number = Uri.parse(temp);
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });
        return v;
    }
}

