package com.sda.cinema.controllers;

import com.sda.cinema.model.Uzytkownik;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;


@Controller
public class KontoUzytkownika {

    @RequestMapping("/konto")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        Uzytkownik uzytkownik = Uzytkownik.builder().imie("janusz").nazwisko("psikuta").dataUtworzenia(LocalDate.now().toString()).email("aaa").haslo("123").login("psikutan").iloscPunktow("1").build();
        modelAndView.addObject("uzytkownik", uzytkownik);
        modelAndView.setViewName("konto_uzytkownika");
        return modelAndView;
    }
}


