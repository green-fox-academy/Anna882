package com.greenfoxacademy.grootproject.model;

import com.greenfoxacademy.grootproject.interfaces.SpeedResponse;

public class SpeedModel implements SpeedResponse {

  private double distance;
  private double time;
  private double speed;

  public double getDistance() {
    return distance;
  }

  public double getTime() {
    return time;
  }

  public double getSpeed() {

    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }

  public SpeedModel() {

  }

  public SpeedModel(double distance, double time) {
    this.distance = distance;
    this.time = time;
    speed = distance / time;
  }
}
