package com.vidhu.microproj.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private LocalDate date;

    @NotNull
    private LocalTime time;

    private String description;

    @NotNull
    private String organization;

    private Double ticketPrice;

    @NotNull
    private String venueName;

    @NotNull
    private String venueLocation;
    
    private Integer seatCapacity; 
    private Integer availableSeats;
    
	@ManyToOne
    @JoinColumn(name = "venue_id") 
    private Venue1 venue; 


	public Event() {
		super();
		}


	public Event(Long id, @NotNull String name, @NotNull LocalDate date, @NotNull LocalTime time, String description,
			@NotNull String organization, Double ticketPrice, @NotNull String venueName, @NotNull String venueLocation,
			Integer seatCapacity, Integer availableSeats, Venue1 venue) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.time = time;
		this.description = description;
		this.organization = organization;
		this.ticketPrice = ticketPrice;
		this.venueName = venueName;
		this.venueLocation = venueLocation;
		this.seatCapacity = seatCapacity;
		this.availableSeats = availableSeats;
		this.venue = venue;
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


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public LocalTime getTime() {
		return time;
	}


	public void setTime(LocalTime time) {
		this.time = time;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getOrganization() {
		return organization;
	}


	public void setOrganization(String organization) {
		this.organization = organization;
	}


	public Double getTicketPrice() {
		return ticketPrice;
	}


	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}


	public String getVenueName() {
		return venueName;
	}


	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}


	public String getVenueLocation() {
		return venueLocation;
	}


	public void setVenueLocation(String venueLocation) {
		this.venueLocation = venueLocation;
	}


	public Integer getSeatCapacity() {
		return seatCapacity;
	}


	public void setSeatCapacity(Integer seatCapacity) {
		this.seatCapacity = seatCapacity;
	}


	public Integer getAvailableSeats() {
		return availableSeats;
	}


	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}


	public Venue1 getVenue() {
		return venue;
	}


	public void setVenue(Venue1 venue) {
		this.venue = venue;
	}
    

}
