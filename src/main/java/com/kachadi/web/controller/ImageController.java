package com.kachadi.web.controller;

import com.google.gson.Gson;
import com.kachadi.web.dto.ImageInfoDto;
import com.kachadi.web.image.ReadImageInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Controller
public class ImageController {

    @Inject
    private ReadImageInfoService readImageInfoService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {

        return "index";
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
