package com.example.maheshuk31.killerrobotapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutUsInstrumentationTests extends ActivityInstrumentationTestCase2<AboutUsActivity> {

    public AboutUsInstrumentationTests() {
        super(AboutUsActivity.class);
    }

    public void testAboutUsActivityExists() {
        AboutUsActivity aboutUsActivity = getActivity();

        assertNotNull("About Us Activity doesn't exist", aboutUsActivity);
    }

    public void testBannerImageViewExists() {
        AboutUsActivity aboutUsActivity = getActivity();
        ImageView imageView = (ImageView) aboutUsActivity.findViewById(R.id.imageBanner);

        assertNotNull("Image of banner doesn't exist", imageView);
    }

    public void testAboutTextTextViewExists() {
        AboutUsActivity aboutUsActivity = getActivity();
        TextView textView = (TextView) aboutUsActivity.findViewById(R.id.txtAboutText);

        assertNotNull("Text of about us doesn't exist", textView);
    }

    public void testMapImageButtonExists() {
        AboutUsActivity aboutUsActivity = getActivity();
        ImageButton imageButton = (ImageButton) aboutUsActivity.findViewById(R.id.imageMap);

        assertNotNull("Map image button doesn't exist", imageButton);
    }

    public void testMapTextTextViewExists() {
        AboutUsActivity aboutUsActivity = getActivity();
        TextView textView = (TextView) aboutUsActivity.findViewById(R.id.txtAboutMapText);

        assertNotNull("Text of map doesn't exist", textView);
    }
}
