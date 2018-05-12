package com.sda.cinema.login.controller;

import com.sda.cinema.login.service.LoginService;
import com.sda.cinema.registration.dto.ErrorMessages;
import com.sda.cinema.registration.dto.UserDto;
import com.sda.cinema.registration.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    private LoginService service;

    @GetMapping(path = "/login")
    public ModelAndView loginPage(@RequestParam(name = "message", required = false) String message) {
        ModelAndView modelAndView = new ModelAndView();
        if (message != null) {
            modelAndView.addObject("errorMessage", ErrorMessages.valueOf(message));
        }
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @PostMapping(path = "/login")
    public String login(@ModelAttribute(name = "login") String login, @ModelAttribute(name = "password") String password) {
        if (!login.matches("[A-Za-z_0-9]{6,}") || !password.matches("[A-Za-z_0-9.!]{6,}")) {
            return "redirect:/login?message=VALIDATION_ERROR";
        }
        return service.login(login, password) == null ? "redirect://login?message=VALIDATION_ERROR" : "redirect:/";
    }
}
