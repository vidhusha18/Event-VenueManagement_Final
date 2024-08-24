package com.vidhu.microproj.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vidhu.microproj.model.Event;
import com.vidhu.microproj.service.EventService;

@RestController
@RequestMapping("/events")
@CrossOrigin("*")
public class EventController {

    @Autowired
    private EventService eventService;

    
    @GetMapping("/allevents")
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    
    @PostMapping
    public Event addEvent(@RequestBody Event event) {
        return eventService.addEvent(event);
    }

    @GetMapping("/availability")
    public boolean checkAvailability(
            @RequestParam("date") LocalDate date,
            @RequestParam("time") LocalTime time,
            @RequestParam("venueName") String venueName) {
        
        return eventService.isSlotAvailable(date, time, venueName);
    }
    
    @PostMapping("/bookSeats/{eventId}")
    public String bookSeats(@PathVariable Long eventId, @RequestParam Integer seatsToBook) {
        boolean success = eventService.bookSeats(eventId, seatsToBook);
        if (success) {
            return "Seats booked successfully";
        } else {
            return "Not enough seats available or event not found";
        }
    }
    
    @DeleteMapping("{id}")
    public void deleteEvent(@PathVariable long id) {
    	eventService.deleteEvent(id);
    }
    
    
}
