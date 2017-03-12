package com.example.maheshuk31.killerrobotapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

/**
 * About us page explaining basically what the application is about and who we are, as well as a map
 * showing where the exhibit is and a link to it via an image opening it either by the device's browser
 * or Google Maps application if installed.
 */
public class AboutUsActivity extends AppCompatActivity {

    private TextView txtAboutText, txtAboutMapText;
    private ImageButton imageMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        txtAboutText = (TextView) findViewById(R.id.txtAboutText);
        imageMap = (ImageButton) findViewById(R.id.imageMap);
        txtAboutMapText = (TextView) findViewById(R.id.txtAboutMapText);

        txtAboutText.setTypeface(EasyFonts.robotoMedium(this));

        txtAboutMapText.setTypeface(EasyFonts.freedom(this));
        txtAboutMapText.setTextSize(15f);

        imageMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/@51.5108763,-0.1167363,18.01z";
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url)));
            }
        });
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
