package com.greenfoxacademy.restbackend.model;

public class Greeting {

  private String welcome_message;

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }

  public Greeting(String name, String title) {

    welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }
}
