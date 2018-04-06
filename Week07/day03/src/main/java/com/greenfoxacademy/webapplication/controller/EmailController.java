package com.greenfoxacademy.webapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailController {

  @GetMapping(value = "/useful/email")
  public String email(@RequestParam("email") String emailAdress, Model model) {
    if (UtilityService.validateEmail(emailAdress)) {
      model.addAttribute("reply", emailAdress + "is a valid email address");
      model.addAttribute("color", "green");
    } else {
      model.addAttribute("reply", emailAdress + "is not a valid email address");
      model.addAttribute("color", "red");
    }
    return "email";
  }
}
