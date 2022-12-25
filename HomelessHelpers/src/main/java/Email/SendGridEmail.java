/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Email;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Keerthana
 */
public class SendGridEmail {
    public static void sendMail(String email) throws IOException {
   Email from = new Email("lnu.ke@northeastern.edu");
    String subject = "Sending with SendGrid is Fun";
    Email to = new Email(email);
    Content content = new Content("text/plain", "Thank you! You have been successfully registered to Homeless Helpers.");
    Mail mail = new Mail(from, subject, to, content);

    SendGrid sg = new SendGrid("SG.F2bOAoc4RBKXVChcll8U3g.u3xqyJJbVIMBqKpOgM8paUugUOXgxbXCUlXVsyUtOZU");
    Request request = new Request();
    try {
      request.setMethod(Method.POST);
      request.setEndpoint("mail/send");
      request.setBody(mail.build());
      Response response = sg.api(request);
      System.out.println(response.getStatusCode());
      System.out.println(response.getBody());
      System.out.println(response.getHeaders());
    } catch (IOException ex) {
      throw ex;
    }
  }
   
        
}
