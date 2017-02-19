package com.example.maheshuk31.killerrobotapplication;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;

public class AntennaActivity extends AppCompatActivity {

    private TextView txtAntennaTitle, txtAntennaText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antenna);

//        txtAntennaTitle = (TextView) findViewById(R.id.txtAntennaTitle);
//        Typeface typeFace = Typeface.createFromAsset(getAssets(),"fonts/disposabledroidbb.ttf");
//        txtAntennaTitle.setTypeface(typeFace);

        txtAntennaText = (TextView) findViewById(R.id.txtAntennaText);
        String stringAntenna =
                "<B><U>Uses:</U></B> <I>Satellite and Military Communications</I>" +
                        "<BR/>" +
                        "<B><U>Applications:</U></B> <I>Curiosity Rover, Voyager Missions, New Horizons mission and more</I>" +
                        "<BR/>" +
                        "<BR/>" +
                        "With a frequency range of 8-12 Ghz and wavelength range 3.75-2.5 cm located in the microwave " +
                        "region of the electromagnetic spectrum it provides the basis of space communication " +
                        "providing great lengths of potential communication from far back to host receiver. " +
                        "<BR/>" +
                        "Curiosity Rover was one of the pioneers of recent space exploration leading to a sudden surge " +
                        "of interest in the nearby red plant of Mars. One of the only few inhabitants of Mars (of " +
                        "robots) launched in 26th November 2011 is a fully functional laboratory the size and " +
                        "mechanics of a car. The basis of it's mission was to explore the Gale Crater to check for signs " +
                        "of life. " +
                        "<BR/>" +
                        "A key part of any space mission sent is to obtain the information and relay back to us, Curiosity's " +
                        "UHF antenna is how it is able to communicate as well as two additional instruments taking an average " +
                        "14 minutes and 6 seconds for signals to travel to and from it.";

        Spanned stringAntennaHTML = Html.fromHtml(stringAntenna);
        txtAntennaText.setText(stringAntennaHTML);

    }

}
