package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.hibernate.validator.constraints.Mod10Check;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.text.TabableView;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowAllAccount {

  @GetMapping(value = "/showintable")
  public String showAllAccount(Model model) {
    List<BankAccount> bankAccountList = new ArrayList<>();
    BankAccount mufasa = new BankAccount("Mufasa", 5000, "lion");
    BankAccount rafiki = new BankAccount("Rafiki", 1500, "monkey");
    BankAccount zazu = new BankAccount("Zazu", 500, "sparrow");
    BankAccount nala = new BankAccount("Nala", 2000, "lion");
    bankAccountList.add(mufasa);
    bankAccountList.add(rafiki);
    bankAccountList.add(zazu);
    bankAccountList.add(nala);
    model.addAttribute("bankaccountlist", bankAccountList);
    return "showallaccountintable";
  }
}
