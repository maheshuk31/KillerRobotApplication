package com.example.maheshuk31.killerrobotapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class LaserActivityInstrumentationTests extends ActivityInstrumentationTestCase2<LaserActivity> {
    public LaserActivityInstrumentationTests() {
        super(LaserActivity.class);
    }

    public void testLaserActivityExists() {
        LaserActivity LaserActivity = getActivity();

        assertNotNull("LaserActivity doesn't exist", LaserActivity);
    }

    public void testImageViewOfLaserExists() {
        LaserActivity LaserActivity = getActivity();
        ImageView imageView = (ImageView) LaserActivity.findViewById(R.id.imgLaser);

        assertNotNull("Image of Laser doesn't exist", imageView);
    }

    public void testSeekBarOfLaserExists() {
        LaserActivity LaserActivity = getActivity();
        SeekBar seekBar = (SeekBar) LaserActivity.findViewById(R.id.seekBarLaser);

        assertNotNull("SeekBar of Laser doesn't exist", seekBar);
    }

    public void testLaserPt1TextViewExists() {
        LaserActivity LaserActivity = getActivity();
        TextView textView = (TextView) LaserActivity.findViewById(R.id.txtLaserTextPt1);

        assertNotNull("TextView for Laser pt1 text doesn't exist", textView);
    }

    public void testImageViewOfLaserImageExists() {
        LaserActivity LaserActivity = getActivity();
        ImageView imageView = (ImageView) LaserActivity.findViewById(R.id.imgViewLaserImage);

        assertNotNull("Image of Laser Image doesn't exist", imageView);
    }

    public void testLaserPt2TextViewExists() {
        LaserActivity LaserActivity = getActivity();
        TextView textView = (TextView) LaserActivity.findViewById(R.id.txtLaserTextPt2);

        assertNotNull("TextView for Laser pt2 text doesn't exist", textView);
    }

    public void testImageButtonOfLaserVideoExists() {
        LaserActivity LaserActivity = getActivity();
        ImageButton imageButton = (ImageButton) LaserActivity.findViewById(R.id.imgBtnLaserVideo);

        assertNotNull("ImageButton of Laser Video doesn't exist", imageButton);
    }

    public void testLaserPt3TextViewExists() {
        LaserActivity LaserActivity = getActivity();
        TextView textView = (TextView) LaserActivity.findViewById(R.id.txtLaserTextPt3);

        assertNotNull("TextView for Laser pt3 text doesn't exist", textView);
    }
}
