package com.movies.movies.controller;

import com.movies.movies.model.Cinema;
import com.movies.movies.model.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CinemaController {
    private CinemaService cinemaService;

    @Autowired
    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @GetMapping("/cinema")
    public String cinemas(Model model) {
        model.addAttribute("cinema", new Cinema());
        return "cinema";
    }

    @PostMapping("/cinema")
    public String addCinema(@ModelAttribute Cinema cinema) {
        cinemaService.addCinema(cinema);
        return "cinemas";
    }
}
