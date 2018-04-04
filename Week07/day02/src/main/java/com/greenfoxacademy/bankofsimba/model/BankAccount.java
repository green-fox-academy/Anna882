package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {

  private String name;
  private Integer balance;
  private String animalType;
  private boolean isGoodGuy;

  public String isGoodGuyAsText() {
    if (isGoodGuy) return "Good guy";
    else return "Bad boy";
  }

  public boolean isGoodGuy() {
    return isGoodGuy;
  }

  public boolean isKing() {
    return name == "Mufasa";
  }

  public BankAccount(String name, Integer balance, String animalType, boolean isGoodGuy){
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isGoodGuy = isGoodGuy;
  }

  public String getName() {
    return name;
  }

  public Integer getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

}
