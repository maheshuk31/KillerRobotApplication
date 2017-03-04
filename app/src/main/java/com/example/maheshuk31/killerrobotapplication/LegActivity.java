package com.example.maheshuk31.killerrobotapplication;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class LegActivity extends AppCompatActivity {

    private TextView txtLegTextPt1, txtLegTextPt2, txtLegTextPt3;
    private ImageButton imgBtnLegVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg);

        txtLegTextPt1 = (TextView) findViewById(R.id.txtLegTextPt1);
        txtLegTextPt2 = (TextView) findViewById(R.id.txtLegTextPt2);
        txtLegTextPt3 = (TextView) findViewById(R.id.txtLegTextPt3);
        imgBtnLegVideo = (ImageButton) findViewById(R.id.imgBtnLegVideo);

        String stringHandPt1 =
                "<B><U>Uses:</U></B> <I>Flexible Invasive Surgery Tool</I>" +
                        "<BR/>" +
                        "<B><U>Applications:</U></B> <I>Stiff-Flop Tool</I>" +
                        "<BR/>" +
                        "<BR/>" +
                        "Under the guidance of Centre for Robotics Research at King's College London " +
                        "leading European scientists and medical doctors in creating a minimal invasive " +
                        "surgery tool to go through a patients body through all the narrow openings " +
                        "to get to the place that requires attention.";

        String stringHandPt2 =
                "Mimicking that of the animal an Octopus's tentacle Stiff-Flop aims to be fully " +
                        "manipulated via its' movement, stiffness and deformity; giving the ability " +
                        "to tackle any situation. A soft robotic arm will be the key part fitting into " +
                        "being able to squeeze through 12mm diameter Trocar-port.";

        String stringHandPt3 =
                "Current plans have reached the stage of successfully operating on a human body " +
                        "with plans to release into the medical field potentially in the near future.";

        Spanned stringHandHTMLPt1 = Html.fromHtml(stringHandPt1);
        Spanned stringHandHTMLPt2 = Html.fromHtml(stringHandPt2);
        Spanned stringHandHTMLPt3 = Html.fromHtml(stringHandPt3);

        txtLegTextPt1.setText(stringHandHTMLPt1);
        txtLegTextPt2.setText(stringHandHTMLPt2);
        txtLegTextPt3.setText(stringHandHTMLPt3);

        imgBtnLegVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outclickYoutube("XMVjn7bpF-Q");
            }
        });

    }

    public void outclickYoutube(String id){
        Intent applicationIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + id));
        Intent websiteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=" + id));
        try {
            startActivity(applicationIntent);
        } catch (ActivityNotFoundException e) {
            startActivity(websiteIntent);
        }
    }

}
