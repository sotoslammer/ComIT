package com.movies.movies.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CinemaService {
    private List<Cinema> cinemas;

    public CinemaService() {
        this.cinemas = new ArrayList();
    }

    public void addCinema(Cinema cinema) {
        cinemas.add(cinema);
    }

    public Cinema findCinemaById(long id) {
        return cinemas.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }
}
