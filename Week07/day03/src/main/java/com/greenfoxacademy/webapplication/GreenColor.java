package com.greenfoxacademy.webapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreenColor implements MyColor {

  @Override
  public String printColor() {
    return "This is green in color...";
  }
}
