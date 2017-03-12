package com.example.maheshuk31.killerrobotapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class ScannerActivityInstrumentationTests extends ActivityInstrumentationTestCase2<ScannerActivity> {
    public ScannerActivityInstrumentationTests() {
        super(ScannerActivity.class);
    }

    public void testScannerActivityExists() {
        ScannerActivity ScannerActivity = getActivity();

        assertNotNull("ScannerActivity doesn't exist", ScannerActivity);
    }

    public void testImageViewOfScannerExists() {
        ScannerActivity ScannerActivity = getActivity();
        ImageView imageView = (ImageView) ScannerActivity.findViewById(R.id.imgScanner);

        assertNotNull("Image of Scanner doesn't exist", imageView);
    }

    public void testSeekBarOfScannerExists() {
        ScannerActivity ScannerActivity = getActivity();
        SeekBar seekBar = (SeekBar) ScannerActivity.findViewById(R.id.seekBarScanner);

        assertNotNull("SeekBar of Scanner doesn't exist", seekBar);
    }

    public void testScannerPt1TextViewExists() {
        ScannerActivity ScannerActivity = getActivity();
        TextView textView = (TextView) ScannerActivity.findViewById(R.id.txtScannerTextPt1);

        assertNotNull("TextView for Scanner pt1 text doesn't exist", textView);
    }

    public void testImageViewOfScannerImageExists() {
        ScannerActivity ScannerActivity = getActivity();
        ImageView imageView = (ImageView) ScannerActivity.findViewById(R.id.imgViewScannerImage);

        assertNotNull("Image of Scanner Image doesn't exist", imageView);
    }

    public void testScannerPt2TextViewExists() {
        ScannerActivity ScannerActivity = getActivity();
        TextView textView = (TextView) ScannerActivity.findViewById(R.id.txtScannerTextPt2);

        assertNotNull("TextView for Scanner pt2 text doesn't exist", textView);
    }

    public void testImageButtonOfScannerVideoExists() {
        ScannerActivity ScannerActivity = getActivity();
        ImageButton imageButton = (ImageButton) ScannerActivity.findViewById(R.id.imgBtnScannerVideo);

        assertNotNull("ImageButton of Scanner Video doesn't exist", imageButton);
    }

    public void testScannerPt3TextViewExists() {
        ScannerActivity ScannerActivity = getActivity();
        TextView textView = (TextView) ScannerActivity.findViewById(R.id.txtScannerTextPt3);

        assertNotNull("TextView for Scanner pt3 text doesn't exist", textView);
    }
}
