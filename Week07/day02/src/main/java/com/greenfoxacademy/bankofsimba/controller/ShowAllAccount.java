package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import com.greenfoxacademy.bankofsimba.model.BankAccountList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowAllAccount {

  private BankAccountList bankAccountList = new BankAccountList();

  @GetMapping(value = "/showintable")
  public String showAllAccount(Model model) {
    bankAccountList.fillBankAccountList();
    model.addAttribute("bankaccountlist", bankAccountList.getBankAccountList());
    return "showallaccountintable";
  }

  @PostMapping(value = "/showintable")
  public String raiseBalacne(@ModelAttribute("index") String index, Model model) {
    bankAccountList.getBankAccountList().set((Integer.parseInt(index)),
    bankAccountList.getBankAccountList().get(Integer.parseInt(index)).raiseBalance());
    model.addAttribute("bankaccountlist", bankAccountList.getBankAccountList());
    return "showallaccountintable";
  }
}
