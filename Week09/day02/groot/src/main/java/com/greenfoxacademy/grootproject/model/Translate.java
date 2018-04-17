package com.greenfoxacademy.grootproject.model;


import com.greenfoxacademy.grootproject.interfaces.GrootResponse;

public class Translate implements GrootResponse{
  private String received;
  private String translated;

  public Translate(){}

  public void setReceived(String received) {
    this.received = received;
  }

  public String getReceived() {
    return received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }

  public Translate(String message) {
    received = message;
    translated = "I am Groot!";
  }
}
