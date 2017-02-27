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

public class ScannerActivity extends AppCompatActivity {

    private TextView txtScannerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);

        txtScannerText = (TextView) findViewById(R.id.txtScannerText);
        String stringHand =
                "<B><U>Uses:</U></B> <I>KCL Spotlight Research</I>" +
                        "<BR/>" +
                        "<B><U>Applications:</U></B> <I>Wearable Tech helping health conditions</I>" +
                        "<BR/>" +
                        "<BR/>" +
                        "Wristwatches have transcended with the times of increasing technology with " +
                        "new tier of smart-watches. With the popularity of them with people researchers " +
                        "having been trying to harness them, to see if it can help with certain medical conditions." +
                        "<BR/>" +
                        "This is a new project jointly led by King’s College London and Janssen " +
                        "Pharmaceutica NV supported by Innovative Medicines Initiative (IMI) to try and " +
                        "develop a new way to monitor conditions like depression, epilepsy and multiple " +
                        "sclerosis with wearable and smartphone tech. The aim of improving life of those " +
                        "affected, with the use of mobile data giving the full picture of their condition." +
                        "<BR/>" +
                        "This is a worldwide collaboration bring those of many different employment backgrounds " +
                        "such as clinicians, researchers, engineers, computer scientists and bioinformaticians.";

        Spanned stringHandHTML = Html.fromHtml(stringHand);
        txtScannerText.setText(stringHandHTML);

    }

}
