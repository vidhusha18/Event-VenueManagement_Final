package com.vidhu.microproj.repo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vidhu.microproj.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

	 Optional<Event> findByDateAndTimeAndVenueName(LocalDate date, LocalTime time, String venueName);
	
	
}
