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

public class Faculty extends Fragment {
    ListView list;
    String c[] = {
            "1.Alok Mathur \n" +
                    "C Lang,C++,Core Jave,Advance Java,Android",
            "2.Yogesh Sharma \n" +
                    "Advance web client side technology,ASP.NET,MVC Using Razor,Java script,J-query,Angular JS",
            "3.Ravindra Kumar Swami \t" +
                    "CCNA/CCNA Security",
            "4.Rakesh Soni \n" +
                    "Auto-CAD",
            "5.Manindra Singh Bhui\n" +
                    "Linux,PHP Using MYSQL,REDHAT,Bigdata,Hadoop",
            "6. Vikram Singh Rathore\n" +
                    "Oracle,RS-CIT",


    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.faculty, container, false);
        list = (ListView) v.findViewById(R.id.list);
        Facul_list adapter = new Facul_list(getActivity(), c);
        list.setAdapter(adapter);


        return v;

    }
}
