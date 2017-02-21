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

public class LegActivity extends AppCompatActivity {

    private TextView txtLegText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg);

        txtLegText = (TextView) findViewById(R.id.txtLegText);
        String stringHand =
                "<B><U>Uses:</U></B> <I>Flexible Invasive Surgery Tool</I>" +
                        "<BR/>" +
                        "<B><U>Applications:</U></B> <I>Stiff-Flop Tool</I>" +
                        "<BR/>" +
                        "<BR/>" +
                        "Under the guidance of Centre for Robotics Research at King's College London " +
                        "leading European scientists and medical doctors in creating a minimal invasive " +
                        "surgery tool to go through a patients body through all the narrow openings " +
                        "to get to the place that requires attention." +
                        "<BR/>" +
                        "Mimicking that of the animal an Octopus's tentacle Stiff-Flop aims to be fully " +
                        "manipulated via its' movement, stiffness and deformity; giving the ability " +
                        "to tackle any situation. A soft robotic arm will be the key part fitting into " +
                        "being able to squeeze through 12mm diameter Trocar-port." +
                        "<BR/>" +
                        "Current plans have reached the stage of successfully operating on a human body " +
                        "with plans to release into the medical field potentially in the near future.";

        Spanned stringHandHTML = Html.fromHtml(stringHand);
        txtLegText.setText(stringHandHTML);

    }

}
