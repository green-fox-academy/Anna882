package com.greenfoxacademy.foxclub.model;

import org.springframework.stereotype.Component;

@Component
public class FoxFactory {

  public Fox createFox(String name, String food, String drink) {
    Fox fox = new Fox(name, food, drink);
    return fox;
  }
}
