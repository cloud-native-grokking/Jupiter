package com.cloudnative.grokking.jupiter.service.kafka;

import com.cloudnative.grokking.jupiter.dto.MarsLog;
import com.cloudnative.grokking.jupiter.repository.MarsLogRepository;
import com.cloudnative.grokking.jupiter.service.MarsLogService;
import com.cloudnative.grokking.jupiter.util.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
//
@Service
public class MarsKafkaConsumer {

    @Autowired
    private MarsLogService service;

    @KafkaListener(topics = "${spring.kafka.consumer.mars.topic}", groupId = "${spring.kafka.consumer.mars.groupid}")
    public void consume(String messageJson) {
        log.info("Consumed message -> {}", messageJson);
        service.processMarLog(messageJson);
    }
}