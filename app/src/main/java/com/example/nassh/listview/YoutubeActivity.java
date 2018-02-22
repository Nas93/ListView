package com.example.nassh.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class YoutubeActivity extends AppCompatActivity {

    WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        String url = "https://m.youtube.com/";
        w = findViewById(R.id.web);
        w.getSettings().setJavaScriptEnabled(true);
        w.loadUrl(url);
    }
}
