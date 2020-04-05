package com.cloudnative.grokking.jupiter.controller;

import com.cloudnative.grokking.jupiter.api.JupiterGrpcServiceGrpc;
import com.cloudnative.grokking.jupiter.api.PingRequest;
import com.cloudnative.grokking.jupiter.api.PingResponse;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

/**
 * @author huyvha
 */
@GRpcService
public class JupiterGrpcController extends JupiterGrpcServiceGrpc.JupiterGrpcServiceImplBase {

    @Override
    public void ping(PingRequest request, StreamObserver<PingResponse> responseObserver) {
        String requestContent = request.getRequest();
        responseObserver.onNext(PingResponse.newBuilder()
                .setResponse(requestContent)
                .build());
        responseObserver.onCompleted();
    }
}
