package com.example.maheshuk31.killerrobotapplication;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Main class for the email system to work, working in conjunction with the JavaMail library that
 * was added as a dependency to the project. Uses secure method via SSL to make the message encrypted
 * when sent. The process is done by Google Mail, can easily be changed to another mailing method
 * via editing the ports and hosts.
 */
public class emailSending extends AsyncTask<Void, Void, Void> {

    private Context context;
    private Session session;
    private String email, message;
    private ProgressDialog progressDialog;

    /**
     * Allows the class to be used when the class is used to send an email.
     *
     * @param context Default context parameter needed when using emailing.
     * @param email   The recipient of the email which is a String.
     * @param message The message sent in the email which is a String.
     */
    public emailSending(Context context, String email, String message) {
        this.context = context;
        this.email = email;
        this.message = message;
    }

    /**
     * Default method provided that will produce a dialog while the email sending process is occurring.
     */
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        progressDialog = ProgressDialog.show(context, "Feedback Sending", "Please wait...", false, false);
    }

    /**
     * Once the execution of the method a toast message is produced once the email has been sent.
     *
     * @param aVoid Default parameter in the post execute.
     */
    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        progressDialog.dismiss();
        Toast.makeText(context, "Feedback Sent, Thank You", Toast.LENGTH_LONG).show();
    }

    /**
     * The main process of email being sent occurring in the background. Uses properties to allow an
     * email to be sent, uses an email configuration in another class (emailConfig.java) authorising
     * all the credentials needed to be sent. Email subject is also generated based on the devices
     * Date and Time.
     *
     * @param params Default parameter needed for the background method to work.
     * @return
     */
    @Override
    protected Void doInBackground(Void... params) {
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");

        session = Session.getDefaultInstance(properties,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(emailConfig.sendingEmail, emailConfig.sendingPassword);
                    }
                });

        try {
            MimeMessage mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(emailConfig.sendingEmail));
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(email));

            Calendar calendar = Calendar.getInstance();
            String am_pm;
            int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
            if (hourOfDay < 12) {
                am_pm = "am";
            } else {
                am_pm = "pm";
            }
            int minute = calendar.get(Calendar.MINUTE);
            int hour = calendar.get(Calendar.HOUR);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            int month = calendar.get(Calendar.MONTH);

            mimeMessage.setSubject("Feedback Received " + day + "/" + month + " " + hour + ":" + minute + am_pm);
            mimeMessage.setText(message);

            Transport.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return null;
    }

}
