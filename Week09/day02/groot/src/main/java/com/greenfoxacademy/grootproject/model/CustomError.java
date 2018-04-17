package com.greenfoxacademy.grootproject.model;

import com.greenfoxacademy.grootproject.interfaces.GrootResponse;

public class CustomError implements GrootResponse {
  private String error;

  public String getError() {
    return error;
  }

  public CustomError(String error) {
    this.error = error;
  }
}
