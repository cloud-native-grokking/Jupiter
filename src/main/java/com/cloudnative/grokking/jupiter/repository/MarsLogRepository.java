package com.cloudnative.grokking.jupiter.repository;

import com.cloudnative.grokking.jupiter.dto.MarsLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarsLogRepository extends MongoRepository<MarsLog, String> {
}
