package movies.rooms;

public class Seat {
    private final int number;
    private final int row;

    public Seat(int number, int row) {
        this.number = number;
        this.row = row;
    }

    public int getNumber() {
        return number;
    }

    public int getRow() {
        return row;
    }
}
