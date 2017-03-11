package com.example.maheshuk31.killerrobotapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Page that allows a user to give feedback on the application or any questions pertaining to this
 * project, via simple forms that need to be filled, sent to a specified email account.
 */
public class FeedbackActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtName, txtEmail, txtMessage;
    private Button btnSendFeedback;
    private String feedbackName, feedbackEmail, feedbackMessage, message;
    private String email = "killerrobotproject@gmail.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        txtName = (EditText) findViewById(R.id.txtFeedbackName);
        txtEmail = (EditText) findViewById(R.id.txtFeedbackEmail);
        txtMessage = (EditText) findViewById(R.id.txtFeedbackMessage);

        btnSendFeedback = (Button) findViewById(R.id.btnSendFeedback);
        btnSendFeedback.setOnClickListener(this);
    }

    /**
     * Implemented "onClick" method linked to a method used by the button that will get the information
     * and send it.
     *
     * @param v Default view needed for the "onClick" method to work.
     */
    @Override
    public void onClick(View v) {
        sendFeedback();
    }

    /**
     * Gets the information from the fields, converts each to a String and stores it into a global
     * String which is then structured to send an email to the specified email account.
     */
    private void sendFeedback() {
        feedbackName = txtName.getText().toString();
        feedbackEmail = txtEmail.getText().toString();
        feedbackMessage = txtMessage.getText().toString();

        message = "Feedback received from: " + feedbackName + "\n"
                + feedbackEmail + "\n" + "\n"
                + feedbackMessage;

        emailSending sm = new emailSending(this, email, message);
        sm.execute();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
