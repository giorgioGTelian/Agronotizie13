package com.example.agronotizie13;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.os.Bundle;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        webView.getSettings().setBlockNetworkLoads(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://agronotizie.imagelinenetwork.com/");
        webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);



    }


}
