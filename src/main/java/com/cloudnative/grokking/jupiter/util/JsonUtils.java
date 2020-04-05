package com.cloudnative.grokking.jupiter.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author huyvha
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public class JsonUtils {
    private static final Gson GSON = new GsonBuilder().disableHtmlEscaping().create();

    public static String printGson(Object object) {
        return GSON.toJson(object);
    }

    public static <T> T parseGson(String json, Class<T> clazz) {
        return GSON.fromJson(json, clazz);
    }

}