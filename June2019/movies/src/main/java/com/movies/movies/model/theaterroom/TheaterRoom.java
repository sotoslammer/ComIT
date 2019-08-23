package com.movies.movies.model.theaterroom;

import com.movies.movies.model.cinema.Cinema;

import javax.persistence.*;

@Entity
public class TheaterRoom {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name="`number`")
    private int number;
    private int capacity;
    @Column(name="`rows`")
    private int rows;
    // seating
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cinema_id", nullable = false)
    private Cinema cinema;

    public TheaterRoom(){};

    public TheaterRoom(Long id, int capacity, int rows) {
        this.id = id;
        this.capacity = capacity;
        this.rows = rows;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }
}
