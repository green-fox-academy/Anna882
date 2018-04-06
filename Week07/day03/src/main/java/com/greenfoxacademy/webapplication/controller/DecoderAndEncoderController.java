package com.greenfoxacademy.webapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DecoderAndEncoderController {

  @Autowired
  public DecoderAndEncoderController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  UtilityService utilityService;

  @GetMapping(value = "/useful/encoder")
  public String coder(@RequestParam("text") String text, @RequestParam("number") String number, Model model) {
    utilityService.caesar(text, Integer.parseInt(number));
    return "coded";
  }
}
