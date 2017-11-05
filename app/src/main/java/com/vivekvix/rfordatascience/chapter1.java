package com.vivekvix.rfordatascience;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.TextView;

public class chapter1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1);
        String data = getIntent().getExtras().getString("keyName");
     //   String htmlAsString = getString(R.string.data);
        WebView webView = (WebView) findViewById(R.id.textView1);
        //     webView.setWebViewClient(new MyBrowser());
        //webView.getSettings().setJavaScriptEnabled(true);
        webView.loadDataWithBaseURL("",data,"text/html", "utf-8", "");
      //  final TextView mTextView = (TextView) findViewById(R.id.textView1);
      //  mTextView.setText(data);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_chapter1, menu);
        return true;
    }


}
