package com.example.maheshuk31.killerrobotapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FeedbackActivity extends AppCompatActivity implements View.OnClickListener{

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

    @Override
    public void onClick(View v) {
        sendFeedback();

    }

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
}
