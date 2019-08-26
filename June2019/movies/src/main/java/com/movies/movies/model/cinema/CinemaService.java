package com.movies.movies.model.cinema;

import com.movies.movies.model.theaterroom.TheaterRoom;
import com.movies.movies.model.theaterroom.TheaterRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.*;

@Service
public class CinemaService {
    private CinemaRepository cinemaRepository;
    private TheaterRoomRepository theaterRoomRepository;

    @Autowired
    public CinemaService(CinemaRepository cinemaRepository, TheaterRoomRepository theaterRoomRepository) {
        this.cinemaRepository = cinemaRepository;
        this.theaterRoomRepository = theaterRoomRepository;
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

    public Cinema addTheatreRoom(TheaterRoom theaterRoom, Long cinemaId) {
        Optional<Cinema> found = cinemaRepository.findById(cinemaId);
        if (found.isPresent()) {
            Cinema cinema = found.get();
            theaterRoom.setCinema(cinema);

            TheaterRoom saved = theaterRoomRepository.save(theaterRoom);
            cinema.addTheaterRoom(saved);
            return cinema;
        } else {
            throw new EntityNotFoundException("Cinema with id " + cinemaId + " could not be found");
        }
    }
}
