package com.movies.movies.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CinemaService {
    private CinemaRepository cinemaRepository;

    @Autowired
    public CinemaService(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    public void saveCinema(Cinema cinema) {
        cinemaRepository.save(cinema);
    }

    public Optional<Cinema> findCinemaById(long id) {
        return cinemaRepository.findById(id);
    }

    public List<Cinema> getCinemas() {
        Iterable<Cinema> found = cinemaRepository.findAll();
        List<Cinema> cinemas = new ArrayList<>();
        for (Cinema cinema : found) {
            cinemas.add(cinema);
        }
        return cinemas;
    }
}
