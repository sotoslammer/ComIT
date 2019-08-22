package com.movies.movies.model.cinema;

import com.movies.movies.model.TheatreRoom;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Cinema {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String city;
    private String province;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn
    private Set<TheatreRoom> theatreRooms;

    public Cinema() {
        theatreRooms = new HashSet<>();
    }

    public Cinema(String name, String address, String city, String province) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.province = province;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Set<TheatreRoom> getTheatreRooms() {
        return theatreRooms;
    }

    public void setTheatreRooms(Set<TheatreRoom> theatreRooms) {
        this.theatreRooms = theatreRooms;
    }
}
