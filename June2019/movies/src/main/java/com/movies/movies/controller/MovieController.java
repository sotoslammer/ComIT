package com.movies.movies.controller;

import com.movies.movies.model.movie.Movie;
import com.movies.movies.model.movie.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityNotFoundException;

@Controller
public class MovieController {
    private String MOVIE_VIEW = "movie";
    private String MOVIES_VIEW = "movies";
    private MovieService service;

    @Autowired
    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute("movies", service.findMovies());
        return MOVIES_VIEW;
    }

    @GetMapping("/movie")
    public String movie(@RequestParam(required = false, name= "id") Long id, Model model) {
        Movie movie;
        if (id == null) {
            movie = new Movie();
        } else {
            movie = service.findMovieById(id).orElseThrow(() -> new EntityNotFoundException("Could not find movie " + id));
        }
        model.addAttribute("movie", movie);

        return MOVIE_VIEW;
    }

    @PostMapping("/movie")
    public String saveMovie(@ModelAttribute Movie movie, Model model) {
        service.saveMovie(movie);
        model.addAttribute("movies", service.findMovies());
        return MOVIES_VIEW;
    }
}
