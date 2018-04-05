package com.greenfoxacademy.webapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsefulController {

  @GetMapping(value = "/useful")
  public String useful() {
    return "useful";
  }

}
