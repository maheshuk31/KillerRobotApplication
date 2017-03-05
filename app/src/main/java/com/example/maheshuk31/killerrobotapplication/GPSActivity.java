package com.example.maheshuk31.killerrobotapplication;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Feature for adding GPS integration to work with the exhibition being in a certain GPS Range to open
 * the activity on the fly rather then pressing.
 */
public class GPSActivity extends AppCompatActivity implements LocationListener {

    private TextView txtLong, txtLati;
    private Button btnGetGPS;
    private String stringLongitude, stringLatitude;
    private LocationManager locationManager;
    private final int MY_PERMISSIONS_REQUEST_FINE_LOCATION = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * Used to make sure permissions are set for GPS on the device making sure the person allows
         * the permission.
         */
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION)
                    != PackageManager.PERMISSION_GRANTED) {

                if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                        Manifest.permission.ACCESS_FINE_LOCATION)) {
                } else {

                    ActivityCompat.requestPermissions(this,
                            new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                            MY_PERMISSIONS_REQUEST_FINE_LOCATION);
                }
            } else {
                getGPS();
            }
        } else {
            getGPS();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps);

        txtLong = (TextView) findViewById(R.id.txtLong);
        txtLati = (TextView) findViewById(R.id.txtLati);

        btnGetGPS = (Button) findViewById(R.id.btnGetGPS);
//        btnGetGPS.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                txtLong.setText(stringLongitude);
//                txtLati.setText(stringLatitude);
//            }
//        });
    }

    /**
     * Takes the permission gained from the person allowing or denying that, a default method needed.
     *
     * @param requestCode  Default parameter stored as an Integer obtaining the request made.
     * @param permissions  Default parameter stored as a String array for permissions made.
     * @param grantResults Default parameter stored as a Integer array of results obtained.
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_FINE_LOCATION: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    getGPS();
                } else {
                }
                return;
            }
        }
    }

    /**
     * Obtains the location of the person each time through the location manager class. Consistently
     * updating the location of the user.
     */
    @SuppressWarnings("ResourceType")
    public void getGPS() {
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
    }

    /**
     * Default method of when the GPS location changed and stores into a string every time.
     *
     * @param location Default parameter needed for locations to be obtained.
     */
    @Override
    public void onLocationChanged(Location location) {

        //TODO: MAY NEED TO ROUND THE NUMBERS!

        stringLatitude = location.getLatitude() + "";
        stringLongitude = location.getLongitude() + "";
        txtLong.setText(stringLongitude);
        txtLati.setText(stringLatitude);
    }

    /**
     * Default method used for implementing Location Listener for status being changed.
     *
     * @param provider Default parameter stored as a String for the provider.
     * @param status   Default parameter stored as a Integer for the status.
     * @param extras   Default parameter stored as a Bundle for the extras.  
     */
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }

    /**
     * Default method used for implementing Location Listener of provider being enabled.
     *
     * @param provider Default parameter stored as a String for the provider.
     */
    @Override
    public void onProviderEnabled(String provider) {
    }

    /**
     * Default method used for implementing Location Listener of provider being disabled.
     *
     * @param provider Default parameter stored as a String for the provider.
     */
    @Override
    public void onProviderDisabled(String provider) {
    }
}
