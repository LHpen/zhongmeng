package com.zhongmeng.common;

public class Config {

    //域名地址
    private static final String httpUrl = "http:///127.0.0.1:8080/";
//    private static final String httpUrl = "http:///10.160.22.198:8080/";
    //图片域名地址
    private static final String imgHttpUrl = httpUrl + "pic/";
    //定义文件保存的本地路径
    private static final String localPath = "D:\\pic\\";

    public static String getHttpUrl() {
        return httpUrl;
    }

    public static String getImgHttpUrl() {
        return imgHttpUrl;
    }

    public static String getLocalPath() {
        return localPath;
    }
}
