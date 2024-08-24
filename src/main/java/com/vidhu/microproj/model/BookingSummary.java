package com.vidhu.microproj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookings")
public class BookingSummary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int bid;
	private String username;
	private long phonenumber;
	private int seats;
	
	public BookingSummary() {
		super();
	}
	
	public BookingSummary(int bid, String username, long phonenumber, int seats) {
		super();
		this.bid = bid;
		this.username = username;
		this.phonenumber = phonenumber;
		this.seats = seats;
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	
	
}
