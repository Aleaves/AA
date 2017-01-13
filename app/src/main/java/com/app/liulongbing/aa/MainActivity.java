package com.app.liulongbing.aa;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView mWebView;
    @SuppressLint("JavascriptInterface")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebView = (WebView) findViewById(R.id.webview);

        mWebView.getSettings().setJavaScriptEnabled(true);

        mWebView.addJavascriptInterface(new Contact(),"deviceready");

        mWebView.loadUrl("http://116.228.21.162:29014/bcsres/www/propagationTest/test.html");


    }

    private class Contact{
        public void share(){
            Log.i("=========","share");
        }

        public void getLocation(){
            Log.i("==========","getLocation");
        }
    }

}
