package com.greenfoxacademy.restbackend.model;

public class Appendable {

  private String appended;

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }

  public Appendable(String appendable) {
    appended = appendable + "a";
  }
}
