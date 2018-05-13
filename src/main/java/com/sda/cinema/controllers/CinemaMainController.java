package com.sda.cinema.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class CinemaMainController {

    @GetMapping(path = "/")
    public ModelAndView homePage(HttpServletRequest request){
        HttpSession session = request.getSession();
        ModelAndView modelAndView = new ModelAndView();
        if (session.getAttribute("userLogin")!= null){
            modelAndView.addObject("USER", session.getAttribute("user"));
        }

        modelAndView.setViewName("index");
        return modelAndView;
    }

}
