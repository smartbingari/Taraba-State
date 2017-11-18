package com.smartbingari.tarabastate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void news (View view) {
        startActivity(new Intent(MainActivity.this, NewsActivity.class));
    }
    public void overview (View view) {
        startActivity(new Intent(MainActivity.this, OverviewActivity.class));
    }
    public void history (View view) {
        startActivity(new Intent(MainActivity.this, ScrollingActivity.class));
    }
    public void gov (View view) {
        startActivity(new Intent(MainActivity.this, Governemts.class));
    }
    public void geo (View view) {
        startActivity(new Intent(MainActivity.this, Geo.class));
    }
    public void tourist (View view) {
        startActivity(new Intent(MainActivity.this, Tourist.class));
    }
    public void culture (View view) {
        startActivity(new Intent(MainActivity.this, Culture.class));
    }
    public void agric (View view) {
        startActivity(new Intent(MainActivity.this, Agric.class));
    }
    public void sites (View view) {
        startActivity(new Intent(MainActivity.this, WebSites.class));
    }
    public void schools (View view) {
        startActivity(new Intent(MainActivity.this, Schools.class));
    }
    public void hotels (View view) {
        startActivity(new Intent(MainActivity.this, Hotels.class));
    }
    public void lga (View view) {
        startActivity(new Intent(MainActivity.this, LGA.class));
    }
    public void about (View view) {
        startActivity(new Intent(MainActivity.this, About.class));
    }
    public void events (View view) {
        startActivity(new Intent(MainActivity.this, Events.class));
    }
    public void chat (View view) {
        startActivity(new Intent(MainActivity.this, OverviewActivity.class));
    }
    public void jobs (View view) {
        startActivity(new Intent(MainActivity.this, Jobs.class));
    }

    public void maps (View view) {
        startActivity(new Intent(MainActivity.this, MapsActivity.class));
    }


}
