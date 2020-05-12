package com.huzhe.util;

import java.util.HashMap;
import java.util.Map;

public class DataUtil {

    public static Map<String, Object> sendResponse(int code, String message, Object data) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", code);
        map.put("message", code == 200 ? "执行成功" : message);
        map.put("success", code == 200);
        map.put("data", data);
        return map;
    }
}
