package com.greenfoxacademy.grootproject.controller;

import com.greenfoxacademy.grootproject.interfaces.GrootResponse;
import com.greenfoxacademy.grootproject.interfaces.SpeedResponse;
import com.greenfoxacademy.grootproject.model.CustomError;
import com.greenfoxacademy.grootproject.model.SpeedModel;
import com.greenfoxacademy.grootproject.model.Translate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GuardianController {

  @GetMapping("/groot")
  public ResponseEntity<GrootResponse> translating(@RequestParam(required = false) String message) {
    if(message == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new CustomError("I am Groot!"));
    }
    return ResponseEntity.ok(new Translate(message));
  }

  @GetMapping("/yondu")
  public ResponseEntity<SpeedResponse> calculateSpeed(@RequestParam double distance, @RequestParam double time) {
    return ResponseEntity.ok(new SpeedModel(distance, time));
  }
}
