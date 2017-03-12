package com.example.maheshuk31.killerrobotapplication;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FeedbackActivityInstrumentationTests extends ActivityInstrumentationTestCase2<FeedbackActivity> {

    public FeedbackActivityInstrumentationTests() {
        super(FeedbackActivity.class);
    }

    public void testFeedbackActivityExists() {
        FeedbackActivity feedbackActivity = getActivity();

        assertNotNull("FeedbackActivity doesn't exist", feedbackActivity);
    }

    public void testTextViewOfFeedback() {
        FeedbackActivity feedbackActivity = getActivity();
        TextView textView = (TextView) feedbackActivity.findViewById(R.id.txtFeedbackMessage);

        assertNotNull("Text of feedback doesn't exist", textView);
    }

    public void testEditViewOfFeedbackName() {
        FeedbackActivity feedbackActivity = getActivity();
        EditText editText = (EditText) feedbackActivity.findViewById(R.id.txtFeedbackName);

        assertNotNull("EditText of feedback name doesn't exist", editText);
    }

    public void testEditViewOfFeedbackEmail() {
        FeedbackActivity feedbackActivity = getActivity();
        EditText editText = (EditText) feedbackActivity.findViewById(R.id.txtFeedbackEmail);

        assertNotNull("EditText of feedback email doesn't exist", editText);
    }

    public void testEditViewOfFeedbackMessage() {
        FeedbackActivity feedbackActivity = getActivity();
        EditText editText = (EditText) feedbackActivity.findViewById(R.id.txtFeedbackMessage);

        assertNotNull("EditText of feedback message doesn't exist", editText);
    }

    public void testSendFeedbackButton() {
        FeedbackActivity feedbackActivity = getActivity();
        Button button = (Button) feedbackActivity.findViewById(R.id.btnSendFeedback);

        assertNotNull("Button of send feedback doesn't exist", button);
    }
}
