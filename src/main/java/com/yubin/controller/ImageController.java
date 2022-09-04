package com.yubin.controller;

import com.yubin.common.ImageUtils.UploadUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/upload")
public class ImageController {


    @PostMapping("/image")
    @ResponseBody
    public String uploadImage(@RequestParam(value = "file") MultipartFile multipartFile){
        if (multipartFile.isEmpty()){
            return "文件有误！";
        }
        return UploadUtils.uploadImage(multipartFile);
    }
}
