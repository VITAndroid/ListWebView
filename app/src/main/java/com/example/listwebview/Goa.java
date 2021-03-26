package com.example.listwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Goa extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa);
        webView = (WebView) findViewById(R.id.webview03);
        String about = "<html> <body> <center><h2>Goa</h2> "+
                "<img src=https://static-blog.treebo.com/wp-content/uploads/2018/06/Goa.jpg width=\"250\" height=\"250\"> </center>" +
                "<p>Goa boasts flawless beaches and mesmerizing sunsets. It is known for its local cuisine, especially seafood. There are a lot of water sports activities held here. Stroll through Goa to marvel at its Portuguese churches and diverse landscapes. It is also one of the smallest states in India and easy to fully explore.</p>"+
                "</body> </html>";
        webView.loadData(about, "text/html", "UTF-8");
    }
}