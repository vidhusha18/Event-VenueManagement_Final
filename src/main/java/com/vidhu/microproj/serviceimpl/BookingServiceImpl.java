package com.vidhu.microproj.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidhu.microproj.model.Booking;
import com.vidhu.microproj.repo.BookingRepo;
import com.vidhu.microproj.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepo bookingRepository;

    @Override
    public Booking saveBooking(Booking booking) {
        return bookingRepository.save(booking);
    }
}
