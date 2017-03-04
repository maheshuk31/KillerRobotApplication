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

public class LaserActivity extends AppCompatActivity {

    private TextView txtLaserTextPt1, txtLaserTextPt2, txtLaserTextPt3;
    private ImageButton imgBtnLaserVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laser);

        txtLaserTextPt1 = (TextView) findViewById(R.id.txtLaserTextPt1);
        txtLaserTextPt2 = (TextView) findViewById(R.id.txtLaserTextPt2);
        txtLaserTextPt3 = (TextView) findViewById(R.id.txtLaserTextPt3);
        imgBtnLaserVideo = (ImageButton) findViewById(R.id.imgBtnLaserVideo);

        String brochureURL = "http://www.cyberknife.com/uploadedFiles/CyberKnife_Overview/500929.A_CyberKnife_Patient_Brochure_FINAL.pdf";
        String stringHandPt1 =
                "<B><U>Uses:</U></B> <I>Robotic Radiosurgery System</I>" +
                        "<BR/>" +
                        "<B><U>Applications:</U></B> <I>CyberKnife System</I>" +
                        "<BR/>" +
                        "<BR/>" +
                        "Invented by John R. Adler a professor at Stanford University for very accurate " +
                        "non-invasive surgery for treating patients with cancerous and/or non cancerous " +
                        "tumours located anywhere in the body all through a single workstation.";

        String stringHandPt2 =
                "Rather then having to ordeal with a potentially painful surgery, CyberKnife provides " +
                        "a painless, relaxing procedure to the specific part of a patient's body for where they " +
                        "need treatment. Considered to be the first robotic radiosurgery system in the world, " +
                        "is now available worldwide in many different countries after it's widely successful " +
                        "integration in the medicine field.";

        String stringHandPt3 =
                "According to their statistics as of December 2010 over 100,000 patients have gone under " +
                        "the laser to treat a multitude of treatable symptoms.";

        Spanned stringHandHTMLPt1 = Html.fromHtml(stringHandPt1);
        Spanned stringHandHTMLPt2 = Html.fromHtml(stringHandPt2);
        Spanned stringHandHTMLPt3 = Html.fromHtml(stringHandPt3);

        txtLaserTextPt1.setText(stringHandHTMLPt1);
        txtLaserTextPt2.setText(stringHandHTMLPt2);
        txtLaserTextPt3.setText(stringHandHTMLPt3);

        imgBtnLaserVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outclickYoutube("4EkFvuqbNGo");
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
