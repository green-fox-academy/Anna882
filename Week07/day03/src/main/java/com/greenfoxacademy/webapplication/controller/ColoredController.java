package com.greenfoxacademy.webapplication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ColoredController {

  @Autowired
  UtilityService utilityService;

  @GetMapping(value = "/useful/colored")
  public String coloredBackground(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }
}
