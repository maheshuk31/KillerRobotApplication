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

/**
 * Page about the robot's power core loads when clicking the target on the power core of the robot
 * on the MainActivity.
 */
public class PowerCoreActivity extends AppCompatActivity {

    private TextView txtPowerCoreTextPt1, txtPowerCoreTextPt2, txtPowerCoreTextPt3;
    private ImageButton imgBtnPowerCoreVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power_core);

        txtPowerCoreTextPt1 = (TextView) findViewById(R.id.txtPowerCoreTextPt1);
        txtPowerCoreTextPt2 = (TextView) findViewById(R.id.txtPowerCoreTextPt2);
        txtPowerCoreTextPt3 = (TextView) findViewById(R.id.txtPowerCoreTextPt3);
        imgBtnPowerCoreVideo = (ImageButton) findViewById(R.id.imgBtnPowerCoreVideo);

        String stringHandPt1 =
                "<B><U>Uses:</U></B> <I>Providing Electricity Power</I>" +
                        "<BR/>" +
                        "<B><U>Applications:</U></B> <I>Multiple spacecrafts and satellites</I>" +
                        "<BR/>" +
                        "<BR/>" +
                        "Space is vast and research takes time so the conjunction of the two a key element of " +
                        "generating the electricity it needs to be able to run a spacecraft for quite a while " +
                        "and this is what a Radioisotope Thermoelectric Generator is capable of doing.";

        String stringHandPt2 =
                "Using the power of radioactive material such as Plutonium and Uranium they generate  " +
                        "heat converting into electricity by an array of thermocouples. This is not like " +
                        "technique we have via nuclear power plants which is nuclear fission but rather  " +
                        "a more steadier and smaller technique of providing power. The longevity with " +
                        "regards to Plutonium is a decays with a half-life of 87.7 years, which is why " +
                        "Voyager 1 the farthest man made object has still functioning instruments.";

        String stringHandPt3 =
                "With the requirement of nuclear elements one could say that this is unsafe and " +
                        "very harmful however Radioisotope Thermoelectric Generator are designed in " +
                        "such a way that the radio active material is sealed within a radiation-proof " +
                        "shell so if something does go wrong none of the radioactive particles will escape.";

        Spanned stringHandHTMLPt1 = Html.fromHtml(stringHandPt1);
        Spanned stringHandHTMLPt2 = Html.fromHtml(stringHandPt2);
        Spanned stringHandHTMLPt3 = Html.fromHtml(stringHandPt3);

        txtPowerCoreTextPt1.setText(stringHandHTMLPt1);
        txtPowerCoreTextPt2.setText(stringHandHTMLPt2);
        txtPowerCoreTextPt3.setText(stringHandHTMLPt3);

        imgBtnPowerCoreVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outclickYoutube("lTB6Su4ciNc");
            }
        });
    }

    /**
     * Used to intent the process of pressing the image button leading to the video, it provides both
     * cases where the user may not have the YouTube application, in which case it opens via a web
     * browser, or it will default open on the application if installed.
     *
     * @param id The ID part of the URL of any YouTube video.
     */
    public void outclickYoutube(String id) {
        Intent applicationIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + id));
        Intent websiteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=" + id));
        try {
            startActivity(applicationIntent);
        } catch (ActivityNotFoundException e) {
            startActivity(websiteIntent);
        }
    }

}
