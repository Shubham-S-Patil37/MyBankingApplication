package MailVarification;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.IOException;
import java.util.Properties;

public class MailGenarator {

    /*
        NOTE :- 
                1> LESS SECURE APP OPTION SHOULD BE ON, OF YOUR EMAIL SETTING
                2> 2 STEP VARIFICATION SHOULD  BE OFF , OF YOUR EMAIL SETTING
    */
    
    static String username = "patil.boss3737@gmail.com"; 
    static String password = "BossPatil12345678";
    
    public static void getGenaratedMail(String recipientEmail, String filename, String sub, String msg) {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("from@no-spam.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(recipientEmail));
            message.setSubject(sub);

            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(msg, "text/html");    //we can use "text/plain" or any other format

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            // Attachment
            if (filename != null) {
                MimeBodyPart attachment = new MimeBodyPart();
                attachment.attachFile(filename);
                multipart.addBodyPart(attachment);
            }
            // Send the complete message parts
            message.setContent(multipart);
            Transport.send(message);
            System.err.println("success");
        } catch (MessagingException | IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void main(String args[]) {
        String reciver = "patil.shubham1212@gmail.com";
        String path = "C:\\Users\\Lenovo\\Desktop\\pqrs\\1.jpg";
        String sub = "My BAnking application";
        String body = "your otp is 373737";
        getGenaratedMail(reciver,path,sub,body);
    }
}