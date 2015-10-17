package com.example.administrator.myprofilewithmageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class webView extends AppCompatActivity {
    public WebView openUrl;
    private String wSite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        wSite  = getIntent().getStringExtra("url");

        openUrl = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = openUrl.getSettings();
        webSettings.setJavaScriptEnabled(true);
        openUrl.loadUrl(wSite);
        openUrl.setWebViewClient(new WebApplicationView(){
            //			@Override
            //			public void onPageFinished(WebView view,String url){
            //				//hide loading image
            //				//findViewById(R.id.imageView1).setVisibility(View.GONE);
            //				//visible
            //				findViewById(R.id.webView1).setVisibility(View.VISIBLE);
            //			}

        });
    }



















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_web_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
