package com.interview_HUB;

import com.interview_HUB.service.feedbackService;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("inside client main method");
        io.grpc.Server server = ServerBuilder.forPort(8085).addService(new feedbackService()).build();
        server.start();
        System.out.println("Server is stared:"+server.getPort());
        server.awaitTermination();
    }

}
