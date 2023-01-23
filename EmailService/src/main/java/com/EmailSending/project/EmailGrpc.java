package com.EmailSending.project;

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
    comments = "Source: email.proto")
public final class EmailGrpc {

  private EmailGrpc() {}

  public static final String SERVICE_NAME = "Email";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.EmailSending.project.EmailOuterClass.Notifications,
      com.EmailSending.project.EmailOuterClass.APIResponse> getSendEmailOnSlotBookingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendEmailOnSlotBooking",
      requestType = com.EmailSending.project.EmailOuterClass.Notifications.class,
      responseType = com.EmailSending.project.EmailOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.EmailSending.project.EmailOuterClass.Notifications,
      com.EmailSending.project.EmailOuterClass.APIResponse> getSendEmailOnSlotBookingMethod() {
    io.grpc.MethodDescriptor<com.EmailSending.project.EmailOuterClass.Notifications, com.EmailSending.project.EmailOuterClass.APIResponse> getSendEmailOnSlotBookingMethod;
    if ((getSendEmailOnSlotBookingMethod = EmailGrpc.getSendEmailOnSlotBookingMethod) == null) {
      synchronized (EmailGrpc.class) {
        if ((getSendEmailOnSlotBookingMethod = EmailGrpc.getSendEmailOnSlotBookingMethod) == null) {
          EmailGrpc.getSendEmailOnSlotBookingMethod = getSendEmailOnSlotBookingMethod = 
              io.grpc.MethodDescriptor.<com.EmailSending.project.EmailOuterClass.Notifications, com.EmailSending.project.EmailOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Email", "sendEmailOnSlotBooking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.EmailSending.project.EmailOuterClass.Notifications.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.EmailSending.project.EmailOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmailMethodDescriptorSupplier("sendEmailOnSlotBooking"))
                  .build();
          }
        }
     }
     return getSendEmailOnSlotBookingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.EmailSending.project.EmailOuterClass.Notifications,
      com.EmailSending.project.EmailOuterClass.APIResponse> getSendEmailOnSlotUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendEmailOnSlotUpdate",
      requestType = com.EmailSending.project.EmailOuterClass.Notifications.class,
      responseType = com.EmailSending.project.EmailOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.EmailSending.project.EmailOuterClass.Notifications,
      com.EmailSending.project.EmailOuterClass.APIResponse> getSendEmailOnSlotUpdateMethod() {
    io.grpc.MethodDescriptor<com.EmailSending.project.EmailOuterClass.Notifications, com.EmailSending.project.EmailOuterClass.APIResponse> getSendEmailOnSlotUpdateMethod;
    if ((getSendEmailOnSlotUpdateMethod = EmailGrpc.getSendEmailOnSlotUpdateMethod) == null) {
      synchronized (EmailGrpc.class) {
        if ((getSendEmailOnSlotUpdateMethod = EmailGrpc.getSendEmailOnSlotUpdateMethod) == null) {
          EmailGrpc.getSendEmailOnSlotUpdateMethod = getSendEmailOnSlotUpdateMethod = 
              io.grpc.MethodDescriptor.<com.EmailSending.project.EmailOuterClass.Notifications, com.EmailSending.project.EmailOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Email", "sendEmailOnSlotUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.EmailSending.project.EmailOuterClass.Notifications.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.EmailSending.project.EmailOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmailMethodDescriptorSupplier("sendEmailOnSlotUpdate"))
                  .build();
          }
        }
     }
     return getSendEmailOnSlotUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.EmailSending.project.EmailOuterClass.Notifications,
      com.EmailSending.project.EmailOuterClass.APIResponse> getSendEmailOnSlotcancellationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendEmailOnSlotcancellation",
      requestType = com.EmailSending.project.EmailOuterClass.Notifications.class,
      responseType = com.EmailSending.project.EmailOuterClass.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.EmailSending.project.EmailOuterClass.Notifications,
      com.EmailSending.project.EmailOuterClass.APIResponse> getSendEmailOnSlotcancellationMethod() {
    io.grpc.MethodDescriptor<com.EmailSending.project.EmailOuterClass.Notifications, com.EmailSending.project.EmailOuterClass.APIResponse> getSendEmailOnSlotcancellationMethod;
    if ((getSendEmailOnSlotcancellationMethod = EmailGrpc.getSendEmailOnSlotcancellationMethod) == null) {
      synchronized (EmailGrpc.class) {
        if ((getSendEmailOnSlotcancellationMethod = EmailGrpc.getSendEmailOnSlotcancellationMethod) == null) {
          EmailGrpc.getSendEmailOnSlotcancellationMethod = getSendEmailOnSlotcancellationMethod = 
              io.grpc.MethodDescriptor.<com.EmailSending.project.EmailOuterClass.Notifications, com.EmailSending.project.EmailOuterClass.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Email", "sendEmailOnSlotcancellation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.EmailSending.project.EmailOuterClass.Notifications.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.EmailSending.project.EmailOuterClass.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmailMethodDescriptorSupplier("sendEmailOnSlotcancellation"))
                  .build();
          }
        }
     }
     return getSendEmailOnSlotcancellationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmailStub newStub(io.grpc.Channel channel) {
    return new EmailStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmailBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmailBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmailFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmailFutureStub(channel);
  }

  /**
   */
  public static abstract class EmailImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendEmailOnSlotBooking(com.EmailSending.project.EmailOuterClass.Notifications request,
        io.grpc.stub.StreamObserver<com.EmailSending.project.EmailOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendEmailOnSlotBookingMethod(), responseObserver);
    }

    /**
     */
    public void sendEmailOnSlotUpdate(com.EmailSending.project.EmailOuterClass.Notifications request,
        io.grpc.stub.StreamObserver<com.EmailSending.project.EmailOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendEmailOnSlotUpdateMethod(), responseObserver);
    }

    /**
     */
    public void sendEmailOnSlotcancellation(com.EmailSending.project.EmailOuterClass.Notifications request,
        io.grpc.stub.StreamObserver<com.EmailSending.project.EmailOuterClass.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendEmailOnSlotcancellationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendEmailOnSlotBookingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.EmailSending.project.EmailOuterClass.Notifications,
                com.EmailSending.project.EmailOuterClass.APIResponse>(
                  this, METHODID_SEND_EMAIL_ON_SLOT_BOOKING)))
          .addMethod(
            getSendEmailOnSlotUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.EmailSending.project.EmailOuterClass.Notifications,
                com.EmailSending.project.EmailOuterClass.APIResponse>(
                  this, METHODID_SEND_EMAIL_ON_SLOT_UPDATE)))
          .addMethod(
            getSendEmailOnSlotcancellationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.EmailSending.project.EmailOuterClass.Notifications,
                com.EmailSending.project.EmailOuterClass.APIResponse>(
                  this, METHODID_SEND_EMAIL_ON_SLOTCANCELLATION)))
          .build();
    }
  }

  /**
   */
  public static final class EmailStub extends io.grpc.stub.AbstractStub<EmailStub> {
    private EmailStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmailStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmailStub(channel, callOptions);
    }

    /**
     */
    public void sendEmailOnSlotBooking(com.EmailSending.project.EmailOuterClass.Notifications request,
        io.grpc.stub.StreamObserver<com.EmailSending.project.EmailOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendEmailOnSlotBookingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendEmailOnSlotUpdate(com.EmailSending.project.EmailOuterClass.Notifications request,
        io.grpc.stub.StreamObserver<com.EmailSending.project.EmailOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendEmailOnSlotUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendEmailOnSlotcancellation(com.EmailSending.project.EmailOuterClass.Notifications request,
        io.grpc.stub.StreamObserver<com.EmailSending.project.EmailOuterClass.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendEmailOnSlotcancellationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmailBlockingStub extends io.grpc.stub.AbstractStub<EmailBlockingStub> {
    private EmailBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmailBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmailBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.EmailSending.project.EmailOuterClass.APIResponse sendEmailOnSlotBooking(com.EmailSending.project.EmailOuterClass.Notifications request) {
      return blockingUnaryCall(
          getChannel(), getSendEmailOnSlotBookingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.EmailSending.project.EmailOuterClass.APIResponse sendEmailOnSlotUpdate(com.EmailSending.project.EmailOuterClass.Notifications request) {
      return blockingUnaryCall(
          getChannel(), getSendEmailOnSlotUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.EmailSending.project.EmailOuterClass.APIResponse sendEmailOnSlotcancellation(com.EmailSending.project.EmailOuterClass.Notifications request) {
      return blockingUnaryCall(
          getChannel(), getSendEmailOnSlotcancellationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmailFutureStub extends io.grpc.stub.AbstractStub<EmailFutureStub> {
    private EmailFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmailFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmailFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmailFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.EmailSending.project.EmailOuterClass.APIResponse> sendEmailOnSlotBooking(
        com.EmailSending.project.EmailOuterClass.Notifications request) {
      return futureUnaryCall(
          getChannel().newCall(getSendEmailOnSlotBookingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.EmailSending.project.EmailOuterClass.APIResponse> sendEmailOnSlotUpdate(
        com.EmailSending.project.EmailOuterClass.Notifications request) {
      return futureUnaryCall(
          getChannel().newCall(getSendEmailOnSlotUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.EmailSending.project.EmailOuterClass.APIResponse> sendEmailOnSlotcancellation(
        com.EmailSending.project.EmailOuterClass.Notifications request) {
      return futureUnaryCall(
          getChannel().newCall(getSendEmailOnSlotcancellationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_EMAIL_ON_SLOT_BOOKING = 0;
  private static final int METHODID_SEND_EMAIL_ON_SLOT_UPDATE = 1;
  private static final int METHODID_SEND_EMAIL_ON_SLOTCANCELLATION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmailImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmailImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_EMAIL_ON_SLOT_BOOKING:
          serviceImpl.sendEmailOnSlotBooking((com.EmailSending.project.EmailOuterClass.Notifications) request,
              (io.grpc.stub.StreamObserver<com.EmailSending.project.EmailOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_SEND_EMAIL_ON_SLOT_UPDATE:
          serviceImpl.sendEmailOnSlotUpdate((com.EmailSending.project.EmailOuterClass.Notifications) request,
              (io.grpc.stub.StreamObserver<com.EmailSending.project.EmailOuterClass.APIResponse>) responseObserver);
          break;
        case METHODID_SEND_EMAIL_ON_SLOTCANCELLATION:
          serviceImpl.sendEmailOnSlotcancellation((com.EmailSending.project.EmailOuterClass.Notifications) request,
              (io.grpc.stub.StreamObserver<com.EmailSending.project.EmailOuterClass.APIResponse>) responseObserver);
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

  private static abstract class EmailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmailBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.EmailSending.project.EmailOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Email");
    }
  }

  private static final class EmailFileDescriptorSupplier
      extends EmailBaseDescriptorSupplier {
    EmailFileDescriptorSupplier() {}
  }

  private static final class EmailMethodDescriptorSupplier
      extends EmailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmailMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmailGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmailFileDescriptorSupplier())
              .addMethod(getSendEmailOnSlotBookingMethod())
              .addMethod(getSendEmailOnSlotUpdateMethod())
              .addMethod(getSendEmailOnSlotcancellationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
