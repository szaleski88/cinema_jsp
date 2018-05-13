package com.sda.cinema.registration.controller;

import com.sda.cinema.model.ErrorMessages;
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
public class RegistrationController {

    @Autowired
    private RegistrationService service;

    @GetMapping(path = "/register")
    public ModelAndView registerPage(@RequestParam(name = "message", required = false) String message){
        ModelAndView modelAndView = new ModelAndView();
        if(message != null){
            modelAndView.addObject("errorMessage", ErrorMessages.valueOf(message));
        }
        modelAndView.setViewName("register");
        return modelAndView;
    }

    @PostMapping(path = "/register")
    public String regiter(@ModelAttribute(name = "registerForm") UserDto userDto){
        if(!userDto.validateForm()){
            return "redirect:/register?message=VALIDATION_ERROR";
        }
        service.addUser(userDto);
        return "redirect:/";
    }


}
