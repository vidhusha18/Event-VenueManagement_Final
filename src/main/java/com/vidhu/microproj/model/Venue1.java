package com.vidhu.microproj.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "venue_tbl")
public class Venue1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String Location;
	private int seatCapacity;
	private String description;
	private double priceperday;
	private String url;
	
	 private String imageUrl; 
	
	 public Venue1(String imageUrl) {
		super();
		this.imageUrl = imageUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@OneToMany(mappedBy = "venue")
	    private Set<Event> events;

	public Venue1() {
		super();
		
	}

	public Venue1(int id, String name, String location, int seatCapacity, String description, double priceperday,
			String url, Set<Event> events) {
		super();
		this.id = id;
		this.name = name;
		Location = location;
		this.seatCapacity = seatCapacity;
		this.description = description;
		this.priceperday = priceperday;
		this.url = url;
		this.events = events;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPriceperday() {
		return priceperday;
	}

	public void setPriceperday(double priceperday) {
		this.priceperday = priceperday;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Set<Event> getEvents() {
		return events;
	}

	public void setEvents(Set<Event> events) {
		this.events = events;
	}
	 
	 
}
