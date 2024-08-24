package com.vidhu.microproj.model;



import jakarta.persistence.*;


@Entity
public class SeatBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int totalSeats;
    private int bookedSeats;

    @ManyToOne
    private User user; 

  
    public SeatBooking() {}

    public SeatBooking(int totalSeats, int bookedSeats, User user) {
        this.totalSeats = totalSeats;
        this.bookedSeats = bookedSeats;
        this.user = user;
    }

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAvailableSeats() {
        return totalSeats - bookedSeats;
    }
}
