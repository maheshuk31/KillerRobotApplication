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

public class ScannerActivity extends AppCompatActivity {

    private TextView txtScannerTextPt1, txtScannerTextPt2, txtScannerTextPt3;
    private ImageButton imgBtnScannerVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);

        txtScannerTextPt1 = (TextView) findViewById(R.id.txtScannerTextPt1);
        txtScannerTextPt2 = (TextView) findViewById(R.id.txtScannerTextPt2);
        txtScannerTextPt3 = (TextView) findViewById(R.id.txtScannerTextPt3);
        imgBtnScannerVideo = (ImageButton) findViewById(R.id.imgBtnScannerVideo);

        String stringHandPt1 =
                "<B><U>Uses:</U></B> <I>KCL Spotlight Research</I>" +
                        "<BR/>" +
                        "<B><U>Applications:</U></B> <I>Wearable Tech helping health conditions</I>" +
                        "<BR/>" +
                        "<BR/>" +
                        "Wristwatches have transcended with the times of increasing technology with " +
                        "new tier of smart-watches. With the popularity of them with people researchers " +
                        "having been trying to harness them, to see if it can help with certain medical conditions.";

        String stringHandPt2 =
                "This is a new project jointly led by King’s College London and Janssen " +
                        "Pharmaceutica NV supported by Innovative Medicines Initiative (IMI) to try and " +
                        "develop a new way to monitor conditions like depression, epilepsy and multiple " +
                        "sclerosis with wearable and smartphone tech. The aim of improving life of those " +
                        "affected, with the use of mobile data giving the full picture of their condition.";

        String stringHandPt3 =
                "This is a worldwide collaboration bring those of many different employment backgrounds " +
                        "such as clinicians, researchers, engineers, computer scientists and bioinformaticians.";

        Spanned stringHandHTMLPt1 = Html.fromHtml(stringHandPt1);
        Spanned stringHandHTMLPt2 = Html.fromHtml(stringHandPt2);
        Spanned stringHandHTMLPt3 = Html.fromHtml(stringHandPt3);

        txtScannerTextPt1.setText(stringHandHTMLPt1);
        txtScannerTextPt2.setText(stringHandHTMLPt2);
        txtScannerTextPt3.setText(stringHandHTMLPt3);

        imgBtnScannerVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outclickYoutube("QJQjm3O-hqw");
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
