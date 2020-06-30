package com.zhongmeng.utils;

import com.zhongmeng.common.Config;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class ImgUtil {


   public static String uploading(MultipartFile upload) throws IOException {
       //定义 文件名
       String filename = null;
       //生成uuid作为文件名称
       String uuid = UUID.randomUUID().toString().replaceAll("-", "");
       //获得文件类型（可以判断如果不是图片，禁止上传）
       String contentType = upload.getContentType();
       //获得文件后缀名
       String suffixName = contentType.substring(contentType.indexOf("/") + 1);
       //得到 文件名
       filename = uuid + "." + suffixName;
              //文件保存路径 Config3.localPath固定路径Config.getLocalPath()
       upload.transferTo(new File( Config.getLocalPath()+ filename));

       return filename;
   }
}
