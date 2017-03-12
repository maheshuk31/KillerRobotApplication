package com.example.maheshuk31.killerrobotapplication;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
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

import com.vstechlab.easyfonts.EasyFonts;

/**
 * Feature for adding GPS integration to work with the exhibition being in a certain GPS Range to open
 * the activity on the fly rather then pressing.
 */
public class GPSActivity extends AppCompatActivity implements LocationListener {

    private TextView txtGPSCurrentLocation, txtGPSTextExplanation;
    private boolean GPSEnabled = false;
    private Button btnGPSRefresh;
    private String stringLongitude, stringLatitude;
    private String stringZero = " ";
    private LocationManager locationManager;
    private final int MY_PERMISSIONS_REQUEST_FINE_LOCATION = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * Used to make sure permissions are set for GPS on the device making sure the person allows
         * the permission.
         */
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_FINE_LOCATION)) {
                } else {
                    ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, MY_PERMISSIONS_REQUEST_FINE_LOCATION);
                }
            } else {
                getGPS();
            }
        } else {
            getGPS();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps);

        txtGPSCurrentLocation = (TextView) findViewById(R.id.txtGPSCurrentLocation);
        txtGPSTextExplanation = (TextView) findViewById(R.id.txtGPSTextExplanation);

        txtGPSCurrentLocation.setText("GPS");
        if(GPSEnabled == false){
            txtGPSCurrentLocation.setText("There is no location found, please check your GPS is enabled and press the refresh button. ");
        }

        txtGPSCurrentLocation.setTypeface(EasyFonts.robotoMedium(this));

        txtGPSTextExplanation.setTypeface(EasyFonts.caviarDreamsItalic(this));

        btnGPSRefresh = (Button) findViewById(R.id.btnGPSRefresh);
        btnGPSRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recreate();
            }
        });
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
     * Default method of when the GPS location changed and stores into a string every time. It is rounded
     * to 5 decimal places for accuracy. There is a checker to see if the user is within one of the GPS
     * points where the activity will open upon being there.
     *
     * @param location Default parameter needed for locations to be obtained.
     */
    @Override
    public void onLocationChanged(Location location) {
        GPSEnabled = true;
        double dblLatitude = location.getLatitude();
        double dblLongitude = location.getLongitude();
        stringLatitude = String.format("%.5f", dblLatitude);
        stringLongitude = String.format("%.5f", dblLongitude);
        txtGPSCurrentLocation.setText("Your current location is: " + "\n"
                + "Longitude: " + stringLongitude + "\n"
                + "Latitude: " + stringLatitude + "\n"
                + stringZero);

        if (stringLatitude.equals("51.51079") && stringLongitude.equals("-0.11734")) {
            Intent intent = new Intent(GPSActivity.this, AntennaActivity.class);
            startActivity(intent);
            locationManager.removeUpdates(this);
        } else if (stringLatitude.equals("51.51097") && stringLongitude.equals("-0.11747")) {
            Intent intent = new Intent(GPSActivity.this, HandActivity.class);
            startActivity(intent);
            locationManager.removeUpdates(this);
        } else if (stringLatitude.equals("51.51121") && stringLongitude.equals("-0.11768")) {
            Intent intent = new Intent(GPSActivity.this, LaserActivity.class);
            startActivity(intent);
            locationManager.removeUpdates(this);
        } else if (stringLatitude.equals("51.51106") && stringLongitude.equals("-0.11716")) {
            Intent intent = new Intent(GPSActivity.this, LegActivity.class);
            startActivity(intent);
            locationManager.removeUpdates(this);
        } else if (stringLatitude.equals("51.51132") && stringLongitude.equals("-0.11707")) {
            Intent intent = new Intent(GPSActivity.this, PowerCoreActivity.class);
            startActivity(intent);
            locationManager.removeUpdates(this);
        } else if (stringLatitude.equals("51.51090") && stringLongitude.equals("-0.11678")) {
            Intent intent = new Intent(GPSActivity.this, ScannerActivity.class);
            startActivity(intent);
            locationManager.removeUpdates(this);
        } else if (stringLatitude.equals("0.00000") && stringLongitude.equals("0.00000")) {
            stringZero = "There is no location found, please check your GPS is enabled and press the refresh button. ";
            txtGPSCurrentLocation.setText(stringZero);
        }
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

    /**
     * Overrides the normal press of the back button on the device to now close the activity needed
     * to save memory from background activities that are open.
     */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
