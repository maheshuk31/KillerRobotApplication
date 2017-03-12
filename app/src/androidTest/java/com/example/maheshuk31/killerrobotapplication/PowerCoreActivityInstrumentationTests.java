package com.example.maheshuk31.killerrobotapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class PowerCoreActivityInstrumentationTests extends ActivityInstrumentationTestCase2<PowerCoreActivity> {
    public PowerCoreActivityInstrumentationTests() {
        super(PowerCoreActivity.class);
    }

    public void testPowerCoreActivityExists() {
        PowerCoreActivity PowerCoreActivity = getActivity();

        assertNotNull("PowerCoreActivity doesn't exist", PowerCoreActivity);
    }

    public void testImageViewOfPowerCoreExists() {
        PowerCoreActivity PowerCoreActivity = getActivity();
        ImageView imageView = (ImageView) PowerCoreActivity.findViewById(R.id.imgPowerCore);

        assertNotNull("Image of PowerCore doesn't exist", imageView);
    }

    public void testSeekBarOfPowerCoreExists() {
        PowerCoreActivity PowerCoreActivity = getActivity();
        SeekBar seekBar = (SeekBar) PowerCoreActivity.findViewById(R.id.seekBarPowerCore);

        assertNotNull("SeekBar of PowerCore doesn't exist", seekBar);
    }

    public void testPowerCorePt1TextViewExists() {
        PowerCoreActivity PowerCoreActivity = getActivity();
        TextView textView = (TextView) PowerCoreActivity.findViewById(R.id.txtPowerCoreTextPt1);

        assertNotNull("TextView for PowerCore pt1 text doesn't exist", textView);
    }

    public void testImageViewOfPowerCoreImageExists() {
        PowerCoreActivity PowerCoreActivity = getActivity();
        ImageView imageView = (ImageView) PowerCoreActivity.findViewById(R.id.imgViewPowerCoreImage);

        assertNotNull("Image of PowerCore Image doesn't exist", imageView);
    }

    public void testPowerCorePt2TextViewExists() {
        PowerCoreActivity PowerCoreActivity = getActivity();
        TextView textView = (TextView) PowerCoreActivity.findViewById(R.id.txtPowerCoreTextPt2);

        assertNotNull("TextView for PowerCore pt2 text doesn't exist", textView);
    }

    public void testImageButtonOfPowerCoreVideoExists() {
        PowerCoreActivity PowerCoreActivity = getActivity();
        ImageButton imageButton = (ImageButton) PowerCoreActivity.findViewById(R.id.imgBtnPowerCoreVideo);

        assertNotNull("ImageButton of PowerCore Video doesn't exist", imageButton);
    }

    public void testPowerCorePt3TextViewExists() {
        PowerCoreActivity PowerCoreActivity = getActivity();
        TextView textView = (TextView) PowerCoreActivity.findViewById(R.id.txtPowerCoreTextPt3);

        assertNotNull("TextView for PowerCore pt3 text doesn't exist", textView);
    }
}
