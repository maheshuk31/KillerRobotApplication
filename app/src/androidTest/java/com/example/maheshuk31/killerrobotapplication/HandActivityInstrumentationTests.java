package com.example.maheshuk31.killerrobotapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class HandActivityInstrumentationTests extends ActivityInstrumentationTestCase2<HandActivity> {

    public HandActivityInstrumentationTests() {
        super(HandActivity.class);
    }

    public void testHandActivityExists() {
        HandActivity HandActivity = getActivity();

        assertNotNull("HandActivity doesn't exist", HandActivity);
    }

    public void testImageViewOfHandExists() {
        HandActivity HandActivity = getActivity();
        ImageView imageView = (ImageView) HandActivity.findViewById(R.id.imgHand);

        assertNotNull("Image of Hand doesn't exist", imageView);
    }

    public void testSeekBarOfHandExists() {
        HandActivity HandActivity = getActivity();
        SeekBar seekBar = (SeekBar) HandActivity.findViewById(R.id.seekBarHand);

        assertNotNull("SeekBar of Hand doesn't exist", seekBar);
    }

    public void testHandPt1TextViewExists() {
        HandActivity HandActivity = getActivity();
        TextView textView = (TextView) HandActivity.findViewById(R.id.txtHandTextPt1);

        assertNotNull("TextView for Hand pt1 text doesn't exist", textView);
    }

    public void testImageViewOfHandImageExists() {
        HandActivity HandActivity = getActivity();
        ImageView imageView = (ImageView) HandActivity.findViewById(R.id.imgViewHandImage);

        assertNotNull("Image of Hand Image doesn't exist", imageView);
    }

    public void testHandPt2TextViewExists() {
        HandActivity HandActivity = getActivity();
        TextView textView = (TextView) HandActivity.findViewById(R.id.txtHandTextPt2);

        assertNotNull("TextView for Hand pt2 text doesn't exist", textView);
    }

    public void testImageButtonOfHandVideoExists() {
        HandActivity HandActivity = getActivity();
        ImageButton imageButton = (ImageButton) HandActivity.findViewById(R.id.imgBtnHandVideo);

        assertNotNull("ImageButton of Hand Video doesn't exist", imageButton);
    }

    public void testHandPt3TextViewExists() {
        HandActivity HandActivity = getActivity();
        TextView textView = (TextView) HandActivity.findViewById(R.id.txtHandTextPt3);

        assertNotNull("TextView for Hand pt3 text doesn't exist", textView);
    }
}
