package bookingServices;


import com.EmailSending.project.EmailGrpc;
import com.EmailSending.project.EmailOuterClass;
import com.interviewHub.slotBooking.InterviewSlot.slotDetails;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class slotBookingClient {

	public static void sendEmail(slotDetails request) {
		// TODO Auto-generated method stub

		ManagedChannel channel=ManagedChannelBuilder.forAddress("localhost", 8092)
				.usePlaintext()
				.build();
		EmailGrpc.EmailBlockingStub stub=EmailGrpc.newBlockingStub(channel);
		EmailOuterClass.Notifications EmailRequest=EmailOuterClass.Notifications.newBuilder().setReceiverEmailId(request.getIntervieweeEmailId()).setDate(request.getDate()).setStartTime(request.getStartTime()).setEndTime(request.getEndTime()).setInterviewrName(request.getInterviewerEmailId()).build();

		
		
//
	}

}
