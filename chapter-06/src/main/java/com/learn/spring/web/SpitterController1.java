package com.learn.spring.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import javax.validation.Valid;

import com.learn.spring.domain.Spitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/spitter")
public class SpitterController1 {
  @RequestMapping(value="/registerPage")
  public String showRegistrationForm(Model model) {
    model.addAttribute(new Spitter());
    return "registerForm";
  }
  @RequestMapping(value="/register", method=POST)
  public String processRegistration(
      @Valid Spitter spitter, 
      Errors errors) {
    if (errors.hasErrors()) {
      return "registerForm";
    }
    return "redirect:/spitter/" + spitter.getUsername();
  }

}
