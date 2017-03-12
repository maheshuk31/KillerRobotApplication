package com.example.maheshuk31.killerrobotapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.TextView;

public class GPSActivityInstrumentationTests extends ActivityInstrumentationTestCase2<GPSActivity> {

    public GPSActivityInstrumentationTests() {
        super(GPSActivity.class);
    }

    public void testGPSActivityExists() {
        GPSActivity gpsActivity = getActivity();

        assertNotNull("GPSkActivity doesn't exist", gpsActivity);
    }

    public void testTextViewOfGPSLongitude() {
        GPSActivity gpsActivity = getActivity();
        TextView textView = (TextView) gpsActivity.findViewById(R.id.txtLong);

        assertNotNull("Text of GPS Longitude doesn't exist", textView);
    }

    public void testTextViewOfGPSLatitude() {
        GPSActivity gpsActivity = getActivity();
        TextView textView = (TextView) gpsActivity.findViewById(R.id.txtLati);

        assertNotNull("Text of GPS Latitude doesn't exist", textView);
    }

    public void testGPSRefreshButton() {
        GPSActivity gpsActivity = getActivity();
        Button button = (Button) gpsActivity.findViewById(R.id.btnGPSRefresh);

        assertNotNull("Button of GPS Refresh doesn't exist", button);
    }
}
