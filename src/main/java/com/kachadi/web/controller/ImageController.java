package com.kachadi.web.controller;

import com.google.gson.Gson;
import com.kachadi.web.dto.ImageInfoDto;
import com.kachadi.web.image.ReadImageInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.inject.Inject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class ImageController {
    private static Logger logger = LoggerFactory.getLogger(ImageController.class);

    @Inject
    private ReadImageInfoService readImageInfoService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {

        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/upload/image", method = RequestMethod.POST)
    public String uploadImage(MultipartFile file) {
        try {
            InputStream inputStream = file.getInputStream();

            ImageInfoDto imageInfoDto = readImageInfoService.readImageInfo(inputStream);

            String jsonStr = new Gson().toJson(imageInfoDto);
            logger.info("读取图片：{}", jsonStr);

            return jsonStr;
        } catch (FileNotFoundException e) {
            e.printStackTrace();

            return "read fail";
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return "read fail";
        }

//        return  "success";
    }

    @ResponseBody
    @RequestMapping(value = "/image/info", method = RequestMethod.GET)
    public String imageInfo() {
        try {
            File jpegFile = new File("C:\\Users\\ROOT\\Desktop\\tianniu.jpg");
            FileInputStream inputStream = new FileInputStream(jpegFile);
            ImageInfoDto imageInfoDto = readImageInfoService.readImageInfo(inputStream);

            return new Gson().toJson(imageInfoDto);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

            return "read fail";
        }
    }
}
