package com.greenfox.connectionwithmysql.controllers;

import com.greenfox.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  @Autowired
  private TodoRepository todoRepository;

  @GetMapping(value = {"/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) boolean filterIfActive, Model model){
    if (!filterIfActive) {
      model.addAttribute("todos", todoRepository.findAllByDone(filterIfActive));
    } else {
      model.addAttribute("todos", todoRepository.findAll());
    }
    return "todolist";
  }
}
