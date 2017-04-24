package com.learn.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

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
    public String upload(@RequestPart("file")MultipartFile file) throws IOException {
        System.out.println(file.getOriginalFilename()+"----"+file.getSize());
        file.transferTo(new File(file.getOriginalFilename()));
        return "success";
    }

    @RequestMapping("/uploadByPart")
    public String uploadByPart(@RequestPart("file")Part file) throws IOException {
        System.out.println(file.getHeaderNames()+"--->"+file.getContentType()+">"+file.getSubmittedFileName()+"..."+file.getSize());

        file.write(file.getSubmittedFileName());
        return "success";
    }
}
