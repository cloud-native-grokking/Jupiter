package com.cloudnative.grokking.jupiter.service.impl;

import com.cloudnative.grokking.jupiter.dto.MarsLog;
import com.cloudnative.grokking.jupiter.repository.MarsLogRepository;
import com.cloudnative.grokking.jupiter.service.MarsLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarsLogServiceImpl implements MarsLogService {

    private final MarsLogRepository repository;

    @Autowired
    public MarsLogServiceImpl(MarsLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public void processMarLog(String log) {
        MarsLog marsLog = new MarsLog();
        marsLog.setLog(log);
        repository.insert(marsLog);
    }
}
