package com.learn.spring.web;

import com.learn.spring.domain.Spitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by Subtimental on 2017/4/21.
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {


    @RequestMapping(value = "/")
    public String index(){
        return "home";
    }

    @RequestMapping(value = "/registerPage")
    public String registerPage(Model model){
        model.addAttribute(new Spitter());
        return "register";
    }

    @RequestMapping("/register")
    public String register(@Valid Spitter spitter, BindingResult result){
        System.out.println(result.getAllErrors());
        if (result.hasErrors()){
            return "register";
        }
        return "success";
    }
}
