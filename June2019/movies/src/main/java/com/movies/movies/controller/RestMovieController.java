package com.movies.movies.controller;

import com.movies.movies.model.movie.Movie;
import com.movies.movies.model.movie.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class RestMovieController {
    private MovieService service;

    @Autowired
    public RestMovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping("/rest-movie")
    public List<Movie> movies() {
        return service.findMovies();
    }
}
