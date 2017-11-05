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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    Button Chapter1, Chapter2, Chapter3, tips4, tips5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Chapter1 = (Button)findViewById(R.id.tips1);
        Chapter2 = (Button)findViewById(R.id.tips2);
        Chapter3 = (Button)findViewById(R.id.tips3);
        Chapter1.setOnClickListener(this);
        Chapter2.setOnClickListener(this);
        Chapter3.setOnClickListener(this);


     //   Chapter1 = (Button)findViewById(R.id.tips1);
    //    Chapter1.setOnClickListener(new OnClickListener() {
    //        @Override
    //        public void onClick(View arg0) {
                // TODO Auto-generated method stub
    //            Intent i = new Intent(MainActivity.this, chapter1.class);
    //            startActivity(i);
    //        }
    //    });


    //    Chapter2 = (Button)findViewById(R.id.tips2);
        //     Chapter2.setOnClickListener(new OnClickListener() {

    //    @Override
    //    public void onClick(View arg0) {
            // TODO Auto-generated method stub
    //        Intent i = new Intent(MainActivity.this, chapter2.class);
    //        startActivity(i);

    //    }
    //    });

        // get our html content


    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch(v.getId())
        {
            case R.id.tips1 :
                Toast.makeText(MainActivity.this,"tips1", 1000).show();
                String htmlAsString = getString(R.string.html);
                Intent i = new Intent(MainActivity.this, chapter1.class);
                i.putExtra("keyName",htmlAsString);
                startActivity(i);
                break;
            case R.id.tips2 :
                Toast.makeText(MainActivity.this,"tips2", 1000).show();
                String htmlAsString1 = getString(R.string.html1);
                Intent i1 = new Intent(MainActivity.this, chapter1.class);
                i1.putExtra("keyName",htmlAsString1);
                startActivity(i1);
                break;
            case R.id.tips3 :
                Toast.makeText(MainActivity.this,"tips3", 1000).show();
                break;


        }
    }
}
