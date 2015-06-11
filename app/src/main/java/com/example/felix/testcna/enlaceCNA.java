package com.example.felix.testcna;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

/**
 * Created by felix on 21/05/2015.
 */
public class enlaceCNA extends Activity{
    private WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enlace_cna);

        wv = (WebView) findViewById(R.id.webViewCNA);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.getSettings().setBuiltInZoomControls(true);
        wv.loadUrl("http://www.centronorteamericano.es/");
    }
}
