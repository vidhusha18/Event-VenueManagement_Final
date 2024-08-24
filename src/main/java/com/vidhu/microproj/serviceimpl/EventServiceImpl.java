package com.vidhu.microproj.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidhu.microproj.model.Event;
import com.vidhu.microproj.repo.EventRepository;
import com.vidhu.microproj.service.EventService;



import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

	@Override
	public boolean isSlotAvailable(LocalDate date, LocalTime time, String venueName) {
		Optional<Event> event = eventRepository.findByDateAndTimeAndVenueName(date, time, venueName);
        return event.isEmpty();
	}

	@Override
	public boolean bookSeats(Long eventId, Integer seatsToBook) {
		Event event = eventRepository.findById(eventId).orElse(null);
        if (event == null) {
            return false;
        }
        if (event.getAvailableSeats() < seatsToBook) {
            return false;
        }
        event.setAvailableSeats(event.getAvailableSeats() - seatsToBook);
        eventRepository.save(event);
        return true;
    }

	@Override
	public String deleteEvent(long id) {
		Optional<Event> event = eventRepository.findById(id);
		if(event.isPresent()) {
			return "success";
		}
		else {
			return "failure";
		}
	}
	
	 
	
}
