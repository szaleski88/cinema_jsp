package com.sda.cinema.project.login.controller;

import com.sda.cinema.project.login.dto.UserDto;
import com.sda.cinema.project.login.service.LoginService;
import com.sda.cinema.model.ErrorMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    public String login(@ModelAttribute(name = "login") String login,
                        @ModelAttribute(name = "password") String password,
                        HttpServletRequest request) {
        if (!login.matches("[A-Za-z_0-9]{6,}") || !password.matches("[A-Za-z_0-9.!]{6,}")) {
            return "redirect:/login?message=VALIDATION_ERROR";
        }
        UserDto userDto = service.login(login, password);
        if (userDto == null) {
            return "redirect:/login?message=VALIDATION_ERROR";
        }else {
        createSession(userDto, request);
        return "redirect:/";
        }

    }

    private void createSession(UserDto userDto, HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.setAttribute("USER", userDto);
        return;

    }
}
