package com.example.administrator.myprofilewithmageview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
String facebook = "http://www.facebook.com/atiartalukder";
    String googlePlus = "https://plus.google.com/101964313154309150953/posts";
    String twitter = "https://twitter.com/atiartalukdar";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void facebook(View view){
        Uri webPage = Uri.parse(facebook);
        Intent intent = new Intent(Intent.ACTION_VIEW,webPage);
        startActivity(intent);
    }
    public void googleplus(View view){
        Uri webPage = Uri.parse(googlePlus);
        Intent intent = new Intent(Intent.ACTION_VIEW,webPage);
        startActivity(intent);
    }
    public void twitter(View view){
        Uri webPage = Uri.parse(twitter);
        Intent intent = new Intent(Intent.ACTION_VIEW,webPage);
        startActivity(intent);
    }












    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
