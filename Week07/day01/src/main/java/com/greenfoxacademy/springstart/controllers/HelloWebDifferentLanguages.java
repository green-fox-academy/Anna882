package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.*;

@Controller
public class HelloWebDifferentLanguages {

  private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, " +
          "Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste",
          "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit", "Salve", "Ciao",
          "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte",
          "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae",
          "Sholem Aleychem", "Sawubona"};

  private String[] rGB = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
  private String color = "#";

  public String  createRandomColor() {
    for (int i = 0; i < 6; i++) {
      color += rGB[(int)Math.random() * 16];
    }
    return color;
  }

//  public int createRanmdomSize() {
//    return (int) Math.random() * 30 + 8;
//  }


  @RequestMapping("/web/hellotoall")
  public String greeting(Model model) {
    model.addAttribute("color", createRandomColor());
    model.addAttribute("greeting", hellos);
    return "hellodifferentlanguages";
  }
}
