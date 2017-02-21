package com.example.shubham16598.t_guide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class agra extends AppCompatActivity {
    WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agra);
        w=(WebView)findViewById(R.id.webview4);
        w.setWebViewClient(new WebViewClient());
        w.loadUrl("http://www.transindiatravels.com/uttar-pradesh/agra/tourist-places-to-visit-in-agra");
    }
}
