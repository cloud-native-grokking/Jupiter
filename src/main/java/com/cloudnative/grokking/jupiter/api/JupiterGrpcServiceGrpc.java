package com.cloudnative.grokking.jupiter.api;

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
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: jupiter.proto")
public final class JupiterGrpcServiceGrpc {

  private JupiterGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "sample.api.JupiterGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cloudnative.grokking.jupiter.api.PingRequest,
      com.cloudnative.grokking.jupiter.api.PingResponse> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ping",
      requestType = com.cloudnative.grokking.jupiter.api.PingRequest.class,
      responseType = com.cloudnative.grokking.jupiter.api.PingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cloudnative.grokking.jupiter.api.PingRequest,
      com.cloudnative.grokking.jupiter.api.PingResponse> getPingMethod() {
    io.grpc.MethodDescriptor<com.cloudnative.grokking.jupiter.api.PingRequest, com.cloudnative.grokking.jupiter.api.PingResponse> getPingMethod;
    if ((getPingMethod = JupiterGrpcServiceGrpc.getPingMethod) == null) {
      synchronized (JupiterGrpcServiceGrpc.class) {
        if ((getPingMethod = JupiterGrpcServiceGrpc.getPingMethod) == null) {
          JupiterGrpcServiceGrpc.getPingMethod = getPingMethod = 
              io.grpc.MethodDescriptor.<com.cloudnative.grokking.jupiter.api.PingRequest, com.cloudnative.grokking.jupiter.api.PingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sample.api.JupiterGrpcService", "ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloudnative.grokking.jupiter.api.PingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cloudnative.grokking.jupiter.api.PingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JupiterGrpcServiceMethodDescriptorSupplier("ping"))
                  .build();
          }
        }
     }
     return getPingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JupiterGrpcServiceStub newStub(io.grpc.Channel channel) {
    return new JupiterGrpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JupiterGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JupiterGrpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JupiterGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JupiterGrpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class JupiterGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void ping(com.cloudnative.grokking.jupiter.api.PingRequest request,
        io.grpc.stub.StreamObserver<com.cloudnative.grokking.jupiter.api.PingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cloudnative.grokking.jupiter.api.PingRequest,
                com.cloudnative.grokking.jupiter.api.PingResponse>(
                  this, METHODID_PING)))
          .build();
    }
  }

  /**
   */
  public static final class JupiterGrpcServiceStub extends io.grpc.stub.AbstractStub<JupiterGrpcServiceStub> {
    private JupiterGrpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JupiterGrpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JupiterGrpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JupiterGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void ping(com.cloudnative.grokking.jupiter.api.PingRequest request,
        io.grpc.stub.StreamObserver<com.cloudnative.grokking.jupiter.api.PingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JupiterGrpcServiceBlockingStub extends io.grpc.stub.AbstractStub<JupiterGrpcServiceBlockingStub> {
    private JupiterGrpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JupiterGrpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JupiterGrpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JupiterGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.cloudnative.grokking.jupiter.api.PingResponse ping(com.cloudnative.grokking.jupiter.api.PingRequest request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JupiterGrpcServiceFutureStub extends io.grpc.stub.AbstractStub<JupiterGrpcServiceFutureStub> {
    private JupiterGrpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JupiterGrpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JupiterGrpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JupiterGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cloudnative.grokking.jupiter.api.PingResponse> ping(
        com.cloudnative.grokking.jupiter.api.PingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JupiterGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JupiterGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((com.cloudnative.grokking.jupiter.api.PingRequest) request,
              (io.grpc.stub.StreamObserver<com.cloudnative.grokking.jupiter.api.PingResponse>) responseObserver);
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

  private static abstract class JupiterGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JupiterGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cloudnative.grokking.jupiter.api.Jupiter.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JupiterGrpcService");
    }
  }

  private static final class JupiterGrpcServiceFileDescriptorSupplier
      extends JupiterGrpcServiceBaseDescriptorSupplier {
    JupiterGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class JupiterGrpcServiceMethodDescriptorSupplier
      extends JupiterGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JupiterGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (JupiterGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JupiterGrpcServiceFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
