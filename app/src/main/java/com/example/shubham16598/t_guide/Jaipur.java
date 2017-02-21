package com.example.shubham16598.t_guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Jaipur extends AppCompatActivity {
WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaipur);
        w = (WebView)findViewById(R.id.webview1);
        w.setWebViewClient(new WebViewClient());
        w.loadUrl("http://www.suncityjodhpur.com/places-to-visit-in-jaipur/");
    }
}
