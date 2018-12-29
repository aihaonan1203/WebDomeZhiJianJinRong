package com.personal.revenant.zhijianjinrong.utils;

import com.google.gson.Gson;

/**
 * Created by Administrator on 2018/8/21.
 */

public class GsonUtil {
    public static <T> T parseJsonWithGson(String jsonData, Class<T> type) {
        Gson gson = new Gson();
        T result = gson.fromJson(jsonData, type);
        return result;
    }
}
