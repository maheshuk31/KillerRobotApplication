package com.example.maheshuk31.killerrobotapplication;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

/**
 * Page about the robot's antenna loads when clicking the target on the antenna of the robot on the
 * MainActivity.
 */
public class AntennaActivity extends AppCompatActivity {

    private TextView txtAntennaTitle, txtAntennaTextPt1, txtAntennaTextPt2, txtAntennaTextPt3, txtAntennaURL;
    private ImageButton imgBtnAntennaVideo;
    private ImageView imgAntenna;
    private SeekBar seekBarAntenna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antenna);

        imgAntenna = (ImageView) findViewById(R.id.imgAntenna);
        seekBarAntenna = (SeekBar) findViewById(R.id.seekBarAntenna);
        txtAntennaTitle = (TextView) findViewById(R.id.txtAntennaTitle);
        txtAntennaTextPt1 = (TextView) findViewById(R.id.txtAntennaTextPt1);
        txtAntennaTextPt2 = (TextView) findViewById(R.id.txtAntennaTextPt2);
        txtAntennaTextPt3 = (TextView) findViewById(R.id.txtAntennaTextPt3);
        imgBtnAntennaVideo = (ImageButton) findViewById(R.id.imgBtnAntennaVideo);
        txtAntennaURL = (TextView) findViewById(R.id.txtAntennaURL);

        txtAntennaTitle.setTypeface(EasyFonts.captureIt(this));

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
        txtAntennaTextPt1.setTypeface(EasyFonts.robotoMedium(this));
        txtAntennaTextPt2.setText(stringAntennaHTMLPt2);
        txtAntennaTextPt2.setTypeface(EasyFonts.robotoMedium(this));
        txtAntennaTextPt3.setText(stringAntennaHTMLPt3);
        txtAntennaTextPt3.setTypeface(EasyFonts.robotoMedium(this));

        imgBtnAntennaVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outClickYoutube("MqTPwz2QCKc");
            }
        });

        seekBarAntenna.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (progress == 0) {
                    imgAntenna.setImageResource(R.drawable.antenna_pt1);
                } else if (progress == 1) {
                    imgAntenna.setImageResource(R.drawable.antenna_pt2);
                } else if (progress == 2) {
                    imgAntenna.setImageResource(R.drawable.antenna_pt3);
                } else if (progress == 3) {
                    imgAntenna.setImageResource(R.drawable.antenna_pt4);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        txtAntennaURL.setTypeface(EasyFonts.freedom(this));
        txtAntennaURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://mars.nasa.gov/msl/";
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url)));
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
    public void outClickYoutube(String id) {
        Intent applicationIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + id));
        Intent websiteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=" + id));
        try {
            startActivity(applicationIntent);
        } catch (ActivityNotFoundException e) {
            startActivity(websiteIntent);
        }
    }

    /**
     * Overrides the normal press of the back button on the device to now close the activity needed
     * to save memory from background activities that are open.
     */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

}
