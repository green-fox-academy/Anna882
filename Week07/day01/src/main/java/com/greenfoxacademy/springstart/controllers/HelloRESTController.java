package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping(value = "/greeting")
  public String greetingUser(@RequestParam("name") String userName) {
    Greeting greeting = new Greeting(1, "Hello, " + userName);
    return greeting.toString();
  }
}
