package com.cloudnative.grokking.jupiter.service;

import com.cloudnative.grokking.jupiter.dto.MarsLog;
import org.springframework.stereotype.Service;

public interface MarsLogService {
    void processMarLog(String log);
}
