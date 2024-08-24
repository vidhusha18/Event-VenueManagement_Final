package com.vidhu.microproj.serviceimpl;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vidhu.microproj.model.Booking;
import com.vidhu.microproj.repo.BookingRepo;

@SpringBootTest
public class BookingServiceImplTest {

    @Autowired
    private BookingServiceImpl bookingService;

    @Autowired
    private BookingRepo bookingRepository;

    @BeforeEach
    public void setUp() {
        bookingRepository.deleteAll();
    }

    @Test
    public void testSaveBooking() {
        Booking booking = new Booking();
        Booking savedBooking = bookingService.saveBooking(booking);
        assertNotNull(savedBooking);
        assertEquals(booking.getId(), savedBooking.getId());

        Booking foundBooking = bookingRepository.findById(savedBooking.getId()).orElse(null);
        assertNotNull(foundBooking);
        assertEquals(savedBooking.getId(), foundBooking.getId());
    }
}
