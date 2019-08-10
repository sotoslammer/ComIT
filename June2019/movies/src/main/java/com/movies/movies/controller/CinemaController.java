package com.movies.movies.controller;

import com.movies.movies.model.Cinema;
import com.movies.movies.model.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CinemaController {
    private CinemaService cinemaService;

    @Autowired
    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @GetMapping("/cinema")
    public String cinemas(@RequestParam(required = false, name= "id") Long id, Model model) {
        Cinema cinema;
        if (id == null) {
            cinema = new Cinema();
        } else {
            cinema = cinemaService.findCinemaById(id);
        }
        model.addAttribute("cinema", cinema);
        return "cinema";
    }

    @PostMapping("/cinema")
    public String addCinema(@ModelAttribute Cinema cinema, Model model) {
        cinemaService.addCinema(cinema);
        model.addAttribute("cinemas", cinemaService.getCinemas());
        return "cinemas";
    }

    @GetMapping("/cinemas")
    public String cinemas(Model model) {
        model.addAttribute("cinemas", cinemaService.getCinemas());
        return "cinemas";
    }
}
