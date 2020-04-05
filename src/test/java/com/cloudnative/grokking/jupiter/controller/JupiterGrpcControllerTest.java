package com.cloudnative.grokking.jupiter.controller;

import com.cloudnative.grokking.jupiter.GrpcTestApp;
import com.cloudnative.grokking.jupiter.api.JupiterGrpcServiceGrpc;
import com.cloudnative.grokking.jupiter.api.PingRequest;
import com.cloudnative.grokking.jupiter.api.PingResponse;
import com.cloudnative.grokking.jupiter.test.base.GrpcServerTestBase;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {GrpcTestApp.class}, webEnvironment = SpringBootTest.WebEnvironment.NONE, properties = {
        "grpc.enabled=false",
        "grpc.inProcessServerName='grpcTestServer'"
})
public class JupiterGrpcControllerTest extends GrpcServerTestBase {

    @Test
    public void test() {
        // GIVEN
        JupiterGrpcServiceGrpc.JupiterGrpcServiceBlockingStub stub = JupiterGrpcServiceGrpc.newBlockingStub(Optional.ofNullable(channel).orElse(inProcChannel));

        String pingContent = "ping";
        // WHEN
        PingResponse response = stub.ping(PingRequest.newBuilder().setRequest(pingContent).build());

        // THEN
        MatcherAssert.assertThat(response.getResponse(), Is.is(pingContent));
    }

}