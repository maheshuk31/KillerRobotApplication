package com.example.maheshuk31.killerrobotapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private ImageView imgRobot;
    private TextView txtIntroduction;
    private Button btnFeedback, btnAboutUs, btnScienceGallery, btnKingsRobotics;
    private ImageButton imgBtnAntenna, imgBtnScanner, imgBtnPowerCore, imgBtnLaser, imgBtnLeg, imgBtnHand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgRobot = (ImageView) findViewById(R.id.imgRobot);


        txtIntroduction = (TextView) findViewById(R.id.txtIntroduction);

        imgBtnAntenna = (ImageButton) findViewById(R.id.imgBtnAntenna);
        imgBtnAntenna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AntennaActivity.class);
                startActivity(intent);
            }
        });

        imgBtnScanner = (ImageButton) findViewById(R.id.imgBtnScanner);
        imgBtnScanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScannerActivity.class);
                startActivity(intent);
            }
        });

        imgBtnPowerCore = (ImageButton) findViewById(R.id.imgBtnPowerCore);
        imgBtnPowerCore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PowerCoreActivity.class);
                startActivity(intent);
            }
        });

        imgBtnLaser = (ImageButton) findViewById(R.id.imgBtnLaser);
        imgBtnLaser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LaserActivity.class);
                startActivity(intent);
            }
        });

        imgBtnLeg = (ImageButton) findViewById(R.id.imgBtnLeg);
        imgBtnLeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LegActivity.class);
                startActivity(intent);
            }
        });

        imgBtnHand = (ImageButton) findViewById(R.id.imgBtnHand);
        imgBtnHand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HandActivity.class);
                startActivity(intent);
            }
        });




        btnScienceGallery = (Button) findViewById(R.id.btnScienceGallery);
        btnScienceGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScienceGalleryActivity.class);
                startActivity(intent);
            }
        });

        btnKingsRobotics = (Button) findViewById(R.id.btnKingsRobotics);
        btnKingsRobotics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://nms.kcl.ac.uk/core/";
                startActivity( new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url)));
            }
        });

        btnFeedback = (Button) findViewById(R.id.btnFeedback);
        btnFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FeedbackActivity.class);
                startActivity(intent);
            }
        });

        btnAboutUs = (Button) findViewById(R.id.btnAboutUs);
        btnAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
