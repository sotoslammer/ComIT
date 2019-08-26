package com.movies.movies.controller;

import com.movies.movies.model.theaterroom.TheaterRoom;
import com.movies.movies.model.cinema.Cinema;
import com.movies.movies.model.cinema.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@Controller
public class CinemaController {
    private CinemaService cinemaService;

    @Autowired
    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @GetMapping("/cinema")
    public String cinemas(@RequestParam(required = false, name = "id") Long id, Model model) {
        Cinema cinema;
        if (id == null) {
            cinema = new Cinema();
        } else {
            cinema = cinemaService.findCinemaById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Could not find cinema " + id));
        }
        model.addAttribute("cinema", cinema);
        model.addAttribute("theaterRoom", new TheaterRoom());
        return "cinema";
    }

    @PostMapping("/cinema")
    public String saveCinema(@ModelAttribute Cinema cinema, Model model) {
        cinemaService.saveCinema(cinema);
        return "redirect:/cinemas";
    }

    @GetMapping("/cinemas")
    public String cinemas(Model model) {
        model.addAttribute("cinemas", cinemaService.getCinemas());
        return "cinemas";
    }

    @PostMapping("/{cinemaId}/theatre-room")
    public String addTheatreRoom(@ModelAttribute TheaterRoom theaterRoom,
                                 @PathVariable(name = "cinemaId") Long cinemaId,
                                 Model model) {
        cinemaService.addTheatreRoom(theaterRoom, cinemaId);
        return "redirect:/cinema?id=" + cinemaId;
    }
}
