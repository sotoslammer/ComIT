package movies.showtimes;

import movies.movie.Movie;
import movies.rooms.Room;

import java.time.LocalTime;

public class Showtime {
    private Movie movie;
    private Room theater;
    private LocalTime startTime;

    public Showtime(Movie movie, Room theater, LocalTime startTime) {
        this.movie = movie;
        this.theater = theater;
        this.startTime = startTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public Room getTheater() {
        return theater;
    }

    public LocalTime getStartTime() {
        return startTime;
    }
}
