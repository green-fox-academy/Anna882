package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowAllAccount {

  @GetMapping(value = "/showintable")
  public String showAllAccount(Model model) {
    List<BankAccount> bankAccountList = new ArrayList<>();
    bankAccountList.add(new BankAccount("Zordon", 3000, "lion", false));
    bankAccountList.add(new BankAccount("Mufasa", 5000, "lion", true));
    bankAccountList.add(new BankAccount("Rafiki", 1500, "monkey", true));
    bankAccountList.add(new BankAccount("Zazu", 500, "sparrow", true));
    bankAccountList.add(new BankAccount("Nala", 2000, "lion", true));
    model.addAttribute("bankaccountlist", bankAccountList);
    return "showallaccountintable";
  }
}
