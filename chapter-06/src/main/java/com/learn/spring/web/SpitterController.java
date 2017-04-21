package com.learn.spring.web;

import com.learn.spring.domain.Spitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Subtimental on 2017/4/20.
 */
@Controller
public class SpitterController {

    @RequestMapping(value = "/register")
    public String showRegistrationForm(Model model){
        model.addAttribute("spitter",new Spitter());
        return "home";
    }

    @RequestMapping(value = "/validate",method = RequestMethod.POST)
    public String validate(@Valid Spitter spitter, BindingResult bindingResult){
        System.out.println("========"+bindingResult.getAllErrors());
        return "registerForm";
    }

}
