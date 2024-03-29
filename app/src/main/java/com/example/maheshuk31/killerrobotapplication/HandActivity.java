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
 * Page about the robot's hand loads when clicking the target on the hand of the robot on the
 * MainActivity.
 */
public class HandActivity extends AppCompatActivity {

    private TextView txtHandTitle, txtHandTextPt1, txtHandTextPt2, txtHandTextPt3, txtHandURL;
    private ImageButton imgBtnHandVideo;
    private ImageView imgHand;
    private SeekBar seekBarHand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hand);

        imgHand = (ImageView) findViewById(R.id.imgHand);
        seekBarHand = (SeekBar) findViewById(R.id.seekBarHand);
        txtHandTitle = (TextView) findViewById(R.id.txtHandTitle);
        txtHandTextPt1 = (TextView) findViewById(R.id.txtHandTextPt1);
        txtHandTextPt2 = (TextView) findViewById(R.id.txtHandTextPt2);
        txtHandTextPt3 = (TextView) findViewById(R.id.txtHandTextPt3);
        imgBtnHandVideo = (ImageButton) findViewById(R.id.imgBtnHandVideo);
        txtHandURL = (TextView) findViewById(R.id.txtHandURL);

        txtHandTitle.setTypeface(EasyFonts.captureIt(this));

        String stringHandPt1 =
                "<B><U>Uses:</U></B> <I>Autonomous Grasping</I>" +
                        "<BR/>" +
                        "<B><U>Applications:</U></B> <I>Shadow Dexterous Hands</I>" +
                        "<BR/>" +
                        "<BR/>" +
                        "In collaboration with the Centre for Robotics Research at King's College via Dr. " +
                        "Hongbin Liu and Shadow though the GSC Project the aim is adding new capabilities " +
                        "to the Shadow Dexterous Hands.";

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
        txtHandTextPt1.setTypeface(EasyFonts.robotoMedium(this));
        txtHandTextPt2.setText(stringHandHTMLPt2);
        txtHandTextPt2.setTypeface(EasyFonts.robotoMedium(this));
        txtHandTextPt3.setText(stringHandHTMLPt3);
        txtHandTextPt3.setTypeface(EasyFonts.robotoMedium(this));

        imgBtnHandVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outclickYoutube("9ubXFMklEe8");
            }
        });

        seekBarHand.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (progress == 0) {
                    imgHand.setImageResource(R.drawable.arm_pt1);
                } else if (progress == 1) {
                    imgHand.setImageResource(R.drawable.arm_pt2);
                } else if (progress == 2) {
                    imgHand.setImageResource(R.drawable.arm_pt3);
                } else if (progress == 3) {
                    imgHand.setImageResource(R.drawable.arm_pt4);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        txtHandURL.setTypeface(EasyFonts.freedom(this));
        txtHandURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.shadowrobot.com/products/dexterous-hand/";
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
