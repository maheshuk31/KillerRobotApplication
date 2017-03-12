package com.example.maheshuk31.killerrobotapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class AntennaActivityInstrumentationTests extends ActivityInstrumentationTestCase2<AntennaActivity> {

    public AntennaActivityInstrumentationTests() {
        super(AntennaActivity.class);
    }

    public void testAntennaActivityExists() {
        AntennaActivity antennaActivity = getActivity();

        assertNotNull("AntennaActivity doesn't exist", antennaActivity);
    }

    public void testImageViewOfAntennaExists() {
        AntennaActivity antennaActivity = getActivity();
        ImageView imageView = (ImageView) antennaActivity.findViewById(R.id.imgAntenna);

        assertNotNull("Image of Antenna doesn't exist", imageView);
    }

    public void testSeekBarOfAntennaExists() {
        AntennaActivity antennaActivity = getActivity();
        SeekBar seekBar = (SeekBar) antennaActivity.findViewById(R.id.seekBarAntenna);

        assertNotNull("SeekBar of Antenna doesn't exist", seekBar);
    }

    public void testAntennaPt1TextViewExists() {
        AntennaActivity antennaActivity = getActivity();
        TextView textView = (TextView) antennaActivity.findViewById(R.id.txtAntennaTextPt1);

        assertNotNull("TextView for antenna pt1 text doesn't exist", textView);
    }

    public void testImageViewOfAntennaImageExists() {
        AntennaActivity antennaActivity = getActivity();
        ImageView imageView = (ImageView) antennaActivity.findViewById(R.id.imgViewAntennaImage);

        assertNotNull("Image of Antenna Image doesn't exist", imageView);
    }

    public void testAntennaPt2TextViewExists() {
        AntennaActivity antennaActivity = getActivity();
        TextView textView = (TextView) antennaActivity.findViewById(R.id.txtAntennaTextPt2);

        assertNotNull("TextView for antenna pt2 text doesn't exist", textView);
    }

    public void testImageButtonOfAntennaVideoExists() {
        AntennaActivity antennaActivity = getActivity();
        ImageButton imageButton = (ImageButton) antennaActivity.findViewById(R.id.imgBtnAntennaVideo);

        assertNotNull("ImageButton of Antenna Video doesn't exist", imageButton);
    }

    public void testAntennaPt3TextViewExists() {
        AntennaActivity antennaActivity = getActivity();
        TextView textView = (TextView) antennaActivity.findViewById(R.id.txtAntennaTextPt3);

        assertNotNull("TextView for antenna pt3 text doesn't exist", textView);
    }
}
