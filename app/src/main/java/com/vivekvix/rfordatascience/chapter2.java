package com.vivekvix.rfordatascience;


import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.os.Bundle;
import android.webkit.WebView;

public class chapter2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter2);

        String htmlAsString = getString(R.string.html);      // used by WebView
        //Spanned htmlAsSpanned = Html.fromHtml(htmlAsString); // used by TextView

        // set the html content on a TextView
        // TextView textView = (TextView) findViewById(R.id.textView);
        //  textView.setText(htmlAsSpanned);


        WebView webView = (WebView) findViewById(R.id.webView);
        //     webView.setWebViewClient(new MyBrowser());
        //webView.getSettings().setJavaScriptEnabled(true);
        webView.loadDataWithBaseURL("",htmlAsString,"text/html", "utf-8", "");
      //     webView.loadData("<html>..sfsdfsfsdfsdfsd.</html" , "text/html", "UTF-8");
        //  webView.loadData("<html>..sfsdfsfsdfsdfsd.</html>", "text/html; charset=utf-8", "UTF-8")
        //webView.loadUrl("http://www.tutorialspoint.com");



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_chapter2, menu);
        return true;
    }


}
