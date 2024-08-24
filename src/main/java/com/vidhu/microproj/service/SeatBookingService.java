package com.vidhu.microproj.service;

import org.springframework.stereotype.Service;

import com.vidhu.microproj.model.*;




@Service
public interface SeatBookingService {

	SeatBooking bookSeats(User user, int seatsToBook);
    SeatBooking getSeatBookingByUser(User user);
	boolean cancelBooking(User user, int seatsToCancel);
}

