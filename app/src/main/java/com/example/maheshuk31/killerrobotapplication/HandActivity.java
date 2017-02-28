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

public class HandActivity extends AppCompatActivity {

    private TextView txtHandTextPt1, txtHandTextPt2, txtHandTextPt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hand);

        txtHandTextPt1 = (TextView) findViewById(R.id.txtHandTextPt1);
        txtHandTextPt2 = (TextView) findViewById(R.id.txtHandTextPt2);
        txtHandTextPt3 = (TextView) findViewById(R.id.txtHandTextPt3);

        String stringHandPt1 =
                "<B><U>Uses:</U></B> <I>Autonomous Grasping</I>" +
                        "<BR/>" +
                        "<B><U>Applications:</U></B> <I>Shadow Dexterous Hands</I>" +
                        "<BR/>" +
                        "<BR/>" +
                        "In collaboration with the Centre for Robotics Research at King's College via Dr. " +
                        "Hongbin Liu and Shadow though the GSC Project the aim is adding new capabilities " +
                        "to the Shadow Dexterous Hands. ";

        String stringHandPt2 =
                "Aim is to provide the hand of a robot that is similar to that of a human hand in terms " +
                        "of its design and features. \"With 20 actuated degrees of freedom, absolute position " +
                        "and force sensors and ultra sensitive touch sensors on the fingertips\", through GSC " +
                        "all this was possible in providing a fully purchasable robotic hand for a variety of " +
                        "reasons including a part of a robotic system.";

        String stringHandPt3 =
                "GSC is a continuing evolving software package that is a powerful algorithm using tactile " +
                        "data to computing stability of the current grasp to move each of Shadow Hands safely. " +
                        "Algorithms are customisable to work on different sensors for all different ranges.";

        Spanned stringHandHTMLPt1 = Html.fromHtml(stringHandPt1);
        Spanned stringHandHTMLPt2 = Html.fromHtml(stringHandPt2);
        Spanned stringHandHTMLPt3 = Html.fromHtml(stringHandPt3);

        txtHandTextPt1.setText(stringHandHTMLPt1);
        txtHandTextPt2.setText(stringHandHTMLPt2);
        txtHandTextPt3.setText(stringHandHTMLPt3);

    }

}
