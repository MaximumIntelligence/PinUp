package com.maximumintelligence.pinup;

import android.webkit.CookieManager;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;


public class PinUpWebView extends AppCompatActivity {

    public void onWebView() {

        WebView myWebView = new WebView(this);
        setContentView(myWebView);
        myWebView.loadUrl("https://pin-up.games/");

        CookieManager manager = CookieManager.getInstance();
        manager.setAcceptCookie(true);
    }
}
