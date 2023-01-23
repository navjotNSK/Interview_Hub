package com.GLProduct.interviewer;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: InterviewerSlot.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InterviewerServiceGrpc {

  private InterviewerServiceGrpc() {}

  public static final String SERVICE_NAME = "InterviewerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.GLProduct.interviewer.InterviewerSlot,
      com.GLProduct.interviewer.APIRESPONSE> getNewInterviewSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "newInterviewSlot",
      requestType = com.GLProduct.interviewer.InterviewerSlot.class,
      responseType = com.GLProduct.interviewer.APIRESPONSE.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.GLProduct.interviewer.InterviewerSlot,
      com.GLProduct.interviewer.APIRESPONSE> getNewInterviewSlotMethod() {
    io.grpc.MethodDescriptor<com.GLProduct.interviewer.InterviewerSlot, com.GLProduct.interviewer.APIRESPONSE> getNewInterviewSlotMethod;
    if ((getNewInterviewSlotMethod = InterviewerServiceGrpc.getNewInterviewSlotMethod) == null) {
      synchronized (InterviewerServiceGrpc.class) {
        if ((getNewInterviewSlotMethod = InterviewerServiceGrpc.getNewInterviewSlotMethod) == null) {
          InterviewerServiceGrpc.getNewInterviewSlotMethod = getNewInterviewSlotMethod =
              io.grpc.MethodDescriptor.<com.GLProduct.interviewer.InterviewerSlot, com.GLProduct.interviewer.APIRESPONSE>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "newInterviewSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.GLProduct.interviewer.InterviewerSlot.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.GLProduct.interviewer.APIRESPONSE.getDefaultInstance()))
              .setSchemaDescriptor(new InterviewerServiceMethodDescriptorSupplier("newInterviewSlot"))
              .build();
        }
      }
    }
    return getNewInterviewSlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.GLProduct.interviewer.GetSlotById,
      com.GLProduct.interviewer.ResponseSlot> getGetAllSlotsByEmailIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllSlotsByEmailId",
      requestType = com.GLProduct.interviewer.GetSlotById.class,
      responseType = com.GLProduct.interviewer.ResponseSlot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.GLProduct.interviewer.GetSlotById,
      com.GLProduct.interviewer.ResponseSlot> getGetAllSlotsByEmailIdMethod() {
    io.grpc.MethodDescriptor<com.GLProduct.interviewer.GetSlotById, com.GLProduct.interviewer.ResponseSlot> getGetAllSlotsByEmailIdMethod;
    if ((getGetAllSlotsByEmailIdMethod = InterviewerServiceGrpc.getGetAllSlotsByEmailIdMethod) == null) {
      synchronized (InterviewerServiceGrpc.class) {
        if ((getGetAllSlotsByEmailIdMethod = InterviewerServiceGrpc.getGetAllSlotsByEmailIdMethod) == null) {
          InterviewerServiceGrpc.getGetAllSlotsByEmailIdMethod = getGetAllSlotsByEmailIdMethod =
              io.grpc.MethodDescriptor.<com.GLProduct.interviewer.GetSlotById, com.GLProduct.interviewer.ResponseSlot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllSlotsByEmailId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.GLProduct.interviewer.GetSlotById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.GLProduct.interviewer.ResponseSlot.getDefaultInstance()))
              .setSchemaDescriptor(new InterviewerServiceMethodDescriptorSupplier("getAllSlotsByEmailId"))
              .build();
        }
      }
    }
    return getGetAllSlotsByEmailIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.GLProduct.interviewer.slotsByDate,
      com.GLProduct.interviewer.ResponseSlot> getGetAllSlotsByDateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllSlotsByDate",
      requestType = com.GLProduct.interviewer.slotsByDate.class,
      responseType = com.GLProduct.interviewer.ResponseSlot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.GLProduct.interviewer.slotsByDate,
      com.GLProduct.interviewer.ResponseSlot> getGetAllSlotsByDateMethod() {
    io.grpc.MethodDescriptor<com.GLProduct.interviewer.slotsByDate, com.GLProduct.interviewer.ResponseSlot> getGetAllSlotsByDateMethod;
    if ((getGetAllSlotsByDateMethod = InterviewerServiceGrpc.getGetAllSlotsByDateMethod) == null) {
      synchronized (InterviewerServiceGrpc.class) {
        if ((getGetAllSlotsByDateMethod = InterviewerServiceGrpc.getGetAllSlotsByDateMethod) == null) {
          InterviewerServiceGrpc.getGetAllSlotsByDateMethod = getGetAllSlotsByDateMethod =
              io.grpc.MethodDescriptor.<com.GLProduct.interviewer.slotsByDate, com.GLProduct.interviewer.ResponseSlot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllSlotsByDate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.GLProduct.interviewer.slotsByDate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.GLProduct.interviewer.ResponseSlot.getDefaultInstance()))
              .setSchemaDescriptor(new InterviewerServiceMethodDescriptorSupplier("getAllSlotsByDate"))
              .build();
        }
      }
    }
    return getGetAllSlotsByDateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.GLProduct.interviewer.slotDeletion,
      com.GLProduct.interviewer.slotUpdationResponse> getDeleteSlotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteSlot",
      requestType = com.GLProduct.interviewer.slotDeletion.class,
      responseType = com.GLProduct.interviewer.slotUpdationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.GLProduct.interviewer.slotDeletion,
      com.GLProduct.interviewer.slotUpdationResponse> getDeleteSlotMethod() {
    io.grpc.MethodDescriptor<com.GLProduct.interviewer.slotDeletion, com.GLProduct.interviewer.slotUpdationResponse> getDeleteSlotMethod;
    if ((getDeleteSlotMethod = InterviewerServiceGrpc.getDeleteSlotMethod) == null) {
      synchronized (InterviewerServiceGrpc.class) {
        if ((getDeleteSlotMethod = InterviewerServiceGrpc.getDeleteSlotMethod) == null) {
          InterviewerServiceGrpc.getDeleteSlotMethod = getDeleteSlotMethod =
              io.grpc.MethodDescriptor.<com.GLProduct.interviewer.slotDeletion, com.GLProduct.interviewer.slotUpdationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteSlot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.GLProduct.interviewer.slotDeletion.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.GLProduct.interviewer.slotUpdationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InterviewerServiceMethodDescriptorSupplier("deleteSlot"))
              .build();
        }
      }
    }
    return getDeleteSlotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.GLProduct.interviewer.SlotUpdation,
      com.GLProduct.interviewer.slotUpdationResponse> getUpdateSlotStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateSlotStatus",
      requestType = com.GLProduct.interviewer.SlotUpdation.class,
      responseType = com.GLProduct.interviewer.slotUpdationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.GLProduct.interviewer.SlotUpdation,
      com.GLProduct.interviewer.slotUpdationResponse> getUpdateSlotStatusMethod() {
    io.grpc.MethodDescriptor<com.GLProduct.interviewer.SlotUpdation, com.GLProduct.interviewer.slotUpdationResponse> getUpdateSlotStatusMethod;
    if ((getUpdateSlotStatusMethod = InterviewerServiceGrpc.getUpdateSlotStatusMethod) == null) {
      synchronized (InterviewerServiceGrpc.class) {
        if ((getUpdateSlotStatusMethod = InterviewerServiceGrpc.getUpdateSlotStatusMethod) == null) {
          InterviewerServiceGrpc.getUpdateSlotStatusMethod = getUpdateSlotStatusMethod =
              io.grpc.MethodDescriptor.<com.GLProduct.interviewer.SlotUpdation, com.GLProduct.interviewer.slotUpdationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateSlotStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.GLProduct.interviewer.SlotUpdation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.GLProduct.interviewer.slotUpdationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InterviewerServiceMethodDescriptorSupplier("updateSlotStatus"))
              .build();
        }
      }
    }
    return getUpdateSlotStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.GLProduct.interviewer.updateSlot,
      com.GLProduct.interviewer.slotUpdationResponse> getUpdateSlotRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateSlotRequest",
      requestType = com.GLProduct.interviewer.updateSlot.class,
      responseType = com.GLProduct.interviewer.slotUpdationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.GLProduct.interviewer.updateSlot,
      com.GLProduct.interviewer.slotUpdationResponse> getUpdateSlotRequestMethod() {
    io.grpc.MethodDescriptor<com.GLProduct.interviewer.updateSlot, com.GLProduct.interviewer.slotUpdationResponse> getUpdateSlotRequestMethod;
    if ((getUpdateSlotRequestMethod = InterviewerServiceGrpc.getUpdateSlotRequestMethod) == null) {
      synchronized (InterviewerServiceGrpc.class) {
        if ((getUpdateSlotRequestMethod = InterviewerServiceGrpc.getUpdateSlotRequestMethod) == null) {
          InterviewerServiceGrpc.getUpdateSlotRequestMethod = getUpdateSlotRequestMethod =
              io.grpc.MethodDescriptor.<com.GLProduct.interviewer.updateSlot, com.GLProduct.interviewer.slotUpdationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateSlotRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.GLProduct.interviewer.updateSlot.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.GLProduct.interviewer.slotUpdationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InterviewerServiceMethodDescriptorSupplier("updateSlotRequest"))
              .build();
        }
      }
    }
    return getUpdateSlotRequestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InterviewerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InterviewerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InterviewerServiceStub>() {
        @java.lang.Override
        public InterviewerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InterviewerServiceStub(channel, callOptions);
        }
      };
    return InterviewerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InterviewerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InterviewerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InterviewerServiceBlockingStub>() {
        @java.lang.Override
        public InterviewerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InterviewerServiceBlockingStub(channel, callOptions);
        }
      };
    return InterviewerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InterviewerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InterviewerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InterviewerServiceFutureStub>() {
        @java.lang.Override
        public InterviewerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InterviewerServiceFutureStub(channel, callOptions);
        }
      };
    return InterviewerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class InterviewerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void newInterviewSlot(com.GLProduct.interviewer.InterviewerSlot request,
        io.grpc.stub.StreamObserver<com.GLProduct.interviewer.APIRESPONSE> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewInterviewSlotMethod(), responseObserver);
    }

    /**
     */
    public void getAllSlotsByEmailId(com.GLProduct.interviewer.GetSlotById request,
        io.grpc.stub.StreamObserver<com.GLProduct.interviewer.ResponseSlot> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllSlotsByEmailIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllSlotsByDate(com.GLProduct.interviewer.slotsByDate request,
        io.grpc.stub.StreamObserver<com.GLProduct.interviewer.ResponseSlot> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllSlotsByDateMethod(), responseObserver);
    }

    /**
     */
    public void deleteSlot(com.GLProduct.interviewer.slotDeletion request,
        io.grpc.stub.StreamObserver<com.GLProduct.interviewer.slotUpdationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSlotMethod(), responseObserver);
    }

    /**
     */
    public void updateSlotStatus(com.GLProduct.interviewer.SlotUpdation request,
        io.grpc.stub.StreamObserver<com.GLProduct.interviewer.slotUpdationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSlotStatusMethod(), responseObserver);
    }

    /**
     */
    public void updateSlotRequest(com.GLProduct.interviewer.updateSlot request,
        io.grpc.stub.StreamObserver<com.GLProduct.interviewer.slotUpdationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSlotRequestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNewInterviewSlotMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.GLProduct.interviewer.InterviewerSlot,
                com.GLProduct.interviewer.APIRESPONSE>(
                  this, METHODID_NEW_INTERVIEW_SLOT)))
          .addMethod(
            getGetAllSlotsByEmailIdMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.GLProduct.interviewer.GetSlotById,
                com.GLProduct.interviewer.ResponseSlot>(
                  this, METHODID_GET_ALL_SLOTS_BY_EMAIL_ID)))
          .addMethod(
            getGetAllSlotsByDateMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.GLProduct.interviewer.slotsByDate,
                com.GLProduct.interviewer.ResponseSlot>(
                  this, METHODID_GET_ALL_SLOTS_BY_DATE)))
          .addMethod(
            getDeleteSlotMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.GLProduct.interviewer.slotDeletion,
                com.GLProduct.interviewer.slotUpdationResponse>(
                  this, METHODID_DELETE_SLOT)))
          .addMethod(
            getUpdateSlotStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.GLProduct.interviewer.SlotUpdation,
                com.GLProduct.interviewer.slotUpdationResponse>(
                  this, METHODID_UPDATE_SLOT_STATUS)))
          .addMethod(
            getUpdateSlotRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.GLProduct.interviewer.updateSlot,
                com.GLProduct.interviewer.slotUpdationResponse>(
                  this, METHODID_UPDATE_SLOT_REQUEST)))
          .build();
    }
  }

  /**
   */
  public static final class InterviewerServiceStub extends io.grpc.stub.AbstractAsyncStub<InterviewerServiceStub> {
    private InterviewerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterviewerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InterviewerServiceStub(channel, callOptions);
    }

    /**
     */
    public void newInterviewSlot(com.GLProduct.interviewer.InterviewerSlot request,
        io.grpc.stub.StreamObserver<com.GLProduct.interviewer.APIRESPONSE> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewInterviewSlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllSlotsByEmailId(com.GLProduct.interviewer.GetSlotById request,
        io.grpc.stub.StreamObserver<com.GLProduct.interviewer.ResponseSlot> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllSlotsByEmailIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllSlotsByDate(com.GLProduct.interviewer.slotsByDate request,
        io.grpc.stub.StreamObserver<com.GLProduct.interviewer.ResponseSlot> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllSlotsByDateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSlot(com.GLProduct.interviewer.slotDeletion request,
        io.grpc.stub.StreamObserver<com.GLProduct.interviewer.slotUpdationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSlotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSlotStatus(com.GLProduct.interviewer.SlotUpdation request,
        io.grpc.stub.StreamObserver<com.GLProduct.interviewer.slotUpdationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSlotStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSlotRequest(com.GLProduct.interviewer.updateSlot request,
        io.grpc.stub.StreamObserver<com.GLProduct.interviewer.slotUpdationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSlotRequestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class InterviewerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<InterviewerServiceBlockingStub> {
    private InterviewerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterviewerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InterviewerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.GLProduct.interviewer.APIRESPONSE newInterviewSlot(com.GLProduct.interviewer.InterviewerSlot request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewInterviewSlotMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.GLProduct.interviewer.ResponseSlot> getAllSlotsByEmailId(
        com.GLProduct.interviewer.GetSlotById request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllSlotsByEmailIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.GLProduct.interviewer.ResponseSlot> getAllSlotsByDate(
        com.GLProduct.interviewer.slotsByDate request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllSlotsByDateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.GLProduct.interviewer.slotUpdationResponse deleteSlot(com.GLProduct.interviewer.slotDeletion request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSlotMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.GLProduct.interviewer.slotUpdationResponse updateSlotStatus(com.GLProduct.interviewer.SlotUpdation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSlotStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.GLProduct.interviewer.slotUpdationResponse updateSlotRequest(com.GLProduct.interviewer.updateSlot request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSlotRequestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class InterviewerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<InterviewerServiceFutureStub> {
    private InterviewerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InterviewerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InterviewerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.GLProduct.interviewer.APIRESPONSE> newInterviewSlot(
        com.GLProduct.interviewer.InterviewerSlot request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewInterviewSlotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.GLProduct.interviewer.slotUpdationResponse> deleteSlot(
        com.GLProduct.interviewer.slotDeletion request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSlotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.GLProduct.interviewer.slotUpdationResponse> updateSlotStatus(
        com.GLProduct.interviewer.SlotUpdation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSlotStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.GLProduct.interviewer.slotUpdationResponse> updateSlotRequest(
        com.GLProduct.interviewer.updateSlot request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSlotRequestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NEW_INTERVIEW_SLOT = 0;
  private static final int METHODID_GET_ALL_SLOTS_BY_EMAIL_ID = 1;
  private static final int METHODID_GET_ALL_SLOTS_BY_DATE = 2;
  private static final int METHODID_DELETE_SLOT = 3;
  private static final int METHODID_UPDATE_SLOT_STATUS = 4;
  private static final int METHODID_UPDATE_SLOT_REQUEST = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final InterviewerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(InterviewerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NEW_INTERVIEW_SLOT:
          serviceImpl.newInterviewSlot((com.GLProduct.interviewer.InterviewerSlot) request,
              (io.grpc.stub.StreamObserver<com.GLProduct.interviewer.APIRESPONSE>) responseObserver);
          break;
        case METHODID_GET_ALL_SLOTS_BY_EMAIL_ID:
          serviceImpl.getAllSlotsByEmailId((com.GLProduct.interviewer.GetSlotById) request,
              (io.grpc.stub.StreamObserver<com.GLProduct.interviewer.ResponseSlot>) responseObserver);
          break;
        case METHODID_GET_ALL_SLOTS_BY_DATE:
          serviceImpl.getAllSlotsByDate((com.GLProduct.interviewer.slotsByDate) request,
              (io.grpc.stub.StreamObserver<com.GLProduct.interviewer.ResponseSlot>) responseObserver);
          break;
        case METHODID_DELETE_SLOT:
          serviceImpl.deleteSlot((com.GLProduct.interviewer.slotDeletion) request,
              (io.grpc.stub.StreamObserver<com.GLProduct.interviewer.slotUpdationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SLOT_STATUS:
          serviceImpl.updateSlotStatus((com.GLProduct.interviewer.SlotUpdation) request,
              (io.grpc.stub.StreamObserver<com.GLProduct.interviewer.slotUpdationResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SLOT_REQUEST:
          serviceImpl.updateSlotRequest((com.GLProduct.interviewer.updateSlot) request,
              (io.grpc.stub.StreamObserver<com.GLProduct.interviewer.slotUpdationResponse>) responseObserver);
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

  private static abstract class InterviewerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InterviewerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.GLProduct.interviewer.InterviewerSlotOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InterviewerService");
    }
  }

  private static final class InterviewerServiceFileDescriptorSupplier
      extends InterviewerServiceBaseDescriptorSupplier {
    InterviewerServiceFileDescriptorSupplier() {}
  }

  private static final class InterviewerServiceMethodDescriptorSupplier
      extends InterviewerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InterviewerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (InterviewerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InterviewerServiceFileDescriptorSupplier())
              .addMethod(getNewInterviewSlotMethod())
              .addMethod(getGetAllSlotsByEmailIdMethod())
              .addMethod(getGetAllSlotsByDateMethod())
              .addMethod(getDeleteSlotMethod())
              .addMethod(getUpdateSlotStatusMethod())
              .addMethod(getUpdateSlotRequestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
