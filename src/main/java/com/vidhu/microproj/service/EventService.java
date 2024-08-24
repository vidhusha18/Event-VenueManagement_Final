package com.vidhu.microproj.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.vidhu.microproj.model.Event;



	public interface EventService {
	    List<Event> getAllEvents();
	    Event addEvent(Event event);
	    boolean bookSeats(Long eventId, Integer seatsToBook);
	    boolean isSlotAvailable(LocalDate date, LocalTime time, String venueName);
	    public String deleteEvent(long id);
	}



