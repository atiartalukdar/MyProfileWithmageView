package com.example.administrator.myprofilewithmageview;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Talukdar on 10/17/2015.
 */
public class WebApplicationView extends WebViewClient {

    public boolean shouldOverrightOverloading(WebView view,String url) {
        if (Uri.parse(url).getHost().endsWith("45.64.132.40/index.php/master/enter_login")) {
            return false;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}