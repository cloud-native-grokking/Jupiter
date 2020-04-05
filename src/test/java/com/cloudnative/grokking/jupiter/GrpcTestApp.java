package com.cloudnative.grokking.jupiter;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(
        exclude = {
                RedisAutoConfiguration.class,
                KafkaAutoConfiguration.class,
                JmsAutoConfiguration.class,
                HibernateJpaAutoConfiguration.class,
                DataSourceAutoConfiguration.class,
                MongoAutoConfiguration.class,
                MongoDataAutoConfiguration.class,
                MongoRepositoriesAutoConfiguration.class
        }
)
@ComponentScan(
        basePackages = "com.cloudnative.grokking.jupiter.controller",
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = GRpcService.class),
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = RestController.class)
)
public class GrpcTestApp {

    public static void main(String[] args) {
        SpringApplication.run(GrpcTestApp.class, args);
    }
}