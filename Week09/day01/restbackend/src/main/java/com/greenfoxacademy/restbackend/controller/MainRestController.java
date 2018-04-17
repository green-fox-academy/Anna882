package com.greenfoxacademy.restbackend.controller;

import com.greenfoxacademy.restbackend.model.*;
import com.greenfoxacademy.restbackend.model.Appendable;
import com.greenfoxacademy.restbackend.service.DoUntilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainRestController {

  @Autowired
  DoUntilService doUntilService;

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(name = "input", required = false) String recieved) {
    if (recieved == null) {
      return new CustomError("Please provide an input!");
    }
    return new Doubling(Integer.valueOf(recieved));
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
    if(name != null && title != null) {
      return new Greeting(name, title);
    } else if (name == null) {
      return new CustomError("Please provide a name!");
    }
    return new CustomError("Please provide a title!");
  }

  @GetMapping("/appenda/{appendable}")
  public Object appending(@PathVariable String appendable) {
    return new Appendable(appendable);
  }

  @PostMapping("/dountil/{what}")
  public Object countUntil(@PathVariable String what, @RequestBody(required = false) Until until) {
    if(what != null && until != null) {
      return doUntilService.doUntil(what, until.getUntil());
    }
    return new CustomError("Please provide an operation and a number!");
  }
}
