package com.vidhu.microproj.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class BookingRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long venueId;
    
    @Column(nullable = false)
    private String venueName;

    @Column(nullable=true)
    private String hosterEmail;
    
	public BookingRequest() {
		super();
	}


	@Column(nullable = false)
    private String eventName;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false)
    private LocalTime time;

    @Column(nullable = false)
    private String hostName;

    @Column(nullable = false)
    private String hostPhone;

    @Column(nullable = false)
    private String hostEmail;

    private String status= "pending";

	public BookingRequest(Long id, Long venueId, String venueName, String hosterEmail, String eventName, LocalDate date,
			LocalTime time, String hostName, String hostPhone, String hostEmail, String status) {
		super();
		this.id = id;
		this.venueId = venueId;
		this.venueName = venueName;
		this.hosterEmail = hosterEmail;
		this.eventName = eventName;
		this.date = date;
		this.time = time;
		this.hostName = hostName;
		this.hostPhone = hostPhone;
		this.hostEmail = hostEmail;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVenueId() {
		return venueId;
	}

	public void setVenueId(Long venueId) {
		this.venueId = venueId;
	}

	public String getVenueName() {
		return venueName;
	}

	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}

	public String getHosterEmail() {
		return hosterEmail;
	}

	public void setHosterEmail(String hosterEmail) {
		this.hosterEmail = hosterEmail;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
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

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getHostPhone() {
		return hostPhone;
	}

	public void setHostPhone(String hostPhone) {
		this.hostPhone = hostPhone;
	}

	public String getHostEmail() {
		return hostEmail;
	}

	public void setHostEmail(String hostEmail) {
		this.hostEmail = hostEmail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}