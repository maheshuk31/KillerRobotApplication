package com.example.maheshuk31.killerrobotapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GPSActivityInstrumentationTests extends ActivityInstrumentationTestCase2<GPSActivity> {

    public GPSActivityInstrumentationTests() {
        super(GPSActivity.class);
    }

    public void testGPSActivityExists() {
        GPSActivity gpsActivity = getActivity();

        assertNotNull("GPSkActivity doesn't exist", gpsActivity);
    }

    public void testTextViewOfCurrentGPSLongitude() {
        GPSActivity gpsActivity = getActivity();
        TextView textView = (TextView) gpsActivity.findViewById(R.id.txtGPSCurrentLocation);

        assertNotNull("Text of current doesn't exist", textView);
    }

    public void testImageViewOfAntennaGPSKey() {
        GPSActivity gpsActivity = getActivity();
        ImageView imageView = (ImageView) gpsActivity.findViewById(R.id.imgGPSAntenna);

        assertNotNull("ImageView of antenna GPS key doesn't exist", imageView);
    }

    public void testTextViewOfAntennaGPS() {
        GPSActivity gpsActivity = getActivity();
        TextView textView = (TextView) gpsActivity.findViewById(R.id.txtGPSAntenna);

        assertNotNull("Text of antenna location doesn't exist", textView);
    }

    public void testImageViewOfScannerGPSKey() {
        GPSActivity gpsActivity = getActivity();
        ImageView imageView = (ImageView) gpsActivity.findViewById(R.id.imgGPSScanner);

        assertNotNull("ImageView of scanner GPS key doesn't exist", imageView);
    }

    public void testTextViewOfScannerGPS() {
        GPSActivity gpsActivity = getActivity();
        TextView textView = (TextView) gpsActivity.findViewById(R.id.txtGPSScanner);

        assertNotNull("Text of scanner location doesn't exist", textView);
    }

    public void testImageViewOfPowerCoreGPSKey() {
        GPSActivity gpsActivity = getActivity();
        ImageView imageView = (ImageView) gpsActivity.findViewById(R.id.imgGPSPowerCore);

        assertNotNull("ImageView of power core GPS key doesn't exist", imageView);
    }

    public void testTextViewOfPowerCoreGPS() {
        GPSActivity gpsActivity = getActivity();
        TextView textView = (TextView) gpsActivity.findViewById(R.id.txtGPSPowerCore);

        assertNotNull("Text of power core location doesn't exist", textView);
    }

    public void testImageViewOfArmGPSKey() {
        GPSActivity gpsActivity = getActivity();
        ImageView imageView = (ImageView) gpsActivity.findViewById(R.id.imgGPSArm);

        assertNotNull("ImageView of arm GPS key doesn't exist", imageView);
    }

    public void testTextViewOfArmGPS() {
        GPSActivity gpsActivity = getActivity();
        TextView textView = (TextView) gpsActivity.findViewById(R.id.txtGPSArm);

        assertNotNull("Text of arm location doesn't exist", textView);
    }

    public void testImageViewOfLaserGPSKey() {
        GPSActivity gpsActivity = getActivity();
        ImageView imageView = (ImageView) gpsActivity.findViewById(R.id.imgGPSLaser);

        assertNotNull("ImageView of laser GPS key doesn't exist", imageView);
    }

    public void testTextViewOfLaserGPS() {
        GPSActivity gpsActivity = getActivity();
        TextView textView = (TextView) gpsActivity.findViewById(R.id.txtGPSLaser);

        assertNotNull("Text of laser location doesn't exist", textView);
    }

    public void testImageViewOfLegGPSKey() {
        GPSActivity gpsActivity = getActivity();
        ImageView imageView = (ImageView) gpsActivity.findViewById(R.id.imgGPSLeg);

        assertNotNull("ImageView of leg GPS key doesn't exist", imageView);
    }

    public void testTextViewOfLegGPS() {
        GPSActivity gpsActivity = getActivity();
        TextView textView = (TextView) gpsActivity.findViewById(R.id.txtGPSLeg);

        assertNotNull("Text of leg location doesn't exist", textView);
    }

    public void testTextViewOfGPSTextExplanationLatitude() {
        GPSActivity gpsActivity = getActivity();
        TextView textView = (TextView) gpsActivity.findViewById(R.id.txtGPSTextExplanation);

        assertNotNull("Text of GPS explanation doesn't exist", textView);
    }

    public void testGPSRefreshButton() {
        GPSActivity gpsActivity = getActivity();
        Button button = (Button) gpsActivity.findViewById(R.id.btnGPSRefresh);

        assertNotNull("Button of GPS Refresh doesn't exist", button);
    }
}
