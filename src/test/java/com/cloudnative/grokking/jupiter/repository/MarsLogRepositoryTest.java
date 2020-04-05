package com.cloudnative.grokking.jupiter.repository;

import com.cloudnative.grokking.jupiter.GrpcTestApp;
import com.cloudnative.grokking.jupiter.MongoTestApp;
import com.cloudnative.grokking.jupiter.dto.MarsLog;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MongoTestApp.class}, webEnvironment = SpringBootTest.WebEnvironment.NONE, properties = {
        "grpc.enabled=false",
        "grpc.inProcessServerName='grpcTestServer'"
})
public class MarsLogRepositoryTest {
    @Autowired
    private MarsLogRepository repository;

    @Test
    public void testSave(){
        MarsLog log = new MarsLog();
        log.setLog("ABC");
        repository.save(log);
        Assert.assertNotNull(log.get_id());

        Optional<MarsLog> log1 = repository.findById(log.get_id().toHexString());
        Assert.assertTrue(log1.isPresent());
        Assert.assertEquals(log,log1.get());
    }
}
