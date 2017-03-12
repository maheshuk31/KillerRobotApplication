package com.example.maheshuk31.killerrobotapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ExhibitionMapActivityInstrumentationTests extends ActivityInstrumentationTestCase2<ExhibitionMapActivity> {

    public ExhibitionMapActivityInstrumentationTests() {
        super(ExhibitionMapActivity.class);
    }

    public void testExhibitionMapActivityExists() {
        ExhibitionMapActivity exhibitionMapActivity = getActivity();

        assertNotNull("ExhibitionMapActivity doesn't exist", exhibitionMapActivity);
    }

    public void testImageViewOfSomersetHouseExists() {
        ExhibitionMapActivity exhibitionMapActivity = getActivity();
        ImageView imageView = (ImageView) exhibitionMapActivity.findViewById(R.id.imgViewSomersetHouse);

        assertNotNull("Image of Somerset House doesn't exist", imageView);
    }

    public void testImageButtonOfAntennaExists() {
        ExhibitionMapActivity exhibitionMapActivity = getActivity();
        ImageButton imageButton = (ImageButton) exhibitionMapActivity.findViewById(R.id.imgBtnExhibitionAntenna);

        assertNotNull("Image Button of Antenna doesn't exist", imageButton);
    }

    public void testImageButtonOfScannerExists() {
        ExhibitionMapActivity exhibitionMapActivity = getActivity();
        ImageButton imageButton = (ImageButton) exhibitionMapActivity.findViewById(R.id.imgBtnExhibitionScanner);

        assertNotNull("Image Button of Scanner doesn't exist", imageButton);
    }

    public void testImageButtonOfHandExists() {
        ExhibitionMapActivity exhibitionMapActivity = getActivity();
        ImageButton imageButton = (ImageButton) exhibitionMapActivity.findViewById(R.id.imgBtnExhibitionArm);

        assertNotNull("Image Button of Hand doesn't exist", imageButton);
    }

    public void testImageButtonOfPowerCoreExists() {
        ExhibitionMapActivity exhibitionMapActivity = getActivity();
        ImageButton imageButton = (ImageButton) exhibitionMapActivity.findViewById(R.id.imgBtnExhibitionBody);

        assertNotNull("Image Button of Power Core doesn't exist", imageButton);
    }

    public void testImageButtonOfLaserExists() {
        ExhibitionMapActivity exhibitionMapActivity = getActivity();
        ImageButton imageButton = (ImageButton) exhibitionMapActivity.findViewById(R.id.imgBtnExhibitionLaser);

        assertNotNull("Image Button of Laser doesn't exist", imageButton);
    }

    public void testImageButtonOfLegExists() {
        ExhibitionMapActivity exhibitionMapActivity = getActivity();
        ImageButton imageButton = (ImageButton) exhibitionMapActivity.findViewById(R.id.imgBtnExhibitionLeg);

        assertNotNull("Image Button of Leg doesn't exist", imageButton);
    }
}
