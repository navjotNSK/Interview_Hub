package com.EmailSending.project.Service;

import io.grpc.ServerBuilder;

import java.io.IOException;

public class tester {

    public static void main(String[] args) throws InterruptedException, IOException {
        io.grpc.Server server = ServerBuilder.forPort(8084).addService(new EmailService()).build();
        server.start();
        System.out.println("Server started on port number:"+ server.getPort());
        server.awaitTermination();
    }
}
