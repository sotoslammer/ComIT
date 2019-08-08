package movies;

import movies.movie.Movie;
import movies.rooms.Room;
import movies.rooms.Seat;
import movies.showtimes.Showtime;
import movies.users.Person;
import movies.users.Reservation;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Theater {
    private Set<Movie> movies;
    private Set<Room> rooms;
    private List<Showtime> showtimes;
    private List<Reservation> reservations;

    private final static int GENERAL_ADMISSION = 1000;

    public Theater(Set<Movie> movies, int numRooms, List<Showtime> showtimes,
                   List<Reservation> reservations) {
        this.movies = movies;
        this.showtimes = showtimes;
        this.reservations = reservations;
        Set<Room> rooms = new HashSet<>();
        for (int i = 1; i <= numRooms; i++) {
            rooms.add(new Room(i, 200, 20));
        }
        this.rooms = rooms;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public List<Showtime> getShowtimes() {
        return showtimes;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        this.movies.remove(movie);
    }

    public void addShowtime(Movie movie, Room room, LocalTime startTime) {
        this.showtimes.add(new Showtime(movie, room, startTime));
    }

    public void removeShowtime(Showtime showtime) {
        this.showtimes.remove(showtime);
    }

    public Reservation makeReservation(Person person, Movie movie, LocalTime startTime, Seat seat) {
        return this.showtimes.stream()
                             .filter(showtime -> showtime.getMovie().equals(movie))
                             .filter(showtime -> showtime.getStartTime().equals(startTime))
                             .findFirst()
                             .map(selectedShowtime -> new Reservation(selectedShowtime, seat, person, GENERAL_ADMISSION))
                             .orElseThrow(() -> new IllegalArgumentException("no showtime selected"));
    }
}
