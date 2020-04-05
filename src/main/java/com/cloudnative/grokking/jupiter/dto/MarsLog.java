package com.cloudnative.grokking.jupiter.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@EqualsAndHashCode
public class MarsLog {
    @Id
    @Getter
    @Setter
    private ObjectId _id;

    @Getter
    @Setter
    private String log;

}
