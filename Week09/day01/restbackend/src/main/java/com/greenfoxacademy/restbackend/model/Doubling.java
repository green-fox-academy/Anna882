package com.greenfoxacademy.restbackend.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Doubling {

  private Integer recieved;
  private Integer result;

  public void setRecieved(Integer recieved) {
    this.recieved = recieved;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public Doubling(Integer recieved) {
    this.recieved = recieved;
    result = recieved * 2;
  }

  public int getRecieved() {

    return recieved;
  }

  public void setRecieved(int recieved) {
    this.recieved = recieved;
  }

  public Doubling(Integer recieved, Integer result) {
    this.recieved = recieved;
    this.result = result;
  }

  public int getResult() {
    return result;

  }

  public void setResult(int result) {
    this.result = result;
  }
}
