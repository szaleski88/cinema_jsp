package com.sda.cinema.controllers;

import com.sda.cinema.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;


@Controller
public class UsersAccount {

    @RequestMapping("/account")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        User user = User.builder().firstName("janusz").lastName("psikuta").registerDate(LocalDate.now().toString()).email("aaa").password("123").login("psikutan").amountOfPoints("1").build();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("usersAccount");
        return modelAndView;
    }
}


