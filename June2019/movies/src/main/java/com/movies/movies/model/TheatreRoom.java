package com.movies.movies.model;

import javax.persistence.*;

@Entity
public class TheatreRoom {
    @Id
    private Long id;
    private int capacity;
    private int seatingRows;
    // seating

    public TheatreRoom (){};

    public TheatreRoom(Long id, int capacity, int seatingRows) {
        this.id = id;
        this.capacity = capacity;
        this.seatingRows = seatingRows;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSeatingRows() {
        return seatingRows;
    }

    public void setSeatingRows(int seatingRows) {
        this.seatingRows = seatingRows;
    }
}
