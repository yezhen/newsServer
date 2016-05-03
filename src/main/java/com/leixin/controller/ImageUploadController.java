
package com.leixin.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.leixin.model.NewsImages;
import com.leixin.model.StudentForm;
import com.leixin.service.NewsImagesService;

@Controller
public class ImageUploadController {
    private static final String uploadFilePath = "d:\\images\\";

    @Autowired
    private NewsImagesService newsImagesService;

    @RequestMapping(value = "addAction", method = RequestMethod.POST)
    public String add_action(ModelMap model, StudentForm form) {
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            MultipartFile uploadFile = form.getStudentPhoto();
            String filename = uploadFile.getOriginalFilename();
            String name = uploadFile.hashCode() + "" + System.currentTimeMillis() + filename;
            is = uploadFile.getInputStream();
            // 如果服务器已经存在和上传文件同名的文件，则输出提示信息
            File tempFile = new File(uploadFilePath + 1);
            if (tempFile.exists()) {
                boolean delResult = tempFile.delete();
                System.out.println("删除已存在的文件：" + delResult);
            }
            // 开始保存文件到服务器
            if (!name.equals("")) {
                fos = new FileOutputStream(uploadFilePath + name);
                byte[] buffer = new byte[8192]; // 每次读8K字节
                int count = 0;
                // 开始读取上传文件的字节，并将其输出到服务端的上传文件输出流中
                while ((count = is.read(buffer)) > 0) {
                    fos.write(buffer, 0, count); // 向服务端文件写入字节流
                }
                fos.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close(); // 关闭FileOutputStream对象
                    fos = null;
                }
                if (is != null) {
                    is.close(); // InputStream对象
                    is = null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        NewsImages newsImages = new NewsImages();
        newsImagesService.insertNewsImages(newsImages);
        return "";
    }
}
