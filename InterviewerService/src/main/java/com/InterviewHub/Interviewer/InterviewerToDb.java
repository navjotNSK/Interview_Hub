package com.InterviewHub.Interviewer;

import com.GLProduct.interviewer.ResponseSlot;
import com.GLProduct.interviewer.Slot;
import com.GLProduct.interviewer.slotUpdationResponse;
import com.InterviewHub.DbConnection.DataBaseConnection;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewerToDb {
    public static int insertInterviewerSlot(String name, String email, List<Slot> slots) throws ParseException, SQLException, InvalidTimeFormatException, InvalidDateFormatException {
        // Date date1=new SimpleDateFormat("yyyy/mm/dd").parse(date);
        // LocalDate  ld= LocalDate.parse(slots.get(0).getDate());

        String start_time;
        String end_time;
        Connection con = DataBaseConnection.connectToDb();
        PreparedStatement ps = null;
        Statement ps1 = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        PreparedStatement update_preparestmt = null;
        //    con.setAutoCommit(false);
        ResultSet rs = null;
        int j = 0;
        boolean flag = true;
        String query1 = "insert into InterviewerSlots(interviewerName,interviewerEmailId,slotDate,slotStatus,startTime,endTime) values(?,?,?,?,?,?)";

        String slot_validation_query = "select startTime,endTime, slotStatus,slotId from InterviewerSlots where interviewerEmailId='" + email + "'" + " and " + "slotDate='" + slots.get(j).getDate() + "'";
        //  ps1=con.prepareStatement(slot_validation_query);
        //     rs=ps1.executeQuery(slot_validation_query);
        SimpleDateFormat format = new SimpleDateFormat("hh:mm a");
        // Validation.slotsValidation(slots);

     /*   if(rs.isBeforeFirst())
        {
            while( j<slots.size() && flag==true)
            {
                while(rs.next())
               {
               String time=rs.getString("startTime");
             //  Date date= (Date)format.parse(time);
          //     int s= (((Date)format.parse(slots.get(j).getStartTime())).compareTo(date));
                java.util.Date utilDate1=new SimpleDateFormat("hh:mm a").parse(rs.getString("startTime"));
                Time strtTime_db=new Time(utilDate1.getTime());
                java.util.Date utilDate2=new SimpleDateFormat("hh:mm a").parse(slots.get(j).getStartTime());
                Time strtTime_slot=new Time(utilDate2.getTime());
                java.util.Date utilDate_endtime_db=new SimpleDateFormat("hh:mm a").parse(rs.getString("endTime"));
                Time endTime_db=new Time(utilDate_endtime_db.getTime());
                java.util.Date utilDate_endtime_slot=new SimpleDateFormat("hh:mm a").parse(slots.get(j).getEndTime());
                Time endTime_slot=new Time(utilDate_endtime_slot.getTime());

                   if(strtTime_db.before(strtTime_slot) && endTime_db.after(endTime_slot) && slots.get(j).getSlotStatus().equalsIgnoreCase(rs.getString("slotStatus")))
                    {
                        System.out.println("already having a slot at that time");
                    }
                   else if(strtTime_db.after(strtTime_slot) && endTime_db.before(endTime_slot))
                   {
                       query1="update InterviewerSlots set startTime='"+slots.get(j).getStartTime()+"', endTime='"+slots.get(j).getEndTime()+"', where slotId="+rs.getInt("slotId");
                       flag=false;
                       break;

                   }
            } rs.beforeFirst();
                j++;
            }

        } */
        //   String query1="insert into InterviewerSlots(interviewerName,interviewerEmailId,slotDate,slotStatus,startTime,endTime) values(?,?,?,?,?,?)";
        String query2 = "select slotId from InterviewerSlots order by slotId desc limit 1";
        int lastslot_id = 0;
        ps = con.prepareStatement(query1);

        for (int i = 0; i < slots.size(); i++) {

            start_time = slots.get(i).getStartTime();
            end_time = slots.get(i).getEndTime();
            if (Validation.validateSlotTimes(start_time, end_time)) {
                if (Validation.validateDate(slots.get(i).getDate())) {
                    ps.setString(1, name);
                    ps.setString(2, email);
                    ps.setString(3, slots.get(i).getDate());
                    ps.setString(4, slots.get(i).getSlotStatus());
                    ps.setString(5, slots.get(i).getStartTime());
                    ps.setString(6, slots.get(i).getEndTime());
                    try {
                        ps.executeUpdate();

                    } catch (SQLException e) {
                        throw new SQLException();
                    }
                    ps = con.prepareStatement(query2);
                    try {
                        rs = ps.executeQuery();
                        rs.next();
                        lastslot_id = rs.getInt("slotId");
                        // ps=con.prepareStatement(query1);
                    } catch (SQLException e) {
                        throw new SQLException();
                    }

                    //        con.commit();
                }else { throw new InvalidDateFormatException("Date format should be in yy-mm-dd");}
            }
        else{
            throw new InvalidTimeFormatException("time format is not valid or slots time is not valid");}


}
        return lastslot_id;
    }


    public static List<ResponseSlot> getSlotsById(String interviewerEmailId) throws SQLException, NoDataFoundException {
        List<ResponseSlot>responseslots=new ArrayList<ResponseSlot>();

        Connection con= DataBaseConnection.connectToDb();
        PreparedStatement ps=null;
        con.setAutoCommit(false);
        ResultSet rs=null;
        ps = con.prepareStatement("select slotId,slotdate,slotStatus,startTime,endTime from InterviewerSlots where interviewerEmailId like '"+interviewerEmailId+"'");
        rs= ps.executeQuery();
        if(!rs.isBeforeFirst())
        {
            throw new NoDataFoundException("no such data found");
        }
        while(rs.next())
        {
         responseslots.add(ResponseSlot.newBuilder().setSlotId(rs.getInt("slotId")).setSlotDate(rs.getString("slotdate")).setStartTime(rs.getString("startTime")).setEndTime(rs.getString("endTime")).setSlotStatus(rs.getString("slotStatus")).build());
        }
      return responseslots;
    }

    public static List<ResponseSlot> getSlotsByDate(String slot_date,String email_id) throws SQLException, NoDataFoundException {
        List<ResponseSlot>responseslots=new ArrayList<ResponseSlot>();
        Connection con= DataBaseConnection.connectToDb();
        PreparedStatement ps=null;
       // con.setAutoCommit(false);
        ResultSet rs=null;
        ps = con.prepareStatement("select slotId,slotdate,slotStatus,startTime,endTime from InterviewerSlots where interviewerEmailId like '"+email_id+"'"+" and slotdate like '"+slot_date+"'");
        rs= ps.executeQuery();
        if(!rs.isBeforeFirst())
        {
            throw new NoDataFoundException("NO data found with date:"+slot_date);
        }
        while(rs.next())
        {
            responseslots.add(ResponseSlot.newBuilder().setSlotId(rs.getInt("slotId")).setSlotDate(rs.getString("slotdate")).setStartTime(rs.getString("startTime")).setEndTime(rs.getString("endTime")).setSlotStatus(rs.getString("slotStatus")).build());
        }
        return responseslots;
    }

    public static slotUpdationResponse.Builder deleteSlot(int slot_id) throws SQLException, InvalidSlotIdException {
        slotUpdationResponse.Builder deleted_slot=slotUpdationResponse.newBuilder();

        Connection con= DataBaseConnection.connectToDb();
        PreparedStatement ps=null;
        ResultSet rs=null;
        String query1="select * from InterviewerSlots where slotId="+slot_id;
        String query2="delete from InterviewerSlots where slotId="+slot_id;
        ps= con.prepareStatement(query1);
        rs=ps.executeQuery();
        if(!rs.isBeforeFirst())
        {
            throw new InvalidSlotIdException("Slot id doesn't exist");
        }
        rs.next();
        deleted_slot.setInterviewerName(rs.getString(2)).setInterviewerEmailId(rs.getString(3)).setMessage("given slot has been deleted successfully").setResponseSlot(ResponseSlot.newBuilder().setSlotId(rs.getInt(1)).setSlotDate(rs.getString(4)).setStartTime(rs.getString(5)).setEndTime(rs.getString(6)).setSlotStatus(rs.getString(7)).build());//addResponseSlot(ResponseSlot.newBuilder().setSlotId(rs.getInt(1)).setSlotDate(rs.getString(4)).setSlotStatus(rs.getString(5)).setStartTime(rs.getString(6)).setEndTime(rs.getString(7)).build());
        ps= con.prepareStatement(query2);
        ps.executeUpdate();
        return deleted_slot;



    }

    public static slotUpdationResponse.Builder updateSLotStatus(String updated_slot_status,int slot_id) throws SQLException, NoDataFoundException {
        slotUpdationResponse.Builder updated_response_slot=slotUpdationResponse.newBuilder();

        Connection con= DataBaseConnection.connectToDb();
        PreparedStatement ps=null;
        ResultSet rs=null;
        String query= "update InterviewerSlots set slotStatus='"+updated_slot_status+"' where slotId="+slot_id;
        ps=con.prepareStatement(query);
        ps.executeUpdate();
        ps=con.prepareStatement("select * from InterviewerSlots where slotId="+slot_id);
        rs=ps.executeQuery();
        if(!rs.isBeforeFirst())
        {
            throw new NoDataFoundException("No data found with slotid:"+slot_id);
        }
        rs.next();
        updated_response_slot.setInterviewerEmailId(rs.getString("interviewerEmailId")).setInterviewerName(rs.getString("interviewerName")).setMessage("your interview slot has been updated,here is the updated slot valus");
        updated_response_slot.setResponseSlot(ResponseSlot.newBuilder().setSlotId(rs.getInt("slotId")).setSlotStatus(rs.getString("slotStatus")).setStartTime(rs.getString("startTime")).setEndTime(rs.getString("endTime")).build());
       return updated_response_slot;
    }

    public static slotUpdationResponse.Builder updateSlot(int slot_id, String date, String start_time, String end_time, String status) throws SQLException {
        Map<Object,Object> updated_slot_values=new HashMap<>();
        String [] keyset=new String[5];
        boolean flag=false;
        slotUpdationResponse.Builder updated_response_slot=slotUpdationResponse.newBuilder();
        if(slot_id!=0)
        {
            updated_slot_values.put("slotID",slot_id);
        }
        else{
            System.out.println("slot value can not be null");
        }
        if(date!=null)
        {
            updated_slot_values.put("date",date);
        }
        if(start_time!=null)
        {
            updated_slot_values.put("start_time",start_time);

        }
        if(end_time!=null)
        {
            updated_slot_values.put("end_time",end_time);
        }
        if(status!=null)
        {
            updated_slot_values.put("status",status);
        }
        Connection con=DataBaseConnection.connectToDb();
        PreparedStatement ps=null;
        ResultSet rs=null;
        String query="update InterviewerSlots set ";

        if(updated_slot_values.containsKey("date"))
        { if(flag)
        {
            query=query+",";
        }
            query=query+"slotDate='"+updated_slot_values.get("date")+"'";
            flag=true;
        }
        if(updated_slot_values.containsKey("start_time"))
        {
            if(flag)
            {
                query=query+",";
            }
            query=query+"startTime='"+updated_slot_values.get("start_time")+"'";
            flag=true;
        }
        if(updated_slot_values.containsKey("end_time"))
        {
            if(flag)
            {
                query=query+",";
            }
            query=query+"endTime='"+updated_slot_values.get("end_time")+"'";
        }
        if(updated_slot_values.containsKey("status"))
        {
            if(flag)
            {
                query=query+",";
            }
            query=query+"slotStatus='"+updated_slot_values.get("status")+"'";
        }
        query=query+" where slotId="+updated_slot_values.get("slotID");
        ps=con.prepareStatement(query);
        ps.executeUpdate();
        ps= con.prepareStatement("select * from InterviewerSlots where slotId="+updated_slot_values.get("slotID"));
        rs=ps.executeQuery();
        rs.next();

        updated_response_slot.setInterviewerEmailId(rs.getString("interviewerEmailId")).setInterviewerName(rs.getString("interviewerName")).setMessage("your interview slot has been updated,here is the updated slot values");
        updated_response_slot.setResponseSlot(ResponseSlot.newBuilder().setSlotId(rs.getInt("slotId")).setSlotDate(rs.getString("slotdate")).setSlotStatus(rs.getString("slotStatus")).setStartTime(rs.getString("startTime")).setEndTime(rs.getString("endTime")).build());
        return updated_response_slot;

    }
}
