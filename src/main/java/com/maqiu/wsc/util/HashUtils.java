package com.maqiu.wsc.util;

import com.alibaba.fastjson.JSON;
import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;


public class HashUtils {

    public static String hash(Object request) {

        // 计算哈希值
        return Hashing.murmur3_32().hashString(JSON.toJSONString(request), StandardCharsets.UTF_8).toString();
    }

}
