package com.vivekvix.rfordatascience;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Chapter1, tips2, tips3, tips4, tips5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Chapter1 = (Button)findViewById(R.id.tips1);
        Chapter1.setOnClickListener(new OnClickListener() {

       // get our html content
        String htmlAsString = getString(R.string.html);      // used by WebView
        //Spanned htmlAsSpanned = Html.fromHtml(htmlAsString); // used by TextView

        // set the html content on a TextView
       // TextView textView = (TextView) findViewById(R.id.textView);
      //  textView.setText(htmlAsSpanned);

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadDataWithBaseURL(null, htmlAsString, "text/html", "utf-8", null);
            
            
            
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(MainActivity.this, chapter1.class);
                startActivity(i);

            }
        });

    }
}
