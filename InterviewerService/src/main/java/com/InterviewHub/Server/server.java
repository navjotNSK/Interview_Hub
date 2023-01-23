package com.InterviewHub.Server;

import com.InterviewHub.Services.InterviewerService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class server {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server= ServerBuilder.forPort(8082).addService(new InterviewerService()).build();
        server.start();
        System.out.println("server has been started on port: "+server.getPort());
        server.awaitTermination();;
    }
}
