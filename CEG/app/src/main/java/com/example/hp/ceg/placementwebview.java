package com.example.hp.ceg;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by HP on 7/23/2016.
 */
public class placementwebview extends AppCompatActivity {
    WebView webView;
    String key;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.placementwebview);

        webView = (WebView) findViewById(R.id.webView1);
        ProgressDialog progress = new ProgressDialog(this);
        progress.setMessage("Connecting...");
        progress.show();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient() {
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false;
            }
        });
        key = getIntent().getStringExtra("KeyLink");
        webView.loadUrl(key);
    }
}


