package com.sda.cinema.project.reservation.controller;

import com.sda.cinema.project.reservation.dto.MovieDto;
import com.sda.cinema.project.reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping(path = "/repertoire")
    public ModelAndView repertoirePage(@RequestParam(name = "date", required = false) String date,
                                       HttpServletRequest request,
                                       HttpServletResponse response) {
        HttpSession session = request.getSession();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("repertoire");

        if (date != null) {
            modelAndView.addObject("datePicked", date);
            List<MovieDto> moviesDtosForDate = reservationService.getMoviesDtosForDate(date.replace("/", "-"));
            modelAndView.addObject("listOfMovies", moviesDtosForDate);
        }
        return modelAndView;
    }


}
