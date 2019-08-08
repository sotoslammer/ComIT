package movies.rooms;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private final int id;
    private final List<Seat> seating;

    public Room(int id, int capacity, int rows) {
        int numSeatsPerRow = capacity / rows;
        List<Seat> seats = new ArrayList<>();
        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <= numSeatsPerRow; j++) {
                seats.add(new Seat(j, i));
            }
        }
        this.seating = seats;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<Seat> getSeating() {
        return seating;
    }
}
