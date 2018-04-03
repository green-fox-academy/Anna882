package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  private static AtomicLong countApiCalls = new AtomicLong();
  private long id;
  private String content;

  public Greeting(String content){
    this.id = countApiCalls.incrementAndGet();
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  @Override
  public String toString() {
    return "id: " + id + ", content: " + content;
  }
}
