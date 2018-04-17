package com.greenfoxacademy.restbackend.service;

import com.greenfoxacademy.restbackend.model.CustomError;
import com.greenfoxacademy.restbackend.model.ResultNumber;
import org.springframework.stereotype.Service;

@Service
public class DoUntilService {

  public Object doUntil(String what, Integer number) {
      if (what.equals("sum") && checkIfPositiveNumber(number)) {
        return sum(number);
      } else if (what.equals("factor") && checkIfPositiveNumber(number)) {
        return factor(number);
      }
      return new CustomError("Please provide an operation and a number");
  }

  public ResultNumber sum(Integer number) {
    if (number == 1) {
      return new ResultNumber(number);
    } else {
      return new ResultNumber(number + (sum(number - 1)).getResult());
    }
  }

  public ResultNumber factor(Integer number) {
    if (number == 1) {
      return new ResultNumber(1);
    }
    return new ResultNumber(number * factor(number - 1).getResult());
  }

  public boolean checkIfPositiveNumber(Integer number) {
    return number > 0;
  }

}
