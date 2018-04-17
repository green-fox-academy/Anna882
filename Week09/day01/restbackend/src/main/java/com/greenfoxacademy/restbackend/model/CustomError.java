package com.greenfoxacademy.restbackend.model;

public class CustomError {

  public void setError(String customError) {
    this.customError = customError;
  }

  public String getError() {
    return customError;
  }

  public CustomError(String title) {

    this.customError = title;
  }

  private String customError;

}
