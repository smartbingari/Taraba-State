package com.smartbingari.tarabastate;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class About extends AppCompatActivity {

    ImageView facebook;
    ImageView twitter;
    ImageView messenger;
    ImageView playstore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);





        ImageView facebook = (ImageView)findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://m.facebook.com/sbingari"));
                startActivity(intent);
            }
        });

        ImageView twitter = (ImageView)findViewById(R.id.twitter);
        twitter.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://twitter.com/sbingari"));
                startActivity(intent);
            }
        });


        ImageView messenger = (ImageView)findViewById(R.id.messenger);
        messenger.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://m.me/sbingari"));
                startActivity(intent);
            }
        });

        ImageView playstore = (ImageView)findViewById(R.id.playstore);
        playstore.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://play.google.com/store/apps/dev?id=8184729320277253133"));
                startActivity(intent);
            }
        });
    }
}
