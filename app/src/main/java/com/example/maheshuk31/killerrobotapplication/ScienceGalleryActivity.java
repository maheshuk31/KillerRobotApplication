package com.example.maheshuk31.killerrobotapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

/**
 * Page explaining science gallery and pertaining towards this project containing a link to their
 * website opening it on the device's browser.
 */
public class ScienceGalleryActivity extends AppCompatActivity {

    private TextView txtScienceGalleryText, txtScienceGalleryConcept, txtScienceGalleryMoreInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_gallery);

        txtScienceGalleryText = (TextView) findViewById(R.id.txtScienceGalleryText);
        txtScienceGalleryConcept = (TextView) findViewById(R.id.txtScienceGalleryConcept);
        txtScienceGalleryMoreInfo = (TextView) findViewById(R.id.txtScienceGalleryMoreInfo);

        txtScienceGalleryText.setTypeface(EasyFonts.robotoMedium(this));

        txtScienceGalleryConcept.setTypeface(EasyFonts.caviarDreamsItalic(this));

        txtScienceGalleryMoreInfo.setText("Click For more information about Science Gallery");
        txtScienceGalleryMoreInfo.setTypeface(EasyFonts.freedom(this));
        txtScienceGalleryMoreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://london.sciencegallery.com/";
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url)));
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
