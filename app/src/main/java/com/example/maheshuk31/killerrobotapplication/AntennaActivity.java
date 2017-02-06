package com.example.maheshuk31.killerrobotapplication;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class AntennaActivity extends AppCompatActivity {

    private TextView txtAntennaTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antenna);

//        txtAntennaTitle = (TextView) findViewById(R.id.txtAntennaTitle);
//        Typeface typeFace = Typeface.createFromAsset(getAssets(),"fonts/disposabledroidbb.ttf");
//        txtAntennaTitle.setTypeface(typeFace);
    }

}
