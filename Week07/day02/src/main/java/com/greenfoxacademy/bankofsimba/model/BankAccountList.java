package com.greenfoxacademy.bankofsimba.model;

import java.util.ArrayList;
import java.util.List;

public class BankAccountList {
  public void setBankAccountList(List<BankAccount> bankAccountList) {
    this.bankAccountList = bankAccountList;
  }

  private List<BankAccount> bankAccountList = new ArrayList<>();

  public List<BankAccount> getBankAccountList() {
    return bankAccountList;
  }

  public void fillBankAccountList() {
    bankAccountList.add(new BankAccount("Zordon", 3000, "lion", false));
    bankAccountList.add(new BankAccount("Mufasa", 5000, "lion", true));
    bankAccountList.add(new BankAccount("Rafiki", 1500, "monkey", true));
    bankAccountList.add(new BankAccount("Zazu", 500, "sparrow", true));
    bankAccountList.add(new BankAccount("Nala", 2000, "lion", true));
  }
}

