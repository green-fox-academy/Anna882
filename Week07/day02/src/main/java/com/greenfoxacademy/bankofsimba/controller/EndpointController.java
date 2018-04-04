package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EndpointController {

  @GetMapping(value = "/show")
  public String showBankAccountFields(Model model) {
    BankAccount simba = new BankAccount("Simba", 2000, "lion", true);
    model.addAttribute("simba", simba);
    return "ShowBankAccount";
  }

  @GetMapping(value = "/textexample")
  public String showTextExample(Model model) {
    model.addAttribute("text", "\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"");
    return "textexample";
  }
}
