package com.example.listwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        webView = (WebView) findViewById(R.id.webview00);
        /*String about = "<html> <body> <h2> Jayalalithaa Jayaram </h2> <p> (24 February 1948 – 5 December 2016)" +
                " was an Indian actress and politician who served five terms as the Chief Minister of Tamil Nadu," +
                " for over fourteen years between 1991 and 2016.</p> </body> </html>";
        webView.loadData(about, "text/html", "UTF-8");*/
        webView.loadUrl("https://www.treebo.com/blog/states-in-india/");
        webView.setWebViewClient(new WebViewClient());
    }
}