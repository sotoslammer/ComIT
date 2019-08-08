package com.movies.movies.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class CinemaService {
    private List<Cinema> cinemas;

    public CinemaService() {
        this.cinemas = new ArrayList();
    }

    public void addCinema(Cinema cinema) {
        cinemas.add(cinema);
    }
}
