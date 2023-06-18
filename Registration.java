package com.registration.registration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Registration {
    @Id
    @GeneratedValue
    private long id;
    private String flightname;
    private int seatsavailable;
    private String departure;
    private String arrival;
    private  int price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFlightname() {
        return flightname;
    }

    public void setFlightname(String flightname) {
        this.flightname = flightname;
    }

    public int getSeatsavailable() {
        return seatsavailable;
    }

    public void setSeatsavailable(int seatsavailable) {
        this.seatsavailable = seatsavailable;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
