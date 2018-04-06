package com.greenfoxacademy.springstart.controllers;

public class RandomGreeting {

  private String[] rGB = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
  private String color = "#";

  public String  createRandomColor() {
    for (int i = 0; i < 6; i++) {
      color += rGB[(int)Math.random() * 16];
    }
    return color;
  }
}
