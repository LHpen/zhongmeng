package com.zhongmeng.utils;

import java.util.List;

public class listToString {
    /**
     * list拼接成字符串工具
     * **/
    public static String listToString2(List list, char separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(separator);
        }
        return list.isEmpty() ? "" : sb.toString().substring(0, sb.toString().length() - 1);
    }
}
