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
 * Page about the robot's laser gun loads when clicking the target on the laser gun of the robot on the
 * MainActivity.
 */
public class LaserActivity extends AppCompatActivity {

    private TextView txtLaserTitle, txtLaserTextPt1, txtLaserTextPt2, txtLaserTextPt3;
    private ImageButton imgBtnLaserVideo;
    private ImageView imgLaser;
    private SeekBar seekBarLaser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laser);

        imgLaser = (ImageView) findViewById(R.id.imgLaser);
        seekBarLaser = (SeekBar) findViewById(R.id.seekBarLaser);
        txtLaserTitle = (TextView) findViewById(R.id.txtLaserTitle);
        txtLaserTextPt1 = (TextView) findViewById(R.id.txtLaserTextPt1);
        txtLaserTextPt2 = (TextView) findViewById(R.id.txtLaserTextPt2);
        txtLaserTextPt3 = (TextView) findViewById(R.id.txtLaserTextPt3);
        imgBtnLaserVideo = (ImageButton) findViewById(R.id.imgBtnLaserVideo);

        txtLaserTitle.setTypeface(EasyFonts.captureIt(this));

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
        txtLaserTextPt1.setTypeface(EasyFonts.robotoMedium(this));
        txtLaserTextPt2.setText(stringHandHTMLPt2);
        txtLaserTextPt2.setTypeface(EasyFonts.robotoMedium(this));
        txtLaserTextPt3.setText(stringHandHTMLPt3);
        txtLaserTextPt3.setTypeface(EasyFonts.robotoMedium(this));

        imgBtnLaserVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outclickYoutube("4EkFvuqbNGo");
            }
        });

        seekBarLaser.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (progress == 0) {
                    imgLaser.setImageResource(R.drawable.laser_pt1);
                } else if (progress == 1) {
                    imgLaser.setImageResource(R.drawable.laser_pt2);
                } else if (progress == 2) {
                    imgLaser.setImageResource(R.drawable.laser_pt3);
                } else if (progress == 3) {
                    imgLaser.setImageResource(R.drawable.laser_pt4);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
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
