package com.example.listwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Kerala extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala);
        webView = (WebView) findViewById(R.id.webview01);
        String about= "<html> <body> <center><h2>Kerala</h2></center>" +
                "<p>Kerala is one of the prettiest states, rightfully dubbed ‘God’s Own Country’. " +
                "Here you will find pristine beaches at Kovalam, Muzhappilangad and Varkala. " +
                "Besides beaches, the state also has a plethora of historical monuments, " +
                "enthralling waterfalls and some breathtaking hill stations. " +
                "There are also plenty of ecotourism drives conducted to promote sustainable tourism.</p>"+
                " <ul> <h3>Places to Visit in Kerala</h3> " +
                "<li><b> Alleppey:</b> Dubbed the ‘Venice of the East’, Alleppey has many backwater channels interconnected in the city where you can rent houseboats. </li> </br> " +
                "<li><b> Munnar:</b> Known for its tea plantations, Munnar is one of the most visited hill stations in Kerala.  </li> </ul>"+
                "</body> </html>";
        webView.loadData(about,"text/html","UTF-8");
    }
}