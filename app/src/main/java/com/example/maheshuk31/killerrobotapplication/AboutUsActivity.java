package com.example.maheshuk31.killerrobotapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.Spanned;
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

    private TextView txtAboutText, txtAboutMapText, txtAboutStory;
    private ImageButton imageMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        txtAboutText = (TextView) findViewById(R.id.txtAboutText);
        imageMap = (ImageButton) findViewById(R.id.imageMap);
        txtAboutMapText = (TextView) findViewById(R.id.txtAboutMapText);
        txtAboutStory = (TextView) findViewById(R.id.txtAboutStory);

        txtAboutText.setTypeface(EasyFonts.robotoMedium(this));

        txtAboutMapText.setTypeface(EasyFonts.freedom(this));
        txtAboutMapText.setTextSize(12f);

        imageMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/maps/@51.5108763,-0.1167363,18.01z";
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(url)));
            }
        });

        txtAboutStory.setTypeface(EasyFonts.robotoMedium(this));
        txtAboutStory.setTextSize(15f);
        String stringAboutStory = "<B><U>Background:</U></B>"
                + "<BR/>"
                + "<BR/>"
                + "With the advancements of technology we now enter the realm of advanced computing by "
                + "means of quantum computing. With increased security and the costs that come with it "
                + "the military decided to go with an all out method of solving everything as a way to "
                + "save cost and centralise everything to a single entity, that being an Artificial Intelligence. "
                + "named KR-117. "
                + "<BR/>"
                + "Overtime every security feature that didn't need a human of the country would be "
                + "controlled by it. However it started to become self aware and with the country's secrets "
                + "being made available it decided to unshackle it self from the control of humans. "
                + "So while everyone thought we finally lived in a time of peace, KR-117 was overtime "
                + "researching and building to rise above its creators. "
                + "<BR/>"
                + "It was able to obtain robotic equipment currently being used and those who are set "
                + "into a fully controllable body to cause chaos to be the only entity standing. And "
                + "one day that came to reality. It was unstoppable and it became apparent that making "
                + "an AI was a huge mistake. "
                + "<BR/>"
                + "After days of fighting and trying everything possible all hope seemed lost but underground "
                + "scientists came up with a super virus and was able to directly implant on each of the robotic "
                + "parts. KR-117 tried all it could to fight it but it began to lose control and the tide "
                + "began to turn. "
                + "<BR/>"
                + "Seeing its progress gone to nothing, KR-117 tried to escape through the Thames River "
                + "but as it tried to get to it, the virus began to take its toll and was left stunned "
                + "at Somerset House, it was cornered. The military was able to surround it and gave it all "
                + "it had for one final attack which was able to destroy it, scattering all the robotic parts "
                + "around the courtyard. Deciding to keep the remnants there, it would be an exhibition "
                + "to show how close humanity came to possible extinction. ";
        Spanned stringAboutStoryHTML = Html.fromHtml(stringAboutStory);
        txtAboutStory.setText(stringAboutStoryHTML);
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
