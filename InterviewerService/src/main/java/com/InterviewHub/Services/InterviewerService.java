package com.InterviewHub.Services;

import com.GLProduct.interviewer.*;
import com.InterviewHub.Interviewer.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class InterviewerService extends InterviewerServiceGrpc.InterviewerServiceImplBase {
    @Override
    public void newInterviewSlot(InterviewerSlot request, StreamObserver<APIRESPONSE> responseObserver) {

    APIRESPONSE.Builder api_response=APIRESPONSE.newBuilder();
    String name=request.getInterviewerName();
    String email=request.getInterviewerEmailId();
    //String Date=request.getDate();
        try {
            Validation.validateEmail(email);
        } catch (InvalidEmailException e) {
            e.printStackTrace();
            Status status=Status.INVALID_ARGUMENT.withDescription("Invalid email ID");
            responseObserver.onError(status.asRuntimeException());
            responseObserver.onCompleted();
        }

        List<Slot> slots=request.getSlotList();
        api_response.setBookingMsg("your data has been saved in database");
        api_response.setInterviewEmailId(email).setInterviewerName(name);


        int last_slot_id;
        int i=0;
        try {
               last_slot_id= InterviewerToDb.insertInterviewerSlot(request.getInterviewerName(), request.getInterviewerEmailId(), slots);

                 for(Slot s:slots)
                 {
                  api_response.addResponseSlot(ResponseSlot.newBuilder().setSlotId(last_slot_id+1).setSlotStatus(slots.get(i).getSlotStatus()).setSlotDate(slots.get(i).getDate()).setStartTime(slots.get(i).getStartTime()).setEndTime(slots.get(i).getEndTime()));
                i++;
                last_slot_id++;
                 }
            responseObserver.onNext(api_response.build());

                responseObserver.onCompleted();
            }


         catch (ParseException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InvalidTimeFormatException e) {
            Status status=Status.INVALID_ARGUMENT.withDescription("Invalid Time format or Time Slots are not valid");
            responseObserver.onError(status.asRuntimeException());
            responseObserver.onCompleted();
            e.printStackTrace();

        }
        catch(InvalidDateFormatException e)
        {
            Status status=Status.INVALID_ARGUMENT.withDescription("Invalid date format, it should be in yy-mm-dd format only");
            responseObserver.onError(status.asRuntimeException());
            responseObserver.onCompleted();
            e.printStackTrace();

        }

    }

    @Override
    public void getAllSlotsByEmailId(GetSlotById request, StreamObserver<ResponseSlot> responseObserver) {
        List<ResponseSlot> allSlots=new ArrayList<ResponseSlot>();

        try {
            Validation.validateEmail(request.getInterviewerEmailId());
            allSlots=InterviewerToDb.getSlotsById(request.getInterviewerEmailId());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InvalidEmailException e) {
            Status status=Status.INVALID_ARGUMENT.withDescription("Invalid email ID");
            responseObserver.onError(status.asRuntimeException());
            responseObserver.onCompleted();

            e.printStackTrace();
        } catch (NoDataFoundException e) {
            Status status=Status.NOT_FOUND.withDescription("NO DATA FOUND!!!");
            responseObserver.onError(status.asRuntimeException());
            responseObserver.onCompleted();
            e.printStackTrace();
        }
        for(ResponseSlot R:allSlots)
        {
            responseObserver.onNext(R);
        }
       responseObserver.onCompleted();
    }

    @Override
    public void getAllSlotsByDate(slotsByDate request, StreamObserver<ResponseSlot> responseObserver) {
        String slot_date=request.getSlotDate();String email_id= request.getInterviewerEmailId();
        List<ResponseSlot> responseSlots=new ArrayList<ResponseSlot>();
        try {
           if( Validation.validateDate(request.getSlotDate())) {
               Validation.validateEmail(request.getInterviewerEmailId());
               responseSlots = InterviewerToDb.getSlotsByDate(slot_date, email_id);
           }
           else throw new InvalidDateFormatException("Invalid date format, date should be in yy/mm/dd format");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoDataFoundException e) {
            e.printStackTrace();
            Status status=Status.NOT_FOUND.withDescription("No Data Found!!!");
            responseObserver.onError(status.asRuntimeException());
            responseObserver.onCompleted();
        } catch (InvalidEmailException e) {
            Status status=Status.INVALID_ARGUMENT.withDescription("Invalid email ID");
            responseObserver.onError(status.asRuntimeException());
            responseObserver.onCompleted();


            throw new RuntimeException(e);
        } catch (InvalidDateFormatException e) {
            Status status=Status.INVALID_ARGUMENT.withDescription("Invalid date format, date format should be in yy/mm/dd format");
            responseObserver.onError(status.asRuntimeException());
            responseObserver.onCompleted();

            throw new RuntimeException(e);
        }
        for(ResponseSlot R:responseSlots)
        {
            responseObserver.onNext(R);
        }
        responseObserver.onCompleted();    }

    @Override
    public void deleteSlot(slotDeletion request, StreamObserver<slotUpdationResponse> responseObserver) {
        int slot_id=request.getSlotId();
        slotUpdationResponse.Builder deleted_slot=slotUpdationResponse.newBuilder();
        try {
            deleted_slot=InterviewerToDb.deleteSlot(slot_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch (InvalidSlotIdException e)
        {
            Status status=Status.INVALID_ARGUMENT.withDescription("slot ID is not valid");
            responseObserver.onError(status.asRuntimeException());
            responseObserver.onCompleted();

            throw new RuntimeException(e);
        }
        responseObserver.onNext(deleted_slot.build());
        responseObserver.onCompleted();

    }

    @Override
    public void updateSlotStatus(SlotUpdation request, StreamObserver<slotUpdationResponse> responseObserver) {
        String updated_slot_status= request.getUpdatedSlotStatus();
       int slot_id= request.getSlotId();
        slotUpdationResponse.Builder updated_response_slot=slotUpdationResponse.newBuilder();
        try {
            updated_response_slot=InterviewerToDb.updateSLotStatus(updated_slot_status,slot_id);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoDataFoundException e) {
            e.printStackTrace();
            Status status=Status.NOT_FOUND.withDescription("no data found with this slot Id");
        }
        responseObserver.onNext(updated_response_slot.build());
        responseObserver.onCompleted();

    }

    @Override
    public void updateSlotRequest(updateSlot request, StreamObserver<slotUpdationResponse> responseObserver) {
       slotUpdationResponse.Builder updated_response_Slot=slotUpdationResponse.newBuilder();
        int slot_id=request.getSlotId();
        String start_time= request.getSlotStartTime();;
        String end_time= request.getSlotEndTime();;
        String date= request.getSlotDate();
        String status= request.getStatus();
        try {
            updated_response_Slot= InterviewerToDb.updateSlot(slot_id,date,start_time,end_time,status);
        } catch (SQLException e) {
            e.printStackTrace();
        }  responseObserver.onNext(updated_response_Slot.build());
        responseObserver.onCompleted();


    }
}

