package com.example.maheshuk31.killerrobotapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

public class LaserActivity extends AppCompatActivity {

    private TextView txtLaserText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laser);

        txtLaserText = (TextView) findViewById(R.id.txtLaserText);
        String brochureURL = "http://www.cyberknife.com/uploadedFiles/CyberKnife_Overview/500929.A_CyberKnife_Patient_Brochure_FINAL.pdf";
        String stringHand =
                "<B><U>Uses:</U></B> <I>Robotic Radiosurgery System</I>" +
                        "<BR/>" +
                        "<B><U>Applications:</U></B> <I>CyberKnife System</I>" +
                        "<BR/>" +
                        "<BR/>" +
                        "Invented by John R. Adler a professor at Stanford University for very accurate " +
                        "non-invasive surgery for treating patients with cancerous and/or non cancerous " +
                        "tumours located anywhere in the body all through a single workstation." +
                        "<BR/>" +
                        "Rather then having to ordeal with a potentially painful surgery, CyberKnife provides " +
                        "a painless, relaxing procedure to the specific part of a patient's body for where they " +
                        "need treatment. Considered to be the first robotic radiosurgery system in the world, " +
                        "is now available worldwide in many different countries after it's widely successful " +
                        "integration in the medicine field." +
                        "<BR/>" +
                        "According to their statistics as of December 2010 over 100,000 patients have gone under " +
                        "the laser to treat a multitude of treatable symptoms.";

        Spanned stringHandHTML = Html.fromHtml(stringHand);
        txtLaserText.setText(stringHandHTML);

    }

}
