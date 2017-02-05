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
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private ImageView imgRobot;
    private Switch switchTarget;
    private TextView txtIntroduction;
    private Button btnFeedback, btnAboutUs, btnScienceGallery, btnKingsRobotics;
    private ImageButton imgBtnAntenna, imgBtnScanner, imgBtnPowerCore, imgBtnLaser, imgBtnLeg, imgBtnHand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgRobot = (ImageView) findViewById(R.id.imgRobot);


        txtIntroduction = (TextView) findViewById(R.id.txtIntroduction);
        txtIntroduction.setText("With technology era in full force it's no secret robots are a pivotal part " +
                "in the \"success\"  this era has reached and the prospect of what we might be achieving" +
                "in the future. And coming to the 89th anniversary of the first robot created in the UK back for" +
                "people to view and educate on, we introduce [NAME] taking actual robotic parts to try and enslave" +
                "humanity. "
                 + "\n" +
                "Welcome to the current and future of robotics");

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

        switchTarget = (Switch) findViewById(R.id.switchTargets);
        switchTarget.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked==true){
                    imgBtnAntenna.setAlpha(0.8f);imgBtnHand.setAlpha(0.8f);imgBtnLaser.setAlpha(0.8f);
                    imgBtnLeg.setAlpha(0.8f);imgBtnPowerCore.setAlpha(0.8f);imgBtnScanner.setAlpha(0.8f);
                }
                else if(isChecked==false){
                    imgBtnAntenna.setAlpha(0f);imgBtnHand.setAlpha(0f);imgBtnLaser.setAlpha(0f);
                    imgBtnLeg.setAlpha(0f);imgBtnPowerCore.setAlpha(0f);imgBtnScanner.setAlpha(0f);
                }
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
