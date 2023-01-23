package com.EmailSending.project.Service;

import com.EmailSending.project.EmailGrpc;
import com.EmailSending.project.EmailOuterClass;
import io.grpc.stub.StreamObserver;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailService extends EmailGrpc.EmailImplBase {
    private static String from="interviewkrhub.786@gmail.com";
    @Override
    public void sendEmailOnSlotBooking(EmailOuterClass.Notifications request, StreamObserver<EmailOuterClass.APIResponse> responseObserver) {
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
        //String from = request.getSenderEmailId();
        String recipient = request.getReceiverEmailId();
        String sub = "Invitation to interview at GlobalLogic india pvt. ltd. for the position of "+request.getJobTitle();
        String msg = "Dear "+request.getIntervieweeName()+"," +"\n"+"Thank you for applying to GlobalLogic. your application for the position of "+
                request.getJobTitle()+" stood out to us and we would like to invite you for an interview with us on "
                +request.getDate()+". your interview timings will be "+request.getStartTime()+" to "+request.getEndTime() +" and your interviewer will be "
                +request.getInterviewrName()+ ". Please find interview meeting link at the end of this email."+
                "you are requested to join the meeting 5 minutes before interview start time"+". Please feel free to write to us in case of any query regarding interview."+
               "\n  \n Interview meeting link : "+request.getMeetingInvitationLink()+
                "\n \n \nThanks and Regards,\n \nTeam HR(GlobalLogic india Pvt Ltd)";


              //  request.getMessageText();
        //for gmail
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
       // properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.starttls.required", "true");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        //session obj
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication("interviewkrhub.786@gmail.com", "rqrndibncpggfurk");
              //  return new PasswordAuthentication("interviewkrHub.786@gmail.com", "rwmzfdpkvswihnuo");
            }
        });
        //compose msg+ debugging
        session.setDebug(true);
        MimeMessage mimeMessage = new MimeMessage(session);
        try {
            //from email
            mimeMessage.setFrom(from);
            //Adding recipient to msg
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            //adding sub
            mimeMessage.setSubject(sub);
            //adding text to msg
            mimeMessage.setText(msg);
            //send the message using Transport Class
            Transport.send(mimeMessage);
            System.out.println("Interview Schedule successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        EmailOuterClass.APIResponse.Builder response = EmailOuterClass.APIResponse.newBuilder();
        response.setResponseMessage("Interview Schedule successfully").setMessageCode(20);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void sendEmailOnSlotUpdate(EmailOuterClass.Notifications request, StreamObserver<EmailOuterClass.APIResponse> responseObserver) {
        Properties properties = System.getProperties();
        String host = "smtp.gmail.com";
       // String from = "interviewhubkr.786@gmail.com";
        String recipient = request.getReceiverEmailId();
        String sub = "Updated Invitation at GlobalLogic india pvt. ltd. for the position of: "+request.getJobTitle() ;
        String msg = "Dear "+request.getIntervieweeName()+"," +"\n"+
                "As per your request we are going to reschedule your interview date on " +request.getDate()+
                "your your updated interview timings will be" +
                request.getStartTime()+" to "+request.getEndTime() +" and your interviewer will be "
                +request.getInterviewrName()+ ". Please find interview meeting link at the end of this email."+
                "you are requested to join the meeting 5 minutes before interview start time"+"." +
                " Please feel free to write to us in case of any query regarding interview."+
                "\n  \n Interview meeting link : "+request.getMeetingInvitationLink()+
                "\n \n \nThanks and Regards,\n For any query regarding interview, feel free to connect to us\nTeam HR(GlobalLogic india Pvt Ltd)";;

        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        //session obj
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("interviewkrhub.786@gmail.com", "rqrndibncpggfurk");
            }
        });
        //compose msg+ debugging
        session.setDebug(true);
        MimeMessage mimeMessage = new MimeMessage(session);
        try {
            //from email
            mimeMessage.setFrom(from);
            //Adding recipient to msg
            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            //adding sub
            mimeMessage.setSubject(sub);
            //adding text to msg
            mimeMessage.setText(msg);
            //send the message using Transport Class
            Transport.send(mimeMessage);
            System.out.println("Interview Date updated successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        EmailOuterClass.APIResponse.Builder response = EmailOuterClass.APIResponse.newBuilder();
        response.setResponseMessage("Interview Date updated successfully").setMessageCode(21);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }



    @Override
    public void sendEmailOnSlotcancellation(EmailOuterClass.Notifications request, StreamObserver<EmailOuterClass.APIResponse> responseObserver) {

            Properties properties = System.getProperties();
            String host = "smtp.gmail.com";
     //       String from = request.getSenderEmailId();
            String recipient = request.getReceiverEmailId();
            String sub = "Interview  Cancelled! at GlobalLogic india pvt. ltd. for the position of: "+request.getJobTitle() ;
        String msg ="Dear "+request.getIntervieweeName()+"," +"\n"+
                "This is to inform you that your interview has been  cancelled .We will update you with new Schedule:"+
                "\n  \nThanks and Regards,\n\nTeam HR(GlobalLogic india Pvt Ltd)";
       //             request.getMessageText();
            //for gmail
            properties.put("mail.smtp.host", host);
            properties.put("mail.smtp.port", "465");
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.auth", "true");
            //session obj
            Session session = Session.getInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("interviewkrhub.786@gmail.com", "rqrndibncpggfurk");
                }
            });
            //compose msg+ debugging
            session.setDebug(true);
            MimeMessage mimeMessage = new MimeMessage(session);
            try {
                //from email
         //       mimeMessage.setFrom(from);
                //Adding recipient to msg
                mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
                //adding sub
                mimeMessage.setSubject(sub);
                //adding text to msg
                mimeMessage.setText(msg);
                //send the message using Transport Class
                Transport.send(mimeMessage);
                System.out.println("Interview Cancelled successfully");
            } catch (Exception e) {
                e.printStackTrace();
            }
            EmailOuterClass.APIResponse.Builder response = EmailOuterClass.APIResponse.newBuilder();
            response.setResponseMessage("Interview Cancelled successfully").setMessageCode(22);
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
        }


