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
 * Page about the robot's leg loads when clicking the target on the leg of the robot on the
 * MainActivity.
 */
public class LegActivity extends AppCompatActivity {

    private TextView txtLegTitle, txtLegTextPt1, txtLegTextPt2, txtLegTextPt3, txtLegURL;
    private ImageButton imgBtnLegVideo;
    private ImageView imgLeg;
    private SeekBar seekBarLeg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg);

        imgLeg = (ImageView) findViewById(R.id.imgLeg);
        seekBarLeg = (SeekBar) findViewById(R.id.seekBarLeg);
        txtLegTitle = (TextView) findViewById(R.id.txtLegTitle);
        txtLegTextPt1 = (TextView) findViewById(R.id.txtLegTextPt1);
        txtLegTextPt2 = (TextView) findViewById(R.id.txtLegTextPt2);
        txtLegTextPt3 = (TextView) findViewById(R.id.txtLegTextPt3);
        imgBtnLegVideo = (ImageButton) findViewById(R.id.imgBtnLegVideo);
        txtLegURL = (TextView) findViewById(R.id.txtLegURL);

        txtLegTitle.setTypeface(EasyFonts.captureIt(this));

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
        txtLegTextPt1.setTypeface(EasyFonts.robotoMedium(this));
        txtLegTextPt2.setText(stringHandHTMLPt2);
        txtLegTextPt2.setTypeface(EasyFonts.robotoMedium(this));
        txtLegTextPt3.setText(stringHandHTMLPt3);
        txtLegTextPt3.setTypeface(EasyFonts.robotoMedium(this));

        imgBtnLegVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outclickYoutube("XMVjn7bpF-Q");
            }
        });

        seekBarLeg.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (progress == 0) {
                    imgLeg.setImageResource(R.drawable.legs_pt1);
                } else if (progress == 1) {
                    imgLeg.setImageResource(R.drawable.legs_pt2);
                } else if (progress == 2) {
                    imgLeg.setImageResource(R.drawable.legs_pt3);
                } else if (progress == 3) {
                    imgLeg.setImageResource(R.drawable.legs_pt4);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        txtLegURL.setTypeface(EasyFonts.freedom(this));
        txtLegURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://www.stiff-flop.eu/index.php/en/";
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
    public void outclickYoutube(String id) {
        Intent applicationIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + id));
        Intent websiteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com/watch?v=" + id));
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
