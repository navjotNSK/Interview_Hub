package com.gl.registration;

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
    comments = "Source: registration.proto")
public final class registrationServicesGrpc {

  private registrationServicesGrpc() {}

  public static final String SERVICE_NAME = "registration.registrationServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.gl.grpc.addRequest,
      com.gl.grpc.addResponse> getAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addUser",
      requestType = com.gl.grpc.addRequest.class,
      responseType = com.gl.grpc.addResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gl.grpc.addRequest,
      com.gl.grpc.addResponse> getAddUserMethod() {
    io.grpc.MethodDescriptor<com.gl.grpc.addRequest, com.gl.grpc.addResponse> getAddUserMethod;
    if ((getAddUserMethod = registrationServicesGrpc.getAddUserMethod) == null) {
      synchronized (registrationServicesGrpc.class) {
        if ((getAddUserMethod = registrationServicesGrpc.getAddUserMethod) == null) {
          registrationServicesGrpc.getAddUserMethod = getAddUserMethod = 
              io.grpc.MethodDescriptor.<com.gl.grpc.addRequest, com.gl.grpc.addResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "registration.registrationServices", "addUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gl.grpc.addRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gl.grpc.addResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new registrationServicesMethodDescriptorSupplier("addUser"))
                  .build();
          }
        }
     }
     return getAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gl.grpc.updateRequest,
      com.gl.grpc.updateResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUser",
      requestType = com.gl.grpc.updateRequest.class,
      responseType = com.gl.grpc.updateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gl.grpc.updateRequest,
      com.gl.grpc.updateResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.gl.grpc.updateRequest, com.gl.grpc.updateResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = registrationServicesGrpc.getUpdateUserMethod) == null) {
      synchronized (registrationServicesGrpc.class) {
        if ((getUpdateUserMethod = registrationServicesGrpc.getUpdateUserMethod) == null) {
          registrationServicesGrpc.getUpdateUserMethod = getUpdateUserMethod = 
              io.grpc.MethodDescriptor.<com.gl.grpc.updateRequest, com.gl.grpc.updateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "registration.registrationServices", "updateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gl.grpc.updateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gl.grpc.updateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new registrationServicesMethodDescriptorSupplier("updateUser"))
                  .build();
          }
        }
     }
     return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gl.grpc.deleteRequest,
      com.gl.grpc.deleteResponse> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUser",
      requestType = com.gl.grpc.deleteRequest.class,
      responseType = com.gl.grpc.deleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gl.grpc.deleteRequest,
      com.gl.grpc.deleteResponse> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.gl.grpc.deleteRequest, com.gl.grpc.deleteResponse> getDeleteUserMethod;
    if ((getDeleteUserMethod = registrationServicesGrpc.getDeleteUserMethod) == null) {
      synchronized (registrationServicesGrpc.class) {
        if ((getDeleteUserMethod = registrationServicesGrpc.getDeleteUserMethod) == null) {
          registrationServicesGrpc.getDeleteUserMethod = getDeleteUserMethod = 
              io.grpc.MethodDescriptor.<com.gl.grpc.deleteRequest, com.gl.grpc.deleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "registration.registrationServices", "deleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gl.grpc.deleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gl.grpc.deleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new registrationServicesMethodDescriptorSupplier("deleteUser"))
                  .build();
          }
        }
     }
     return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gl.grpc.getUserByMailRequest,
      com.gl.grpc.getUserByMailResponse> getGetUserByMailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserByMail",
      requestType = com.gl.grpc.getUserByMailRequest.class,
      responseType = com.gl.grpc.getUserByMailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gl.grpc.getUserByMailRequest,
      com.gl.grpc.getUserByMailResponse> getGetUserByMailMethod() {
    io.grpc.MethodDescriptor<com.gl.grpc.getUserByMailRequest, com.gl.grpc.getUserByMailResponse> getGetUserByMailMethod;
    if ((getGetUserByMailMethod = registrationServicesGrpc.getGetUserByMailMethod) == null) {
      synchronized (registrationServicesGrpc.class) {
        if ((getGetUserByMailMethod = registrationServicesGrpc.getGetUserByMailMethod) == null) {
          registrationServicesGrpc.getGetUserByMailMethod = getGetUserByMailMethod = 
              io.grpc.MethodDescriptor.<com.gl.grpc.getUserByMailRequest, com.gl.grpc.getUserByMailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "registration.registrationServices", "getUserByMail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gl.grpc.getUserByMailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gl.grpc.getUserByMailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new registrationServicesMethodDescriptorSupplier("getUserByMail"))
                  .build();
          }
        }
     }
     return getGetUserByMailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.gl.grpc.getUserByTechRequest,
      com.gl.grpc.getUserByTechResponse> getGetUsersByTechStackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUsersByTechStack",
      requestType = com.gl.grpc.getUserByTechRequest.class,
      responseType = com.gl.grpc.getUserByTechResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.gl.grpc.getUserByTechRequest,
      com.gl.grpc.getUserByTechResponse> getGetUsersByTechStackMethod() {
    io.grpc.MethodDescriptor<com.gl.grpc.getUserByTechRequest, com.gl.grpc.getUserByTechResponse> getGetUsersByTechStackMethod;
    if ((getGetUsersByTechStackMethod = registrationServicesGrpc.getGetUsersByTechStackMethod) == null) {
      synchronized (registrationServicesGrpc.class) {
        if ((getGetUsersByTechStackMethod = registrationServicesGrpc.getGetUsersByTechStackMethod) == null) {
          registrationServicesGrpc.getGetUsersByTechStackMethod = getGetUsersByTechStackMethod = 
              io.grpc.MethodDescriptor.<com.gl.grpc.getUserByTechRequest, com.gl.grpc.getUserByTechResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "registration.registrationServices", "getUsersByTechStack"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gl.grpc.getUserByTechRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.gl.grpc.getUserByTechResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new registrationServicesMethodDescriptorSupplier("getUsersByTechStack"))
                  .build();
          }
        }
     }
     return getGetUsersByTechStackMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static registrationServicesStub newStub(io.grpc.Channel channel) {
    return new registrationServicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static registrationServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new registrationServicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static registrationServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new registrationServicesFutureStub(channel);
  }

  /**
   */
  public static abstract class registrationServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void addUser(com.gl.grpc.addRequest request,
        io.grpc.stub.StreamObserver<com.gl.grpc.addResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(com.gl.grpc.updateRequest request,
        io.grpc.stub.StreamObserver<com.gl.grpc.updateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(com.gl.grpc.deleteRequest request,
        io.grpc.stub.StreamObserver<com.gl.grpc.deleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    public void getUserByMail(com.gl.grpc.getUserByMailRequest request,
        io.grpc.stub.StreamObserver<com.gl.grpc.getUserByMailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserByMailMethod(), responseObserver);
    }

    /**
     */
    public void getUsersByTechStack(com.gl.grpc.getUserByTechRequest request,
        io.grpc.stub.StreamObserver<com.gl.grpc.getUserByTechResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUsersByTechStackMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.gl.grpc.addRequest,
                com.gl.grpc.addResponse>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            getUpdateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.gl.grpc.updateRequest,
                com.gl.grpc.updateResponse>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.gl.grpc.deleteRequest,
                com.gl.grpc.deleteResponse>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getGetUserByMailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.gl.grpc.getUserByMailRequest,
                com.gl.grpc.getUserByMailResponse>(
                  this, METHODID_GET_USER_BY_MAIL)))
          .addMethod(
            getGetUsersByTechStackMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.gl.grpc.getUserByTechRequest,
                com.gl.grpc.getUserByTechResponse>(
                  this, METHODID_GET_USERS_BY_TECH_STACK)))
          .build();
    }
  }

  /**
   */
  public static final class registrationServicesStub extends io.grpc.stub.AbstractStub<registrationServicesStub> {
    private registrationServicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private registrationServicesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected registrationServicesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new registrationServicesStub(channel, callOptions);
    }

    /**
     */
    public void addUser(com.gl.grpc.addRequest request,
        io.grpc.stub.StreamObserver<com.gl.grpc.addResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.gl.grpc.updateRequest request,
        io.grpc.stub.StreamObserver<com.gl.grpc.updateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.gl.grpc.deleteRequest request,
        io.grpc.stub.StreamObserver<com.gl.grpc.deleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserByMail(com.gl.grpc.getUserByMailRequest request,
        io.grpc.stub.StreamObserver<com.gl.grpc.getUserByMailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserByMailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUsersByTechStack(com.gl.grpc.getUserByTechRequest request,
        io.grpc.stub.StreamObserver<com.gl.grpc.getUserByTechResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUsersByTechStackMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class registrationServicesBlockingStub extends io.grpc.stub.AbstractStub<registrationServicesBlockingStub> {
    private registrationServicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private registrationServicesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected registrationServicesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new registrationServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.gl.grpc.addResponse addUser(com.gl.grpc.addRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gl.grpc.updateResponse updateUser(com.gl.grpc.updateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gl.grpc.deleteResponse deleteUser(com.gl.grpc.deleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gl.grpc.getUserByMailResponse getUserByMail(com.gl.grpc.getUserByMailRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserByMailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.gl.grpc.getUserByTechResponse getUsersByTechStack(com.gl.grpc.getUserByTechRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUsersByTechStackMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class registrationServicesFutureStub extends io.grpc.stub.AbstractStub<registrationServicesFutureStub> {
    private registrationServicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private registrationServicesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected registrationServicesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new registrationServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gl.grpc.addResponse> addUser(
        com.gl.grpc.addRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gl.grpc.updateResponse> updateUser(
        com.gl.grpc.updateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gl.grpc.deleteResponse> deleteUser(
        com.gl.grpc.deleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gl.grpc.getUserByMailResponse> getUserByMail(
        com.gl.grpc.getUserByMailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserByMailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.gl.grpc.getUserByTechResponse> getUsersByTechStack(
        com.gl.grpc.getUserByTechRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUsersByTechStackMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USER = 0;
  private static final int METHODID_UPDATE_USER = 1;
  private static final int METHODID_DELETE_USER = 2;
  private static final int METHODID_GET_USER_BY_MAIL = 3;
  private static final int METHODID_GET_USERS_BY_TECH_STACK = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final registrationServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(registrationServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_USER:
          serviceImpl.addUser((com.gl.grpc.addRequest) request,
              (io.grpc.stub.StreamObserver<com.gl.grpc.addResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.gl.grpc.updateRequest) request,
              (io.grpc.stub.StreamObserver<com.gl.grpc.updateResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.gl.grpc.deleteRequest) request,
              (io.grpc.stub.StreamObserver<com.gl.grpc.deleteResponse>) responseObserver);
          break;
        case METHODID_GET_USER_BY_MAIL:
          serviceImpl.getUserByMail((com.gl.grpc.getUserByMailRequest) request,
              (io.grpc.stub.StreamObserver<com.gl.grpc.getUserByMailResponse>) responseObserver);
          break;
        case METHODID_GET_USERS_BY_TECH_STACK:
          serviceImpl.getUsersByTechStack((com.gl.grpc.getUserByTechRequest) request,
              (io.grpc.stub.StreamObserver<com.gl.grpc.getUserByTechResponse>) responseObserver);
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

  private static abstract class registrationServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    registrationServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.gl.registration.Registration.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("registrationServices");
    }
  }

  private static final class registrationServicesFileDescriptorSupplier
      extends registrationServicesBaseDescriptorSupplier {
    registrationServicesFileDescriptorSupplier() {}
  }

  private static final class registrationServicesMethodDescriptorSupplier
      extends registrationServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    registrationServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (registrationServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new registrationServicesFileDescriptorSupplier())
              .addMethod(getAddUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getGetUserByMailMethod())
              .addMethod(getGetUsersByTechStackMethod())
              .build();
        }
      }
    }
    return result;
  }
}
