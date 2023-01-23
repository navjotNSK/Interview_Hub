package dbConnector;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import bookingServices.booking;

public class dbConnection {
	
	public Connection databaseConnection(){
		Connection cons = null;
		
		try {
			
			cons = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/InterviewHub","root","Root@123");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cons;
	}
	
	public ResultSet addInterview(booking book) {
		
		String sql="INSERT INTO bookingDetailsTest(interviewerEmailId, intervieweeEmailId, tagTeamEmailId, interviewDate, bookingStatus, startTime, endTime, techStack, interviewDescription) values (?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cons=databaseConnection();
			System.out.println("Inside addInterview");
			ps=cons.prepareStatement(sql);
			ps.setString(1, book.getInterviewerEmailId());
			ps.setString(2, book.getIntervieweeEmailId());
			ps.setString(3, book.getTagTeamEmailId());
			
			ps.setDate(4, (book.getDate()));
			ps.setString(5, book.getBoookingStatus());
			ps.setTime(6, (book.getStartTime()));
			ps.setTime(7,(book.getEndTime()));
			ps.setString(8, book.getTechStack());
			ps.setString(9, book.getDescription());
			ps.executeUpdate();
			
			rs = cons.createStatement().executeQuery("SELECT * from bookingDetailsTest ");
			return rs;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

	public void reSchedule(int id, Date scheduleDate, Time scheduleStartTime, Time scheduleEndTime) {
		// TODO Auto-generated method stub
		
		String sql="UPDATE bookingDetailsTest SET interviewDate= ?, startTime= ?, endTime= ? WHERE id= ?";
		PreparedStatement ps=null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cons=databaseConnection();
			System.out.println("Inside reschdule");
			ps=cons.prepareStatement(sql);
			
			ps.setDate(1, scheduleDate);
			ps.setTime(2, scheduleStartTime);
			ps.setTime(3, scheduleEndTime);
			ps.setInt(4, id);
			ps.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public ResultSet fetchDetail(String emailId) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM bookingDetailsTest WHERE interviewerEmailId = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cons=databaseConnection();
			System.out.println("Inside fetchDetails");
			
			ps=cons.prepareStatement(sql);
			
			ps.setString(1, emailId);
			rs=ps.executeQuery();
			return rs;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	public boolean idExist(int id) {
	
		String sql = "SELECT * FROM bookingDetailsTest WHERE id = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Integer> User = new ArrayList<>();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cons=databaseConnection();
			System.out.println("Inside idExist");
			ps=cons.prepareStatement(sql);
			
			ps.setInt(1, id);
			rs=ps.executeQuery();
			
			if(rs.next()) {
    			User.add(rs.getInt(1));
    		}
			if(User.size()>0)
				return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	



	public boolean duplicate(booking book) {
		// TODO Auto-generated method stub
		
		String sql="SELECT * from bookingDetailsTest WHERE interviewerEmailId=? AND intervieweeEmailId=? AND tagTeamEmailId=? AND interviewDate=? AND bookingStatus=? AND startTime=? AND endTime=? AND techStack=? AND interviewDescription=?";
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<String> list=new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cons=databaseConnection();
			System.out.println("Inside Duplicate");
			ps=cons.prepareStatement(sql);
			ps.setString(1, book.getInterviewerEmailId());
			ps.setString(2, book.getIntervieweeEmailId());
			ps.setString(3, book.getTagTeamEmailId());
			
			ps.setDate(4, (book.getDate()));
			ps.setString(5, book.getBoookingStatus());
			ps.setTime(6, (book.getStartTime()));
			ps.setTime(7,(book.getEndTime()));
			ps.setString(8, book.getTechStack());
			ps.setString(9, book.getDescription());
			rs=ps.executeQuery();
			
			while(rs.next()) {
			
				list.add(rs.getString("interviewerEmailId"));
			}
			
			if(list.size()>0)
				return true;

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public ResultSet updateInterviewStatus(int id1,String scheduleBookingStatus) {

		String sql="Update bookingDetailsTest set bookingStatus=? where id=?";
		String sql1="SELECT * from bookingDetailsTest where id=?";
		PreparedStatement ps=null;
		PreparedStatement ps1=null;
		ResultSet rs=null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cons=databaseConnection();
			System.out.println("Inside updateInterviewStatus");
			System.out.println(id1);
			System.out.println(scheduleBookingStatus);
			ps=cons.prepareStatement(sql);
			ps.setString(1,scheduleBookingStatus);
			ps.setInt(2,id1);
			ps.executeUpdate();


			ps1=cons.prepareStatement(sql1);
			ps1.setInt(1,id1);
			rs=ps1.executeQuery();


			return rs;

		}catch(Exception e) {
			e.printStackTrace();
		}
	 return null;
	}
	
	
	public ResultSet fetchDetailTagEmailId(String emailId) {
		// TODO Auto-generated method stub

		String sql = "SELECT * FROM bookingDetailsTest WHERE tagTeamEmailId = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cons=databaseConnection();
			System.out.println("Inside fetchDetailTagEmailId");
			ps=cons.prepareStatement(sql);

			ps.setString(1, emailId);
			rs=ps.executeQuery();
		
			return rs;

		}catch(Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	
	
	
	public boolean overlappingBooking(String emailId,Date date,Time startT,Time endT) {
		
		String sql = "SELECT startTime,endTime FROM bookingDetailsTest WHERE interviewerEmailId = ? AND interviewDate=?";
		PreparedStatement ps = null;
		ResultSet rs = null;

		List<String> list1=new ArrayList<>();
		List<String> list2=new ArrayList<>();
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cons=databaseConnection();
			System.out.println("Inside overlapping Condition");
			ps=cons.prepareStatement(sql);

			ps.setString(1, emailId);
			ps.setDate(2,date);
			
			rs=ps.executeQuery();
			
			while(rs.next()) {
				
				String start= new SimpleDateFormat("HH:mm").format(rs.getTime("startTime"));
				String end= new SimpleDateFormat("HH:mm").format(rs.getTime("endTime"));
				list1.add(start);
				list2.add(end);
			}
			
			if(list1.size()==0) {
				
				return false;
				
			}else {
				

				String start= new SimpleDateFormat("HH:MM").format(startT);
				String end= new SimpleDateFormat("HH:MM").format(endT);
				
				for(int i=0;i<list1.size();i++) {
						
					 	int event1StartTime = convertTimeToInteger(start);
				        int event1EndTime = convertTimeToInteger(end);
				        int event2StartTime = convertTimeToInteger(list1.get(i));
				        int event2EndTime = convertTimeToInteger(list2.get(i));
				        if (event1StartTime > event2StartTime && event1StartTime < event2EndTime) {
				            return true;
				        } else if (event1EndTime > event2StartTime && event1EndTime < event2EndTime) {
				            return true;
				        } else if (event2StartTime > event1StartTime && event2StartTime < event1EndTime) {
				            return true;
				        } else if (event2EndTime > event1StartTime && event2EndTime < event1EndTime) {
				            return true;
				        }
					
				}
			}
			

		}catch(Exception e) {
			e.printStackTrace();
		}

		
		return false;
		
	}


	public int convertTimeToInteger(String time) {
        String hours = time.substring(0, 2);
        String minutes = time.substring(3, 5);
        return Integer.parseInt(hours) * 60 + Integer.parseInt(minutes);
    }

	
	public void reschedule(int id, Date scheduleDate, Time scheduleStartTime, Time scheduleEndTime) {
		// TODO Auto-generated method stub
		
		String sql="UPDATE bookingDetailsTest SET interviewDate= ?, startTime= ?, endTime= ? WHERE id=?";
		PreparedStatement ps=null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cons=databaseConnection();
			System.out.println("Inside reschedule");
			ps=cons.prepareStatement(sql);
			
			ps.setDate(1, scheduleDate);
			ps.setTime(2, scheduleStartTime);
			ps.setTime(3, scheduleEndTime);
			ps.setInt(4, id);
			ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	public boolean interviewerPresent(String emailId) {
		String sql = "SELECT * FROM bookingDetailsTest WHERE interviewerEmailId = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<String> User = new ArrayList<>();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cons=databaseConnection();
			System.out.println("interviewerPresent");
			ps=cons.prepareStatement(sql);
			
			ps.setString(1, emailId);
			rs=ps.executeQuery();
			
			if(rs.next()) {
    			User.add(rs.getString("interviewerEmailId"));
    		}
			System.out.println(User.size());
			if(User.size()>0)
				return true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	

	public ResultSet fetchInterviewEmailId(int id) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT * FROM bookingDetailsTest WHERE id = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cons=databaseConnection();
			System.out.println("fetchInterviewEmailId");
			ps=cons.prepareStatement(sql);
			
			ps.setInt(1, id);
			rs=ps.executeQuery();
			return rs;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rs;
		
		
	}

	public int getSlotId(String emailId, Date scheduleDate, Time scheduleStartTime, Time scheduleEndTime) {
		// TODO Auto-generated method stub
		String sql = "SELECT id FROM bookingDetailsTest WHERE interviewerEmailId = ? AND interviewDate=? AND startTime=? AND endTime=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cons=databaseConnection();
			System.out.println("Inside getSlot");
			ps=cons.prepareStatement(sql);
			
			ps.setString(1, emailId);
			ps.setDate(2, scheduleDate);
			ps.setTime(3, scheduleStartTime);
			ps.setTime(4, scheduleEndTime);
			
			rs=ps.executeQuery();
			
			int result=0;
			if(rs.next()) {
    			result=rs.getInt("id");
    		}
			
			if(result>0)
				return result;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return -1;
	}
	public  String isSlotAvailable(String interviewerEmailId,String interviewDate,String start_time,String end_time) {
//		interviewerStatus = 'AVAILABLE' OR 'CANCELLED'

		String query = "SELECT * FROM InterviewerSlots WHERE interviewerEmailId =? AND slotDate =?";

		PreparedStatement ps;
		try {
			Connection cons=databaseConnection();

			ps = cons.prepareStatement(query);

			ps.setString(1, interviewerEmailId);
			ps.setString(2, interviewDate);
			ResultSet slotQueryResult = ps.executeQuery();



			if(!slotQueryResult.next())
				return "Interviewer emailid is not present";
			java.util.Date availableStartTime, availableEndTime , requestedStartTime,requestedEndTime;

			do
			{

//				if(!slotQueryResult.getString("interviewerStatus").equals("AVAILABLE")) {
//					continue;
//				}
				if(!slotQueryResult.getString("slotStatus").equals("available")) {
					continue;
				}

				availableStartTime=convertStringToTime(slotQueryResult.getString("startTime"));
				availableEndTime = convertStringToTime(slotQueryResult.getString("endTime"));
				requestedStartTime = convertStringToTime(start_time);
				requestedEndTime = convertStringToTime(end_time);
				System.out.println("INSIDE");

				if( (requestedStartTime.after(availableStartTime) || requestedStartTime.equals(availableStartTime))
						&& (requestedEndTime.before(availableEndTime) || requestedEndTime.equals(availableEndTime)))
				{
					//SLOT FOUNd
					System.out.println("INSIDE");
					System.out.println("SLOT AVAILABLEE " + slotQueryResult.getString("startTime") + " "+ slotQueryResult.getString("endTime") );
					return "Slot is available";

				}


			}while((slotQueryResult.next()));


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Slot is not available on given date and time";
	}

	//recieve time in hh:mm a return Date object
	public static java.util.Date convertStringToTime(String time) 
	{
		SimpleDateFormat sdf= new SimpleDateFormat("hh:mm a");		
		try {
			return sdf.parse(time);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}
	
	
}
