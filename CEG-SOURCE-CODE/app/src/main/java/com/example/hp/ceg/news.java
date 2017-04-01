package com.example.hp.ceg;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class news extends AppCompatActivity {
    String[] news = {
            "",
            "",
            "",
            "",
            ""
    };
    List<String> news_links = new ArrayList<String>();
    String temp1 = "";
    ListView listView;
    //  ListView listView1;
    Button b;
    String url = "http://ceg.rajasthan.gov.in/details.aspx?id=120";
    ProgressDialog mProgressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        new Title().execute();
        b = (Button) findViewById(R.id.news_btn);
        listView = (ListView) findViewById(R.id.news_list);
//        listView1=(ListView) findViewById(R.id.news_list1);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Title().execute();
            }
        });
        //setListAdapter(new ArrayAdapter<List<String>>(this,android.R.layout.simple_list_item_1));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String url = news_links.get(position).toString();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                //i.putExtra("KeyLink",url);
                startActivity(i);
            }
        });
    }
    // Title AsyncTask
    private class Title extends AsyncTask<Void, Void, Void> {
        String title = "";

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressDialog = new ProgressDialog(news.this);
            mProgressDialog.setTitle("CEG");
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setIndeterminate(false);
            mProgressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {
            int start_index, end_index;
            try {
                int counter = 0;
                Document doc = Jsoup.connect(url).get();
                Elements trs = doc.select("fl_right.table tr");

                //remove header row
                trs.remove(0);

                for (Element tr : trs) {
                    if (counter > 4) {
                        break;
                    }
                    Elements tds = tr.getElementsByTag("td");
                    Elements links = tds.select("a[href]");
                    for (Element link : links) {
                        String temp = link.toString();
                        start_index = temp.indexOf('"');
                        end_index = temp.indexOf('>');
                        temp1 = temp.substring(start_index + 1, end_index - 17);
                        news_links.add("http://www.uniraj.ac.in" + temp1);
                    }
                    Element td = tds.first();
                    title = td.text().toString();
                    news[counter] = title;
                    counter++;
                    //System.out.println("Blog: " + td.text());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(news.this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, news);
            listView.setAdapter(adapter);
//            ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(News_events.this,
//                    android.R.layout.simple_list_item_1, android.R.id.text1, news_links);
//            listView1.setAdapter(adapter1);
            mProgressDialog.dismiss();
        }
    }
}
