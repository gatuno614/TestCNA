package com.example.felix.testcna;

/**
 * Created by felix on 21/05/2015.
 */
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by felix on 21/05/2015.
 */
public class enlaceFace extends Activity {
    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enlace_face);

        wv = (WebView) findViewById(R.id.webView2);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setBuiltInZoomControls(true);
        wv.loadUrl("https://m.facebook.com/pages/Centro-Norteamericano/422048447901097");
    }
}