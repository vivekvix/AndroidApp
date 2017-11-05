package com.vivekvix.rfordatascience;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Chapter1, Chapter2, tips3, tips4, tips5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Chapter1 = (Button)findViewById(R.id.tips1);
        Chapter1.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, chapter1.class);
                startActivity(i);

            }
        });


        Chapter2 = (Button)findViewById(R.id.tips2);
          Chapter2.setOnClickListener(new OnClickListener() {

        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            Intent i = new Intent(MainActivity.this, chapter2.class);
            startActivity(i);

        }
        });

        // get our html content


    }
}
