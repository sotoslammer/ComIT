package movies.users;

import movies.rooms.Seat;
import movies.showtimes.Showtime;

public class Reservation {
    private Showtime showtime;
    private Seat seat;
    private Person person;
    private int price;

    public Reservation(Showtime showtime, Seat seat, Person person, int price) {
        this.showtime = showtime;
        this.seat = seat;
        this.person = person;
        this.price = price;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public Seat getSeat() {
        return seat;
    }

    public Person getPerson() {
        return person;
    }
}
