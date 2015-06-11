package com.example.felix.testcna;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by felix on 21/05/2015.
 */
public class enlaceTwiter extends Activity {
    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enlace_twitter);

        wv = (WebView) findViewById(R.id.webView);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setBuiltInZoomControls(true);
        wv.loadUrl("https://mobile.twitter.com/CNdeEstudios");
    }
}
