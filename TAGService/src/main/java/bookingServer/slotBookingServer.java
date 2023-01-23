package bookingServer;

import java.io.IOException;

import bookingServices.bookingService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class slotBookingServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Starting grpc server");
		Server server = ServerBuilder.forPort(8083).addService(new bookingService()).build(); // create a instance of server
		
		server.start();
		System.out.println("Server Started at "+ server.getPort());
		server.awaitTermination();
	}

}
