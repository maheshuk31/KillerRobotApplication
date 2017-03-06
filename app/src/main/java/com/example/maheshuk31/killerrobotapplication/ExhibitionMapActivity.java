package com.example.maheshuk31.killerrobotapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Leads to the page of where it is a map of the exhibition that leads to each of the pages about
 * the robot if their corresponding images are tapped.
 */
public class ExhibitionMapActivity extends AppCompatActivity {

    private ImageButton imgBtnExhibitionAntenna, imgBtnExhibitionScanner, imgBtnExhibitionBody,
            imgBtnExhibitionLaser, imgBtnExhibitionLeg, imgBtnExhibitionArm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exhibition_map);

        imgBtnExhibitionAntenna = (ImageButton) findViewById(R.id.imgBtnExhibitionAntenna);
        imgBtnExhibitionAntenna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExhibitionMapActivity.this, AntennaActivity.class);
                startActivity(intent);
            }
        });

        imgBtnExhibitionScanner = (ImageButton) findViewById(R.id.imgBtnExhibitionScanner);
        imgBtnExhibitionScanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExhibitionMapActivity.this, ScannerActivity.class);
                startActivity(intent);
            }
        });

        imgBtnExhibitionBody = (ImageButton) findViewById(R.id.imgBtnExhibitionBody);
        imgBtnExhibitionBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExhibitionMapActivity.this, PowerCoreActivity.class);
                startActivity(intent);
            }
        });

        imgBtnExhibitionLaser = (ImageButton) findViewById(R.id.imgBtnExhibitionLaser);
        imgBtnExhibitionLaser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExhibitionMapActivity.this, LaserActivity.class);
                startActivity(intent);
            }
        });

        imgBtnExhibitionLeg = (ImageButton) findViewById(R.id.imgBtnExhibitionLeg);
        imgBtnExhibitionLeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExhibitionMapActivity.this, LegActivity.class);
                startActivity(intent);
            }
        });

        imgBtnExhibitionArm = (ImageButton) findViewById(R.id.imgBtnExhibitionArm);
        imgBtnExhibitionArm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ExhibitionMapActivity.this, HandActivity.class);
                startActivity(intent);
            }
        });
    }

}
