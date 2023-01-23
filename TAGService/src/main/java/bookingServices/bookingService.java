package bookingServices;

import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

import com.interviewHub.slotBooking.InterviewSlot.bookingDetail;
import com.interviewHub.slotBooking.InterviewSlot.bookingMessage;
import com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse;
import com.interviewHub.slotBooking.InterviewSlot.interviewerId;
import com.interviewHub.slotBooking.InterviewSlot.rescheduleDetails;
import com.interviewHub.slotBooking.InterviewSlot.rescheduleMessage;
import com.interviewHub.slotBooking.InterviewSlot.slotDetails;
import com.interviewHub.slotBooking.InterviewSlot.slotIdDetails;
import com.interviewHub.slotBooking.InterviewSlot.slotIdResponse;
import com.interviewHub.slotBooking.InterviewSlot.tagTeamId;
import com.interviewHub.slotBooking.InterviewSlot.updateDetails;
import com.interviewHub.slotBooking.slotBookingGrpc.slotBookingImplBase;
import com.mysql.cj.xdevapi.Statement;

import dbConnector.dbConnection;
import io.grpc.stub.StreamObserver;
import validator.validators;

public class bookingService extends slotBookingImplBase{
	
	validators val=new validators();
	dbConnection connect=new dbConnection();
	
	//Scheduling Interview
	@Override
	public void scheduleInterview(slotDetails request,StreamObserver<bookingMessage> responseObserver) {

		String scheduleInterviewerEmailId=request.getInterviewerEmailId();

		if(validators.validateEmail(scheduleInterviewerEmailId)!=true) {

			responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Interviewer's emailId is not valid").asRuntimeException());
			return;
		}

		String scheduleIntervieweeEmailId=request.getIntervieweeEmailId();

		if(validators.validateEmail(scheduleIntervieweeEmailId)!=true) {

			responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Interviewee's emailId is not valid").asRuntimeException());
			return;
		}


		String scheduleTagTeamEmailId=request.getTagTeamEmailId();

		if(validators.validateEmail(scheduleTagTeamEmailId)!=true) {

			responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Tag Team's emailId is not valid").asRuntimeException());
			return;
		}


		String dat=request.getDate();

		if(validators.validateDate(dat)!=true) {

			responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Date is not valid..date format should be yyyy-mm-dd").asRuntimeException());
			return;
		}


		String sTime=request.getStartTime();

		if(validators.validateTime(sTime)!=true) {

			responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Start time is not valid..time format should be hh:mm am/pm").asRuntimeException());
			return;
		}


		String eTime=request.getEndTime();

		if(validators.validateTime(eTime)!=true) {

			responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("End time is not valid..time format should be hh:mm am/pm").asRuntimeException());
			return;
		}

		try {
			boolean timeValidating= validators.validateStartAndEndTime(sTime,eTime);
			if(timeValidating!=true) {
				responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Start time should be smaller than end time").asRuntimeException());
				return;
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}



		Date schDate = null;
		Time strtTime=null;
		Time edTime=null;
		try {


			java.util.Date utilDate1=new SimpleDateFormat("yyyy-MM-dd").parse(dat);
			schDate=new Date(utilDate1.getTime());
			System.out.println(schDate);

			java.util.Date utilDate2=new SimpleDateFormat("hh:mm a").parse(sTime);
			strtTime=new Time(utilDate2.getTime());


			java.util.Date utilDate3=new SimpleDateFormat("hh:mm a").parse(eTime);
			edTime=new Time(utilDate3.getTime());

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		Date scheduleDate=schDate;
		String scheduleBookingStatus=request.getBoookingStatus();


		Time scheduleStartTime=strtTime;
		Time scheduleEndTime=edTime;
		String scheduleTechStack=request.getTechStack();


		String scheduleDescription=request.getDescription();


		//is SLOT available

		 try {
				String isAvailable=((dbConnection) connect).isSlotAvailable(request.getInterviewerEmailId(),request.getDate() ,request.getStartTime(),request.getEndTime());
				if(!isAvailable.equals("Slot is available")) {
					responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription(" "+isAvailable+" ").asRuntimeException());
					return;
				}
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		 }


		System.out.println(scheduleDate);
		boolean slotOverlapping;
		try {
			slotOverlapping =((dbConnection) connect).overlappingBooking(scheduleInterviewerEmailId, scheduleDate,strtTime,edTime);
			if(slotOverlapping==true) {
				responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Slot is overlapping so choose another slot").asRuntimeException());
				return;
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}






		booking book=new booking();
		book.setInterviewerEmailId(scheduleInterviewerEmailId);
		book.setIntervieweeEmailId(scheduleIntervieweeEmailId);
		book.setTagTeamEmailId(scheduleTagTeamEmailId);
		book.setDate(scheduleDate);
		book.setBoookingStatus(scheduleBookingStatus);
		book.setStartTime(scheduleStartTime);
		book.setEndTime(scheduleEndTime);
		book.setTechStack(scheduleTechStack);
		book.setDescription(scheduleDescription);

		bookingMessage.Builder response=bookingMessage.newBuilder();

		try {

			boolean checkDuplicate=((dbConnection) connect).duplicate(book);

			if(checkDuplicate==true) {
				responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Same row present in database so please make changes in input").asRuntimeException());
				return;
			}

			ResultSet rs=connect.addInterview(book);

			List<booking> slotDetails = new ArrayList<booking>();

			while(rs.next())
			{
				slotDetails.add(new booking(rs.getInt("Id"),rs.getString("interviewerEmailId"),rs.getString("intervieweeEmailId"),rs.getString("tagTeamEmailId"),rs.getDate("interviewDate"),rs.getString("bookingStatus"),
						rs.getTime("startTime"),rs.getTime("endTime"),rs.getString("techStack"),rs.getString("interviewDescription")));
			}

			booking a=slotDetails.get(slotDetails.size()-1);

			int id=a.getId();
			String interviewerEmailId=a.getInterviewerEmailId();
			String intervieweeEmailId=a.getIntervieweeEmailId();
			String tagTeamEmailId=a.getTagTeamEmailId();
			Date scdDate=a.getDate();
			String boookingStatus=a.getBoookingStatus();
			Time startTime=a.getStartTime();
			Time endTime=a.getEndTime();
			String techStack=a.getTechStack();
			String description=a.getDescription();


			String date = new SimpleDateFormat("yyyy-MM-dd").format(scdDate);
			String start= new SimpleDateFormat("hh:mm a").format(startTime);
			String end= new SimpleDateFormat("hh:mm a").format(endTime);

			response.setId(id).setInterviewerEmailId(interviewerEmailId).setIntervieweeEmailId(intervieweeEmailId).setTagTeamEmailId(tagTeamEmailId)
				.setDate(date).setBoookingStatus(boookingStatus).setStartTime(start).setEndTime(end)
				.setTechStack(techStack).setDescription(description);

		}catch(Exception e) {

			responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Failure occure").asRuntimeException());
			e.printStackTrace();
		}
		slotBookingClient.sendEmail(request);
		responseObserver.onNext(response.build());
        responseObserver.onCompleted();
	}
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Rescheduling Interview
	
	@Override
	public void rescheduleInterview(rescheduleDetails request,StreamObserver<rescheduleMessage> responseObserver){
		
		int id=request.getSlotId();
		System.out.println(id);
	
		
//		String interviewerEmailId=request.getEmailId();
//		
//		if(validator.validateEmail(interviewerEmailId)!=true) {
//			
//			responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Interviewer's emailId is not valid").asRuntimeException());
//			return;
//		}
//		
		
		
		
		if(validators.validateDate(request.getDate())!=true) {
			
			responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Date is not valid..date format should be yyyy-mm-dd").asRuntimeException());
			return;
		}
		
	
		
		if(validators.validateTime(request.getStartTime())!=true) {
			
			responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Start time is not valid..time format should be hh:mm am/pm").asRuntimeException());
			return;
		}
		
		
		if(validators.validateTime(request.getEndTime())!=true) {
			
			responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("End time is not valid..time format should be hh:mm am/pm").asRuntimeException());
			return;
		}
		
		boolean timeValidating;
		try {
			timeValidating = validators.validateStartAndEndTime(request.getStartTime(),request.getEndTime());
			if(timeValidating!=true) {
				responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Start time should be smaller than end time").asRuntimeException());
				return;
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		Date schDate = null;
		Time strtTime=null;
		Time edTime=null;
		try {

			
			java.util.Date utilDate1=new SimpleDateFormat("yyyy-MM-dd").parse(request.getDate());
			schDate=new Date(utilDate1.getTime());

			
			java.util.Date utilDate2=new SimpleDateFormat("hh:mm a").parse(request.getStartTime());
			strtTime=new Time(utilDate2.getTime());

			
			java.util.Date utilDate3=new SimpleDateFormat("hh:mm a").parse(request.getEndTime());
			edTime=new Time(utilDate3.getTime());
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Date scheduleDate=schDate;
		Time scheduleStartTime=strtTime;
		Time scheduleEndTime=edTime;
		
		
		ResultSet res=((dbConnection) connect).fetchInterviewEmailId(id);
		String emailId=null;
		try {
			while(res.next()) {
				emailId=res.getString("interviewerEmailId");
			}
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		System.out.println(emailId);
		
		
		//is SLOT available
		
//		 try {
//				boolean isAvailable=((dbConnection) connect).isSlotAvailable(emailId,request.getDate() ,request.getStartTime(),request.getEndTime());
//				if(!isAvailable)
//					responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("No available slots found on given date or time").asRuntimeException());
//		 } catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//		 }
		
		try {
			String isAvailable=((dbConnection) connect).isSlotAvailable(emailId,request.getDate() ,request.getStartTime(),request.getEndTime());
			if(!isAvailable.equals("Slot is available")) {
				responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription(" "+isAvailable+" ").asRuntimeException());
				return;
			}
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		 }
		
		
	
		boolean slotOverlapping;
		try {
			slotOverlapping =((dbConnection) connect).overlappingBooking(emailId, scheduleDate, scheduleStartTime, scheduleEndTime);
			if(slotOverlapping==true) {
				responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Slot is overlapping so choose another slot").asRuntimeException());
				return;
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		rescheduleMessage.Builder response=rescheduleMessage.newBuilder();
		
		try {
			
			boolean check1=connect.idExist(id);
			
			
			if(check1==true) {
				connect.reschedule(id, scheduleDate, scheduleStartTime, scheduleEndTime);
				response.setMessageResponse("Successfully Reschedule").setMessageCode(200);
			}
			else {
				response.setMessageResponse("Id is not present").setMessageCode(400);
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		responseObserver.onNext(response.build());
        responseObserver.onCompleted();
		
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Fetching Scheduled Interview using Interviewer's ID  
	
	
	@Override
	public void getScheduledInterviewByInterviewerEmailId(interviewerId request,StreamObserver<bookingMessageResponse> responseObserver) {
	    	String emailId=request.getEmailId();
	    
	    	
	    	if(validators.validateEmail(emailId)!=true) {
				
				responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Interviewer's emailId is not valid").asRuntimeException());
				return;
			}
	    
	    	
	    	ResultSet rs=((dbConnection) connect).fetchDetail(emailId);
	    	
	    	List<List<String>> Users = new ArrayList<>();

	    	try {
				while(rs.next()) {
					List<String> User = new ArrayList<>();
					
					String s=String.valueOf(rs.getInt(1));
					User.add(s);
					User.add(rs.getString(2));
					User.add(rs.getString(3));
					User.add(rs.getString(4));
					
					
					String date = new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate(5));
					User.add(date);
					
					User.add(rs.getString(6));
					
					String start= new SimpleDateFormat("hh:mm a").format(rs.getTime(7));
					User.add(start);
					
					String end= new SimpleDateFormat("hh:mm a").format(rs.getTime(8));
					User.add(end);
					
					User.add(rs.getString(9));
					User.add(rs.getString(10));
					
					Users.add(User);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	

	    	bookingMessageResponse.Builder usersRes = bookingMessageResponse.newBuilder();
	    	
			List<bookingDetail> l = new ArrayList<bookingDetail>();
			if(!Users.isEmpty()) {
			
				for(List<String> user : Users) {
					
					bookingDetail.Builder userP = bookingDetail.newBuilder();
				
					System.out.println(user.get(0));
					userP.setId(user.get(0)).setInterviewerEmailId(user.get(1)).setIntervieweeEmailId(user.get(2)).setTagTeamEmailId(user.get(3))
				.setDate(user.get(4)).setBoookingStatus(user.get(5)).setStartTime(user.get(6)).setEndTime(user.get(7))
				.setTechStack(user.get(8)).setDescription(user.get(9));
					
					l.add(userP.build());
				
				}
			
				usersRes.addAllBookingDetailArray(l);
			}else {
					usersRes.build();
					responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("User with " + emailId +" not present.").asRuntimeException());
			return;	
			}
				responseObserver.onNext(usersRes.build());
		        responseObserver.onCompleted();
	    	      
    }

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	//update interview
		@Override
		public void updateBookingStatus(updateDetails request, StreamObserver<bookingMessage> responseObserver) {

			int idd=request.getId();
			
			boolean check=connect.idExist(idd);
			if(check==false) {
				responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Id is not present").asRuntimeException());
				return;
			}
			
			String scheduleBookingStatus=request.getBoookingStatus();


			bookingMessage.Builder response=bookingMessage.newBuilder();
			try {
				ResultSet rs=connect.updateInterviewStatus(idd, scheduleBookingStatus);

				List<booking> slotDetails = new ArrayList<booking>();

				while(rs.next())
				{
					slotDetails.add(new booking(rs.getInt("Id"),rs.getString("interviewerEmailId"),rs.getString("intervieweeEmailId"),rs.getString("tagTeamEmailId"),rs.getDate("interviewDate"),rs.getString("bookingStatus"),
							rs.getTime("startTime"),rs.getTime("endTime"),rs.getString("techStack"),rs.getString("interviewDescription")));
				}

				booking a=slotDetails.get(slotDetails.size()-1);

				int id=a.getId();
				String interviewerEmailId=a.getInterviewerEmailId();
				String intervieweeEmailId=a.getIntervieweeEmailId();
				String tagTeamEmailId=a.getTagTeamEmailId();
				Date scdDate=a.getDate();
				String boookingStatus=a.getBoookingStatus();
				Time startTime=a.getStartTime();
				Time endTime=a.getEndTime();
				String techStack=a.getTechStack();
				String description=a.getDescription();


				String date = new SimpleDateFormat("dd/MM/yyyy").format(scdDate);
				String start= new SimpleDateFormat("hh:mm a").format(startTime);
				String end= new SimpleDateFormat("hh:mm a").format(endTime);

				response.setId(id).setInterviewerEmailId(interviewerEmailId).setIntervieweeEmailId(intervieweeEmailId).setTagTeamEmailId(tagTeamEmailId)
						.setDate(date).setBoookingStatus(boookingStatus).setStartTime(start).setEndTime(end)
						.setTechStack(techStack).setDescription(description);

			}catch(Exception e) {


				e.printStackTrace();
			}

			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}

	
	
		@Override
		public void getScheduledInterviewByTagTeamEmailId(tagTeamId request, StreamObserver<bookingMessageResponse> responseObserver) {

			String emailId=request.getEmailId();
	    
	    	
	    	if(validators.validateEmail(emailId)!=true) {
				
				responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Tag Team's emailId is not valid").asRuntimeException());
				return;
			}
	    
	    	
	    	ResultSet rs=((dbConnection) connect).fetchDetailTagEmailId(emailId);
	    	
	    	List<List<String>> Users = new ArrayList<>();

	    	try {
				while(rs.next()) {
					List<String> User = new ArrayList<>();
					
  
					
					User.add(rs.getString(2));
					User.add(rs.getString(3));
					User.add(rs.getString(4));
					
					
					String date = new SimpleDateFormat("yyyy-MM-dd").format(rs.getDate(5));
					User.add(date);
					
					User.add(rs.getString(6));
					
					String start= new SimpleDateFormat("hh:mm a").format(rs.getTime(7));
					User.add(start);
					
					String end= new SimpleDateFormat("hh:mm a").format(rs.getTime(8));
					User.add(end);
					
					User.add(rs.getString(9));
					User.add(rs.getString(10));
					
					Users.add(User);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	

	    	bookingMessageResponse.Builder usersRes = bookingMessageResponse.newBuilder();
	    	
			List<bookingDetail> l = new ArrayList<bookingDetail>();
			if(!Users.isEmpty()) {
			
				for(List<String> user : Users) {
					
					bookingDetail.Builder userP = bookingDetail.newBuilder();
				
					userP.setInterviewerEmailId(user.get(0)).setIntervieweeEmailId(user.get(1)).setTagTeamEmailId(user.get(2))
				.setDate(user.get(3)).setBoookingStatus(user.get(4)).setStartTime(user.get(5)).setEndTime(user.get(6))
				.setTechStack(user.get(7)).setDescription(user.get(8));
					
					l.add(userP.build());
				
				}
			
				usersRes.addAllBookingDetailArray(l);
			}else {
					usersRes.build();
					responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("User with " + emailId +" not present.").asRuntimeException());
			return;	
			}
				responseObserver.onNext(usersRes.build());
		        responseObserver.onCompleted();
	 

		}
		
	
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		public void getSlotIdForReschedule(slotIdDetails request, StreamObserver<slotIdResponse> responseObserver) {
		      
			String emailId=request.getEmailId();
			
			if(validators.validateEmail(emailId)!=true) {
				
				responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Interviewer's emailId is not valid").asRuntimeException());
				return;
			}
			
			String dat=request.getDate();
			
			if(validators.validateDate(dat)!=true) {
				
				responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Date is not valid..date format should be yyyy-mm-dd").asRuntimeException());
				return;
			}
			
			
			String sTime=request.getStartTime();
			
			if(validators.validateTime(sTime)!=true) {
				
				responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Start time is not valid..time format should be hh:mm am/pm").asRuntimeException());
				return;
			}
			
			
			String eTime=request.getEndTime();
			
			if(validators.validateTime(eTime)!=true) {
				
				responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("End time is not valid..time format should be hh:mm am/pm").asRuntimeException());
				return;
			}
			
			try {
				boolean timeValidating= validators.validateStartAndEndTime(sTime,eTime);
				if(timeValidating!=true) {
					responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("Start time should be smaller than end time").asRuntimeException());
					return;
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			Date schDate = null;
			Time strtTime=null;
			Time edTime=null;
			try {
			
				
				java.util.Date utilDate1=new SimpleDateFormat("yyyy-MM-dd").parse(dat);
				schDate=new Date(utilDate1.getTime());
				
				java.util.Date utilDate2=new SimpleDateFormat("hh:mm a").parse(sTime);
				strtTime=new Time(utilDate2.getTime());
				
				
				java.util.Date utilDate3=new SimpleDateFormat("hh:mm a").parse(eTime);
				edTime=new Time(utilDate3.getTime());
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			Date scheduleDate=schDate;
			Time scheduleStartTime=strtTime;
			Time scheduleEndTime=edTime;

			slotIdResponse.Builder response = slotIdResponse.newBuilder();
			
			int rs=connect.getSlotId(emailId,scheduleDate, scheduleStartTime,scheduleEndTime);
			
			
			if(rs>0) {
				
				response.setSlotId(rs);
				
			}else {
				responseObserver.onError(io.grpc.Status.NOT_FOUND.withDescription("User is not present").asRuntimeException());
				return;
			}
			
			responseObserver.onNext(response.build());
	        responseObserver.onCompleted();
			
	}
	
	
	
}
