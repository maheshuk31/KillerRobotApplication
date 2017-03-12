package com.example.maheshuk31.killerrobotapplication;


import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivityInstrumentationTests extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityInstrumentationTests() {
        super(MainActivity.class);
    }

    public void testMainActivityExists() {
        MainActivity mainActivity = getActivity();

        assertNotNull("MainActivity doesn't exist", mainActivity);
    }

    public void testImageViewOfRobotExists() {
        MainActivity mainActivity = getActivity();
        ImageView imageView = (ImageView) mainActivity.findViewById(R.id.imgRobot);

        assertNotNull("Image of Robot doesn't exist", imageView);
    }

    public void testImageButtonOfAntennaExists() {
        MainActivity mainActivity = getActivity();
        ImageButton imageButton = (ImageButton) mainActivity.findViewById(R.id.imgBtnAntenna);

        assertNotNull("Target of Antenna doesn't exist", imageButton);
    }

    public void testImageButtonOfScannerExists() {
        MainActivity mainActivity = getActivity();
        ImageButton imageButton = (ImageButton) mainActivity.findViewById(R.id.imgBtnScanner);

        assertNotNull("Target of Scanner doesn't exist", imageButton);
    }

    public void testImageButtonOfHandExists() {
        MainActivity mainActivity = getActivity();
        ImageButton imageButton = (ImageButton) mainActivity.findViewById(R.id.imgBtnHand);

        assertNotNull("Target of Hand doesn't exist", imageButton);
    }

    public void testImageButtonOfPowerCoreExists() {
        MainActivity mainActivity = getActivity();
        ImageButton imageButton = (ImageButton) mainActivity.findViewById(R.id.imgBtnPowerCore);

        assertNotNull("Target of Power Core doesn't exist", imageButton);
    }

    public void testImageButtonOfLaserExists() {
        MainActivity mainActivity = getActivity();
        ImageButton imageButton = (ImageButton) mainActivity.findViewById(R.id.imgBtnLaser);

        assertNotNull("Target of Laser doesn't exist", imageButton);
    }

    public void testImageButtonOfLegExists() {
        MainActivity mainActivity = getActivity();
        ImageButton imageButton = (ImageButton) mainActivity.findViewById(R.id.imgBtnLeg);

        assertNotNull("Target of Leg doesn't exist", imageButton);
    }

    public void testSwitchOfTargetExists() {
        MainActivity mainActivity = getActivity();
        Switch aSwitch = (Switch) mainActivity.findViewById(R.id.switchTargets);

        assertNotNull("Switch for targets doesn't exist", aSwitch);
    }

    public void testExistenceOfTargetsAfterToggled() {
        MainActivity mainActivity = getActivity();
        final Switch aSwitch = (Switch) mainActivity.findViewById(R.id.switchTargets);
        ImageButton imageButtonAntenna = (ImageButton) mainActivity.findViewById(R.id.imgBtnAntenna);
        ImageButton imageButtonScanner = (ImageButton) mainActivity.findViewById(R.id.imgBtnScanner);
        ImageButton imageButtonHand = (ImageButton) mainActivity.findViewById(R.id.imgBtnHand);
        ImageButton imageButtonPowerCore = (ImageButton) mainActivity.findViewById(R.id.imgBtnPowerCore);
        ImageButton imageButtonLaser = (ImageButton) mainActivity.findViewById(R.id.imgBtnLaser);
        ImageButton imageButtonLeg = (ImageButton) mainActivity.findViewById(R.id.imgBtnLeg);
        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                aSwitch.requestFocus();
            }
        });
        getInstrumentation().waitForIdleSync();
        //aSwitch.performClick();
        TouchUtils.clickView(this, aSwitch);

        assertNotNull("Target of Antenna doesn't exist", imageButtonAntenna);
        assertNotNull("Target of Scanner doesn't exist", imageButtonScanner);
        assertNotNull("Target of Hand doesn't exist", imageButtonHand);
        assertNotNull("Target of Power Core doesn't exist", imageButtonPowerCore);
        assertNotNull("Target of Laser doesn't exist", imageButtonLaser);
        assertNotNull("Target of Leg doesn't exist", imageButtonLeg);
    }

    public void testIntroductionTextViewExists() {
        MainActivity mainActivity = getActivity();
        TextView textView = (TextView) mainActivity.findViewById(R.id.txtIntroduction);

        assertNotNull("TextView for introduction text doesn't exist", textView);
    }

    public void testQRScannerButtonExists() {
        MainActivity mainActivity = getActivity();
        Button button = (Button) mainActivity.findViewById(R.id.btnQRScanner);

        assertNotNull("Button for QR Scanner doesn't exist", button);
    }

    public void testGPSFeatureButtonExists() {
        MainActivity mainActivity = getActivity();
        Button button = (Button) mainActivity.findViewById(R.id.btnGPS);

        assertNotNull("Button for GPS doesn't exist", button);
    }


    public void testAboutUsButtonExists() {
        MainActivity mainActivity = getActivity();
        Button button = (Button) mainActivity.findViewById(R.id.btnAboutUs);

        assertNotNull("Button for About Us doesn't exist", button);
    }


    public void testFeedbackButtonExists() {
        MainActivity mainActivity = getActivity();
        Button button = (Button) mainActivity.findViewById(R.id.btnFeedback);

        assertNotNull("Button for Feedback doesn't exist", button);
    }


    public void testKingsCollegeRoboticsButtonExists() {
        MainActivity mainActivity = getActivity();
        Button button = (Button) mainActivity.findViewById(R.id.btnKingsRobotics);

        assertNotNull("Button for King's College Robotics doesn't exist", button);
    }

    public void testScienceGalleryButtonExists() {
        MainActivity mainActivity = getActivity();
        Button button = (Button) mainActivity.findViewById(R.id.btnScienceGallery);

        assertNotNull("Button for Science Gallery doesn't exist", button);
    }

    public void testExhibitionMapButtonExists() {
        MainActivity mainActivity = getActivity();
        Button button = (Button) mainActivity.findViewById(R.id.btnExhibitionMap);

        assertNotNull("Button for Exhibition Map doesn't exist", button);
    }
}
