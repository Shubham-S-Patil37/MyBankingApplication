package MailVarification;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class VarificationResources {

    /*
        NOTE :- 
                1> LESS SECURE APP OPTION SHOULD BE ON, OF YOUR EMAIL SETTING
                2> 2 STEP VARIFICATION SHOULD  BE OFF , OF YOUR EMAIL SETTING
    */
    
    public static String Email = "patil.boss3737@gmail.com";
    public static String password = "BossPatil12345678";
    
    public static void varifyEmail(String reciverMail,String Subject, String MailText){
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable","true");
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        Session session = Session.getDefaultInstance(prop,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication(){
                        return  new PasswordAuthentication(Email,password);
                    }
                });
        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(Email));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(reciverMail));
            msg.setSubject(Subject);
            msg.setText(MailText);
            Transport.send(msg);
        } catch (AddressException ex) {
            Logger.getLogger(VarificationResources.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(VarificationResources.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        String reciver = "patil.shubham1212@gmail.com";
        String sub = "My BAnking application";
        String body = "varification resources";
        varifyEmail(reciver,sub,body);
    }
}