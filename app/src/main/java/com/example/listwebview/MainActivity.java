package com.example.listwebview;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity {
    ListView list;
    String data[]={"About","Kerala ","Goa"};
    int pic[]={R.drawable.pic,R.drawable.pic1,R.drawable.pic2};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.listview);
        CustomAdapter  customAdapter = new  CustomAdapter (getApplicationContext(),data,pic);
        list.setAdapter(customAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        Intent intent00 = new  Intent(getBaseContext(), AboutActivity.class);
                        startActivity(intent00);
                        break;
                    case 1:
                        Intent intent01 = new  Intent(getBaseContext(), Kerala.class);
                        startActivity(intent01);
                        break;
                    case 2:
                        Intent intent10 = new Intent(getBaseContext(), Goa.class);
                        startActivity(intent10);
                        break;
                }
            }
        });
    }
}