package selenium;

import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
//import com.sun.mail.util.*;

/**
 * This class is used to send simple email.
 * @author w3spoint
 */

public class SendSimpleEmail {

	 final String senderEmailId = "dbhardwaj@maximaconsulting.net";
	 final String senderPassword = "Maxima@2018";
	 final String emailSMTPserver = "smtp-mail.outlook.com";
	 
	public static void main(String[] args) {
		
		new SendSimpleEmail("devyanib26@gmail.com", "Test Email", "Hi,\n\n This is a test email.");
	}

	public SendSimpleEmail(String receiverEmail, String subject, String messageText) {	
	 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.host", emailSMTPserver);
	 
		try { 		
			// To obtains authentication of a network
			Authenticator auth = new SMTPAuthenticator();
			
			// Session represent the mail session and an mail API
			Session session = Session.getInstance(props, auth);
			
			// Message handles the email message components
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(senderEmailId));
			message.setRecipients(Message.RecipientType.TO, 
			
			
			InternetAddress.parse(receiverEmail));
			message.setSubject(subject);
			message.setText(messageText);
	 
			// Transport is an abstract class
			Transport.send(message); 
			System.out.println("Email send successfully."); 
	    } 
		catch (Exception e) {
			e.printStackTrace();
			System.err.println("Error in sending email.");
	   }
	}
	 
	private class SMTPAuthenticator extends javax.mail.Authenticator {
	    public PasswordAuthentication getPasswordAuthentication() {
	        return new PasswordAuthentication(senderEmailId, senderPassword);
	    }
	}
}
