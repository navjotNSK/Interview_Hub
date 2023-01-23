package tester;

import java.io.IOException;

import com.gl.service.RegistrationService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Main {

	  public static void main(String[] args) throws IOException, InterruptedException {
	    	System.out.println("Starting a GRPC server!!");
	        Server server = ServerBuilder.forPort(8080).addService(new RegistrationService()).build();

	        server.start();
	        System.out.println("Server started on port number:"+ server.getPort());
	        
//	        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//	            
//	            System.out.println("Recieved ShutDown Request");
//	            server.shutdown();
//	            System.out.println("Server Stopped");
//	            
//	        }));
	        
	        server.awaitTermination();

	    }

}
