package com.example.maheshuk31.killerrobotapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.ImageView;
import android.widget.TextView;

public class ScienceGalleryActivityInstrumentationTests extends ActivityInstrumentationTestCase2<ScienceGalleryActivity> {

    public ScienceGalleryActivityInstrumentationTests() {
        super(ScienceGalleryActivity.class);
    }

    public void testScienceGalleryActivityExists() {
        ScienceGalleryActivity scienceGalleryActivity = getActivity();

        assertNotNull("ScienceGalleryActivity doesn't exist", scienceGalleryActivity);
    }

    public void testImageViewOfScienceGalleryHeaderExists() {
        ScienceGalleryActivity scienceGalleryActivity = getActivity();
        ImageView imageView = (ImageView) scienceGalleryActivity.findViewById(R.id.imageScienceGalleryHeader);

        assertNotNull("Image of Science Gallery header doesn't exist", imageView);
    }

    public void testScienceGalleryTextTextViewExists() {
        ScienceGalleryActivity scienceGalleryActivity = getActivity();
        TextView textView = (TextView) scienceGalleryActivity.findViewById(R.id.txtScienceGalleryText);

        assertNotNull("TextView for Science Gallery text doesn't exist", textView);
    }

    public void testImageViewOfScienceGalleryConceptExists() {
        ScienceGalleryActivity scienceGalleryActivity = getActivity();
        ImageView imageView = (ImageView) scienceGalleryActivity.findViewById(R.id.imageScienceGalleryConcept);

        assertNotNull("Image of Science Gallery concept doesn't exist", imageView);
    }

    public void testScienceGalleryConceptTextTextViewExists() {
        ScienceGalleryActivity scienceGalleryActivity = getActivity();
        TextView textView = (TextView) scienceGalleryActivity.findViewById(R.id.txtScienceGalleryConcept);

        assertNotNull("TextView for Science Gallery Concept text doesn't exist", textView);
    }

    public void testScienceGalleryMoreInfoTextTextViewExists() {
        ScienceGalleryActivity scienceGalleryActivity = getActivity();
        TextView textView = (TextView) scienceGalleryActivity.findViewById(R.id.txtScienceGalleryMoreInfo);

        assertNotNull("TextView for Science Gallery more info text doesn't exist", textView);
    }
}
