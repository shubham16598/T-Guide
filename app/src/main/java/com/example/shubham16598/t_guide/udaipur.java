package com.example.shubham16598.t_guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class udaipur extends AppCompatActivity {
WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udaipur);
        w = (WebView)findViewById(R.id.webview2);
        w.setWebViewClient(new WebViewClient());
        w.loadUrl("http://www.udaipurplus.com/travel/visit-in-udaipur.htm");
    }
}
