package com.vidhu.microproj.service;


import com.vidhu.microproj.model.Booking;
import com.vidhu.microproj.model.Event;
import com.vidhu.microproj.repo.BookingRepo;
import com.vidhu.microproj.repo.EventRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public interface BookingService {

	Booking saveBooking(Booking booking);

   

   
   
}
