package com.movies.movies.model.cinema;

import com.movies.movies.model.TheatreRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.*;

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

    public Cinema addTheatreRoom(TheatreRoom theatreRoom, Long cinemaId) {
        Optional<Cinema> found = cinemaRepository.findById(cinemaId);
        if (found.isPresent()) {
            Cinema cinema = found.get();
            Set<TheatreRoom> updatedRooms = new HashSet<>(cinema.getTheatreRooms());
            updatedRooms.add(theatreRoom);
            cinema.setTheatreRooms(updatedRooms);

            cinemaRepository.save(cinema);

            return cinema;
        } else {
            throw new EntityNotFoundException("Cinema with id " + cinemaId + " could not be found");
        }
    }
}
