package com.interview_HUB.service;

import com.interview_HUB.grpc.Feedback;
import com.interview_HUB.grpc.feedbackGrpc;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class feedbackService extends feedbackGrpc.feedbackImplBase {
    @Override
    public void addFeedback(Feedback.feedbackMessage request, StreamObserver<Feedback.APIResponse> responseObserver) {
        String check = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
        Pattern p=Pattern.compile(check);
        Matcher matcher=p.matcher(request.getEmail());
        Feedback.APIResponse.Builder response = Feedback.APIResponse.newBuilder();

        if(matcher.matches()==true){
            int rows = Database.insertfeedback(request);

            if (rows == 0) {
                response.setResponseMessage("empty review, please give any feedback").setResponseCode(100);
                System.out.println("empty review ");
            } else {
                response.setResponseMessage("feedback successfully submitted").setResponseCode(200);
                System.out.println("feedback successfully submitted");
            }

            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }else {
            response.setResponseMessage("Invalid email!!!! Enter a valid email").setResponseCode(200);
            System.out.println("Invalid email address");

            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getAllFeedback(Feedback.empty request, StreamObserver<Feedback.AllFeedbackResponse> responseObserver) {

        List<Feedback.feedbackMessage> list=Database.getAllfeed(request);

        Feedback.AllFeedbackResponse.Builder response=Feedback.AllFeedbackResponse.newBuilder();

            System.out.println(list);
            response.addAllMessages(list);


        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}



