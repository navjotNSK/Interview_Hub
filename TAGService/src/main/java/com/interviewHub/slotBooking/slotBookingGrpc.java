package com.interviewHub.slotBooking;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: interviewSlot.proto")
public final class slotBookingGrpc {

  private slotBookingGrpc() {}

  public static final String SERVICE_NAME = "slotBooking";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.slotDetails,
      com.interviewHub.slotBooking.InterviewSlot.bookingMessage> getScheduleInterviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "scheduleInterview",
      requestType = com.interviewHub.slotBooking.InterviewSlot.slotDetails.class,
      responseType = com.interviewHub.slotBooking.InterviewSlot.bookingMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.slotDetails,
      com.interviewHub.slotBooking.InterviewSlot.bookingMessage> getScheduleInterviewMethod() {
    io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.slotDetails, com.interviewHub.slotBooking.InterviewSlot.bookingMessage> getScheduleInterviewMethod;
    if ((getScheduleInterviewMethod = slotBookingGrpc.getScheduleInterviewMethod) == null) {
      synchronized (slotBookingGrpc.class) {
        if ((getScheduleInterviewMethod = slotBookingGrpc.getScheduleInterviewMethod) == null) {
          slotBookingGrpc.getScheduleInterviewMethod = getScheduleInterviewMethod = 
              io.grpc.MethodDescriptor.<com.interviewHub.slotBooking.InterviewSlot.slotDetails, com.interviewHub.slotBooking.InterviewSlot.bookingMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "slotBooking", "scheduleInterview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.interviewHub.slotBooking.InterviewSlot.slotDetails.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.interviewHub.slotBooking.InterviewSlot.bookingMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new slotBookingMethodDescriptorSupplier("scheduleInterview"))
                  .build();
          }
        }
     }
     return getScheduleInterviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.rescheduleDetails,
      com.interviewHub.slotBooking.InterviewSlot.rescheduleMessage> getRescheduleInterviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rescheduleInterview",
      requestType = com.interviewHub.slotBooking.InterviewSlot.rescheduleDetails.class,
      responseType = com.interviewHub.slotBooking.InterviewSlot.rescheduleMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.rescheduleDetails,
      com.interviewHub.slotBooking.InterviewSlot.rescheduleMessage> getRescheduleInterviewMethod() {
    io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.rescheduleDetails, com.interviewHub.slotBooking.InterviewSlot.rescheduleMessage> getRescheduleInterviewMethod;
    if ((getRescheduleInterviewMethod = slotBookingGrpc.getRescheduleInterviewMethod) == null) {
      synchronized (slotBookingGrpc.class) {
        if ((getRescheduleInterviewMethod = slotBookingGrpc.getRescheduleInterviewMethod) == null) {
          slotBookingGrpc.getRescheduleInterviewMethod = getRescheduleInterviewMethod = 
              io.grpc.MethodDescriptor.<com.interviewHub.slotBooking.InterviewSlot.rescheduleDetails, com.interviewHub.slotBooking.InterviewSlot.rescheduleMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "slotBooking", "rescheduleInterview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.interviewHub.slotBooking.InterviewSlot.rescheduleDetails.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.interviewHub.slotBooking.InterviewSlot.rescheduleMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new slotBookingMethodDescriptorSupplier("rescheduleInterview"))
                  .build();
          }
        }
     }
     return getRescheduleInterviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.updateDetails,
      com.interviewHub.slotBooking.InterviewSlot.bookingMessage> getUpdateBookingStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateBookingStatus",
      requestType = com.interviewHub.slotBooking.InterviewSlot.updateDetails.class,
      responseType = com.interviewHub.slotBooking.InterviewSlot.bookingMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.updateDetails,
      com.interviewHub.slotBooking.InterviewSlot.bookingMessage> getUpdateBookingStatusMethod() {
    io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.updateDetails, com.interviewHub.slotBooking.InterviewSlot.bookingMessage> getUpdateBookingStatusMethod;
    if ((getUpdateBookingStatusMethod = slotBookingGrpc.getUpdateBookingStatusMethod) == null) {
      synchronized (slotBookingGrpc.class) {
        if ((getUpdateBookingStatusMethod = slotBookingGrpc.getUpdateBookingStatusMethod) == null) {
          slotBookingGrpc.getUpdateBookingStatusMethod = getUpdateBookingStatusMethod = 
              io.grpc.MethodDescriptor.<com.interviewHub.slotBooking.InterviewSlot.updateDetails, com.interviewHub.slotBooking.InterviewSlot.bookingMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "slotBooking", "updateBookingStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.interviewHub.slotBooking.InterviewSlot.updateDetails.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.interviewHub.slotBooking.InterviewSlot.bookingMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new slotBookingMethodDescriptorSupplier("updateBookingStatus"))
                  .build();
          }
        }
     }
     return getUpdateBookingStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.slotIdDetails,
      com.interviewHub.slotBooking.InterviewSlot.slotIdResponse> getGetSlotIdForRescheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSlotIdForReschedule",
      requestType = com.interviewHub.slotBooking.InterviewSlot.slotIdDetails.class,
      responseType = com.interviewHub.slotBooking.InterviewSlot.slotIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.slotIdDetails,
      com.interviewHub.slotBooking.InterviewSlot.slotIdResponse> getGetSlotIdForRescheduleMethod() {
    io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.slotIdDetails, com.interviewHub.slotBooking.InterviewSlot.slotIdResponse> getGetSlotIdForRescheduleMethod;
    if ((getGetSlotIdForRescheduleMethod = slotBookingGrpc.getGetSlotIdForRescheduleMethod) == null) {
      synchronized (slotBookingGrpc.class) {
        if ((getGetSlotIdForRescheduleMethod = slotBookingGrpc.getGetSlotIdForRescheduleMethod) == null) {
          slotBookingGrpc.getGetSlotIdForRescheduleMethod = getGetSlotIdForRescheduleMethod = 
              io.grpc.MethodDescriptor.<com.interviewHub.slotBooking.InterviewSlot.slotIdDetails, com.interviewHub.slotBooking.InterviewSlot.slotIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "slotBooking", "getSlotIdForReschedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.interviewHub.slotBooking.InterviewSlot.slotIdDetails.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.interviewHub.slotBooking.InterviewSlot.slotIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new slotBookingMethodDescriptorSupplier("getSlotIdForReschedule"))
                  .build();
          }
        }
     }
     return getGetSlotIdForRescheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.interviewerId,
      com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse> getGetScheduledInterviewByInterviewerEmailIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getScheduledInterviewByInterviewerEmailId",
      requestType = com.interviewHub.slotBooking.InterviewSlot.interviewerId.class,
      responseType = com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.interviewerId,
      com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse> getGetScheduledInterviewByInterviewerEmailIdMethod() {
    io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.interviewerId, com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse> getGetScheduledInterviewByInterviewerEmailIdMethod;
    if ((getGetScheduledInterviewByInterviewerEmailIdMethod = slotBookingGrpc.getGetScheduledInterviewByInterviewerEmailIdMethod) == null) {
      synchronized (slotBookingGrpc.class) {
        if ((getGetScheduledInterviewByInterviewerEmailIdMethod = slotBookingGrpc.getGetScheduledInterviewByInterviewerEmailIdMethod) == null) {
          slotBookingGrpc.getGetScheduledInterviewByInterviewerEmailIdMethod = getGetScheduledInterviewByInterviewerEmailIdMethod = 
              io.grpc.MethodDescriptor.<com.interviewHub.slotBooking.InterviewSlot.interviewerId, com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "slotBooking", "getScheduledInterviewByInterviewerEmailId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.interviewHub.slotBooking.InterviewSlot.interviewerId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new slotBookingMethodDescriptorSupplier("getScheduledInterviewByInterviewerEmailId"))
                  .build();
          }
        }
     }
     return getGetScheduledInterviewByInterviewerEmailIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.tagTeamId,
      com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse> getGetScheduledInterviewByTagTeamEmailIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getScheduledInterviewByTagTeamEmailId",
      requestType = com.interviewHub.slotBooking.InterviewSlot.tagTeamId.class,
      responseType = com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.tagTeamId,
      com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse> getGetScheduledInterviewByTagTeamEmailIdMethod() {
    io.grpc.MethodDescriptor<com.interviewHub.slotBooking.InterviewSlot.tagTeamId, com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse> getGetScheduledInterviewByTagTeamEmailIdMethod;
    if ((getGetScheduledInterviewByTagTeamEmailIdMethod = slotBookingGrpc.getGetScheduledInterviewByTagTeamEmailIdMethod) == null) {
      synchronized (slotBookingGrpc.class) {
        if ((getGetScheduledInterviewByTagTeamEmailIdMethod = slotBookingGrpc.getGetScheduledInterviewByTagTeamEmailIdMethod) == null) {
          slotBookingGrpc.getGetScheduledInterviewByTagTeamEmailIdMethod = getGetScheduledInterviewByTagTeamEmailIdMethod = 
              io.grpc.MethodDescriptor.<com.interviewHub.slotBooking.InterviewSlot.tagTeamId, com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "slotBooking", "getScheduledInterviewByTagTeamEmailId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.interviewHub.slotBooking.InterviewSlot.tagTeamId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new slotBookingMethodDescriptorSupplier("getScheduledInterviewByTagTeamEmailId"))
                  .build();
          }
        }
     }
     return getGetScheduledInterviewByTagTeamEmailIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static slotBookingStub newStub(io.grpc.Channel channel) {
    return new slotBookingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static slotBookingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new slotBookingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static slotBookingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new slotBookingFutureStub(channel);
  }

  /**
   */
  public static abstract class slotBookingImplBase implements io.grpc.BindableService {

    /**
     */
    public void scheduleInterview(com.interviewHub.slotBooking.InterviewSlot.slotDetails request,
        io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.bookingMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getScheduleInterviewMethod(), responseObserver);
    }

    /**
     */
    public void rescheduleInterview(com.interviewHub.slotBooking.InterviewSlot.rescheduleDetails request,
        io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.rescheduleMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getRescheduleInterviewMethod(), responseObserver);
    }

    /**
     */
    public void updateBookingStatus(com.interviewHub.slotBooking.InterviewSlot.updateDetails request,
        io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.bookingMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBookingStatusMethod(), responseObserver);
    }

    /**
     */
    public void getSlotIdForReschedule(com.interviewHub.slotBooking.InterviewSlot.slotIdDetails request,
        io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.slotIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSlotIdForRescheduleMethod(), responseObserver);
    }

    /**
     */
    public void getScheduledInterviewByInterviewerEmailId(com.interviewHub.slotBooking.InterviewSlot.interviewerId request,
        io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetScheduledInterviewByInterviewerEmailIdMethod(), responseObserver);
    }

    /**
     */
    public void getScheduledInterviewByTagTeamEmailId(com.interviewHub.slotBooking.InterviewSlot.tagTeamId request,
        io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetScheduledInterviewByTagTeamEmailIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getScheduleInterviewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.interviewHub.slotBooking.InterviewSlot.slotDetails,
                com.interviewHub.slotBooking.InterviewSlot.bookingMessage>(
                  this, METHODID_SCHEDULE_INTERVIEW)))
          .addMethod(
            getRescheduleInterviewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.interviewHub.slotBooking.InterviewSlot.rescheduleDetails,
                com.interviewHub.slotBooking.InterviewSlot.rescheduleMessage>(
                  this, METHODID_RESCHEDULE_INTERVIEW)))
          .addMethod(
            getUpdateBookingStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.interviewHub.slotBooking.InterviewSlot.updateDetails,
                com.interviewHub.slotBooking.InterviewSlot.bookingMessage>(
                  this, METHODID_UPDATE_BOOKING_STATUS)))
          .addMethod(
            getGetSlotIdForRescheduleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.interviewHub.slotBooking.InterviewSlot.slotIdDetails,
                com.interviewHub.slotBooking.InterviewSlot.slotIdResponse>(
                  this, METHODID_GET_SLOT_ID_FOR_RESCHEDULE)))
          .addMethod(
            getGetScheduledInterviewByInterviewerEmailIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.interviewHub.slotBooking.InterviewSlot.interviewerId,
                com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse>(
                  this, METHODID_GET_SCHEDULED_INTERVIEW_BY_INTERVIEWER_EMAIL_ID)))
          .addMethod(
            getGetScheduledInterviewByTagTeamEmailIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.interviewHub.slotBooking.InterviewSlot.tagTeamId,
                com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse>(
                  this, METHODID_GET_SCHEDULED_INTERVIEW_BY_TAG_TEAM_EMAIL_ID)))
          .build();
    }
  }

  /**
   */
  public static final class slotBookingStub extends io.grpc.stub.AbstractStub<slotBookingStub> {
    private slotBookingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private slotBookingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected slotBookingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new slotBookingStub(channel, callOptions);
    }

    /**
     */
    public void scheduleInterview(com.interviewHub.slotBooking.InterviewSlot.slotDetails request,
        io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.bookingMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getScheduleInterviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rescheduleInterview(com.interviewHub.slotBooking.InterviewSlot.rescheduleDetails request,
        io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.rescheduleMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRescheduleInterviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBookingStatus(com.interviewHub.slotBooking.InterviewSlot.updateDetails request,
        io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.bookingMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBookingStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSlotIdForReschedule(com.interviewHub.slotBooking.InterviewSlot.slotIdDetails request,
        io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.slotIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSlotIdForRescheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getScheduledInterviewByInterviewerEmailId(com.interviewHub.slotBooking.InterviewSlot.interviewerId request,
        io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetScheduledInterviewByInterviewerEmailIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getScheduledInterviewByTagTeamEmailId(com.interviewHub.slotBooking.InterviewSlot.tagTeamId request,
        io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetScheduledInterviewByTagTeamEmailIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class slotBookingBlockingStub extends io.grpc.stub.AbstractStub<slotBookingBlockingStub> {
    private slotBookingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private slotBookingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected slotBookingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new slotBookingBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.interviewHub.slotBooking.InterviewSlot.bookingMessage scheduleInterview(com.interviewHub.slotBooking.InterviewSlot.slotDetails request) {
      return blockingUnaryCall(
          getChannel(), getScheduleInterviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.interviewHub.slotBooking.InterviewSlot.rescheduleMessage rescheduleInterview(com.interviewHub.slotBooking.InterviewSlot.rescheduleDetails request) {
      return blockingUnaryCall(
          getChannel(), getRescheduleInterviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.interviewHub.slotBooking.InterviewSlot.bookingMessage updateBookingStatus(com.interviewHub.slotBooking.InterviewSlot.updateDetails request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBookingStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.interviewHub.slotBooking.InterviewSlot.slotIdResponse getSlotIdForReschedule(com.interviewHub.slotBooking.InterviewSlot.slotIdDetails request) {
      return blockingUnaryCall(
          getChannel(), getGetSlotIdForRescheduleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse getScheduledInterviewByInterviewerEmailId(com.interviewHub.slotBooking.InterviewSlot.interviewerId request) {
      return blockingUnaryCall(
          getChannel(), getGetScheduledInterviewByInterviewerEmailIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse getScheduledInterviewByTagTeamEmailId(com.interviewHub.slotBooking.InterviewSlot.tagTeamId request) {
      return blockingUnaryCall(
          getChannel(), getGetScheduledInterviewByTagTeamEmailIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class slotBookingFutureStub extends io.grpc.stub.AbstractStub<slotBookingFutureStub> {
    private slotBookingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private slotBookingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected slotBookingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new slotBookingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.interviewHub.slotBooking.InterviewSlot.bookingMessage> scheduleInterview(
        com.interviewHub.slotBooking.InterviewSlot.slotDetails request) {
      return futureUnaryCall(
          getChannel().newCall(getScheduleInterviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.interviewHub.slotBooking.InterviewSlot.rescheduleMessage> rescheduleInterview(
        com.interviewHub.slotBooking.InterviewSlot.rescheduleDetails request) {
      return futureUnaryCall(
          getChannel().newCall(getRescheduleInterviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.interviewHub.slotBooking.InterviewSlot.bookingMessage> updateBookingStatus(
        com.interviewHub.slotBooking.InterviewSlot.updateDetails request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBookingStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.interviewHub.slotBooking.InterviewSlot.slotIdResponse> getSlotIdForReschedule(
        com.interviewHub.slotBooking.InterviewSlot.slotIdDetails request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSlotIdForRescheduleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse> getScheduledInterviewByInterviewerEmailId(
        com.interviewHub.slotBooking.InterviewSlot.interviewerId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetScheduledInterviewByInterviewerEmailIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse> getScheduledInterviewByTagTeamEmailId(
        com.interviewHub.slotBooking.InterviewSlot.tagTeamId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetScheduledInterviewByTagTeamEmailIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SCHEDULE_INTERVIEW = 0;
  private static final int METHODID_RESCHEDULE_INTERVIEW = 1;
  private static final int METHODID_UPDATE_BOOKING_STATUS = 2;
  private static final int METHODID_GET_SLOT_ID_FOR_RESCHEDULE = 3;
  private static final int METHODID_GET_SCHEDULED_INTERVIEW_BY_INTERVIEWER_EMAIL_ID = 4;
  private static final int METHODID_GET_SCHEDULED_INTERVIEW_BY_TAG_TEAM_EMAIL_ID = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final slotBookingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(slotBookingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SCHEDULE_INTERVIEW:
          serviceImpl.scheduleInterview((com.interviewHub.slotBooking.InterviewSlot.slotDetails) request,
              (io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.bookingMessage>) responseObserver);
          break;
        case METHODID_RESCHEDULE_INTERVIEW:
          serviceImpl.rescheduleInterview((com.interviewHub.slotBooking.InterviewSlot.rescheduleDetails) request,
              (io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.rescheduleMessage>) responseObserver);
          break;
        case METHODID_UPDATE_BOOKING_STATUS:
          serviceImpl.updateBookingStatus((com.interviewHub.slotBooking.InterviewSlot.updateDetails) request,
              (io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.bookingMessage>) responseObserver);
          break;
        case METHODID_GET_SLOT_ID_FOR_RESCHEDULE:
          serviceImpl.getSlotIdForReschedule((com.interviewHub.slotBooking.InterviewSlot.slotIdDetails) request,
              (io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.slotIdResponse>) responseObserver);
          break;
        case METHODID_GET_SCHEDULED_INTERVIEW_BY_INTERVIEWER_EMAIL_ID:
          serviceImpl.getScheduledInterviewByInterviewerEmailId((com.interviewHub.slotBooking.InterviewSlot.interviewerId) request,
              (io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse>) responseObserver);
          break;
        case METHODID_GET_SCHEDULED_INTERVIEW_BY_TAG_TEAM_EMAIL_ID:
          serviceImpl.getScheduledInterviewByTagTeamEmailId((com.interviewHub.slotBooking.InterviewSlot.tagTeamId) request,
              (io.grpc.stub.StreamObserver<com.interviewHub.slotBooking.InterviewSlot.bookingMessageResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class slotBookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    slotBookingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.interviewHub.slotBooking.InterviewSlot.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("slotBooking");
    }
  }

  private static final class slotBookingFileDescriptorSupplier
      extends slotBookingBaseDescriptorSupplier {
    slotBookingFileDescriptorSupplier() {}
  }

  private static final class slotBookingMethodDescriptorSupplier
      extends slotBookingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    slotBookingMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (slotBookingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new slotBookingFileDescriptorSupplier())
              .addMethod(getScheduleInterviewMethod())
              .addMethod(getRescheduleInterviewMethod())
              .addMethod(getUpdateBookingStatusMethod())
              .addMethod(getGetSlotIdForRescheduleMethod())
              .addMethod(getGetScheduledInterviewByInterviewerEmailIdMethod())
              .addMethod(getGetScheduledInterviewByTagTeamEmailIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
