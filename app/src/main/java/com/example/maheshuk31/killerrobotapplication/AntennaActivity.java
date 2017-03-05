package com.example.maheshuk31.killerrobotapplication;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Typeface;
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
 * Page about the robot's antenna loads when clicking the target on the antenna of the robot on the
 * MainActivity.
 */
public class AntennaActivity extends AppCompatActivity {

    private TextView txtAntennaTextPt1, txtAntennaTextPt2, txtAntennaTextPt3;
    private ImageButton imgBtnAntennaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antenna);

        txtAntennaTextPt1 = (TextView) findViewById(R.id.txtAntennaTextPt1);
        txtAntennaTextPt2 = (TextView) findViewById(R.id.txtAntennaTextPt2);
        txtAntennaTextPt3 = (TextView) findViewById(R.id.txtAntennaTextPt3);
        imgBtnAntennaVideo = (ImageButton) findViewById(R.id.imgBtnAntennaVideo);

        String stringAntennaPt1 =
                "<B><U>Uses:</U></B> <I>Satellite and Military Communications</I>" +
                        "<BR/>" +
                        "<B><U>Applications:</U></B> <I>Curiosity Rover, Voyager Missions, New Horizons mission and more</I>" +
                        "<BR/>" +
                        "<BR/>" +
                        "With a frequency range of 8-12 Ghz and wavelength range 3.75-2.5 cm located in the microwave " +
                        "region of the electromagnetic spectrum it provides the basis of space communication " +
                        "providing great lengths of potential communication from far back to host receiver. " +
                        "<BR/>";

        String stringAntennaPt2 =
                "Curiosity Rover was one of the pioneers of recent space exploration leading to a sudden surge " +
                        "of interest in the nearby red plant of Mars. One of the only few inhabitants of Mars (of " +
                        "robots) launched in 26th November 2011 is a fully functional laboratory the size and " +
                        "mechanics of a car. The basis of it's mission was to explore the Gale Crater to check for signs " +
                        "of life.";

        String stringAntennaPt3 =
                "A key part of any space mission sent is to obtain the information and relay back to us, Curiosity's " +
                        "UHF antenna is how it is able to communicate as well as two additional instruments taking an average " +
                        "14 minutes and 6 seconds for signals to travel to and from it.";

        Spanned stringAntennaHTMLPt1 = Html.fromHtml(stringAntennaPt1);
        Spanned stringAntennaHTMLPt2 = Html.fromHtml(stringAntennaPt2);
        Spanned stringAntennaHTMLPt3 = Html.fromHtml(stringAntennaPt3);

        txtAntennaTextPt1.setText(stringAntennaHTMLPt1);
        txtAntennaTextPt2.setText(stringAntennaHTMLPt2);
        txtAntennaTextPt3.setText(stringAntennaHTMLPt3);

        imgBtnAntennaVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outclickYoutube("MqTPwz2QCKc");
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
