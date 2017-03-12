package com.example.maheshuk31.killerrobotapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class LegActivityInstrumentationTests extends ActivityInstrumentationTestCase2<LegActivity> {
    public LegActivityInstrumentationTests() {
        super(LegActivity.class);
    }

    public void testLegActivityExists() {
        LegActivity LegActivity = getActivity();

        assertNotNull("LegActivity doesn't exist", LegActivity);
    }

    public void testImageViewOfLegExists() {
        LegActivity LegActivity = getActivity();
        ImageView imageView = (ImageView) LegActivity.findViewById(R.id.imgLeg);

        assertNotNull("Image of Leg doesn't exist", imageView);
    }

    public void testSeekBarOfLegExists() {
        LegActivity LegActivity = getActivity();
        SeekBar seekBar = (SeekBar) LegActivity.findViewById(R.id.seekBarLeg);

        assertNotNull("SeekBar of Leg doesn't exist", seekBar);
    }

    public void testLegPt1TextViewExists() {
        LegActivity LegActivity = getActivity();
        TextView textView = (TextView) LegActivity.findViewById(R.id.txtLegTextPt1);

        assertNotNull("TextView for Leg pt1 text doesn't exist", textView);
    }

    public void testImageViewOfLegImageExists() {
        LegActivity LegActivity = getActivity();
        ImageView imageView = (ImageView) LegActivity.findViewById(R.id.imgViewLegImage);

        assertNotNull("Image of Leg Image doesn't exist", imageView);
    }

    public void testLegPt2TextViewExists() {
        LegActivity LegActivity = getActivity();
        TextView textView = (TextView) LegActivity.findViewById(R.id.txtLegTextPt2);

        assertNotNull("TextView for Leg pt2 text doesn't exist", textView);
    }

    public void testImageButtonOfLegVideoExists() {
        LegActivity LegActivity = getActivity();
        ImageButton imageButton = (ImageButton) LegActivity.findViewById(R.id.imgBtnLegVideo);

        assertNotNull("ImageButton of Leg Video doesn't exist", imageButton);
    }

    public void testLegPt3TextViewExists() {
        LegActivity LegActivity = getActivity();
        TextView textView = (TextView) LegActivity.findViewById(R.id.txtLegTextPt3);

        assertNotNull("TextView for Leg pt3 text doesn't exist", textView);
    }
}
