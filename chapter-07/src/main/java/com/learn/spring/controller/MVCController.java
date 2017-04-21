package com.learn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Subtimental on 2017/4/21.
 */
@Controller
@RequestMapping("/mvc")
public class MVCController {

    @RequestMapping("/home")
    public String home(){
        return "home";
    }


    @RequestMapping("/uploadPage")
    public String uploadPage(){
        return "uploadPage";
    }

    @RequestMapping("/upload")
    public String upload(@RequestPart("file")MultipartFile file){
        System.out.println(file.getOriginalFilename()+"----"+file.getSize());
        return "success";
    }
}
