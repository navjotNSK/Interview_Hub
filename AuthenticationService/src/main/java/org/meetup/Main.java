package org.meetup;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.meetup.service.LoginService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting Login Server");
        Server server = ServerBuilder.forPort(8081).addService(new LoginService()).build();
        server.start();
        System.out.println("Server started on port number:"+server.getPort());
        server.awaitTermination();
    }
}