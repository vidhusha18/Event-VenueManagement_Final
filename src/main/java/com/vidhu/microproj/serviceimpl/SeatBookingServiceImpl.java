package com.vidhu.microproj.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.vidhu.microproj.model.SeatBooking;
import com.vidhu.microproj.model.User;
import com.vidhu.microproj.repo.SeatBookingRepo;
import com.vidhu.microproj.service.SeatBookingService;

@Service
public class SeatBookingServiceImpl implements SeatBookingService {

    @Autowired
    private SeatBookingRepo seatBookingRepository;

    @Override
    public SeatBooking bookSeats(User user, int seatsToBook) {
        
        SeatBooking booking = seatBookingRepository.findByUser(user);
        
        if (booking == null) {
           
            booking = new SeatBooking(100, seatsToBook, user); 
        } else {
            
            if (booking.getAvailableSeats() >= seatsToBook) {
                booking.setBookedSeats(booking.getBookedSeats() + seatsToBook);
            } else {
                return null;
            }
        }
        
     
        return seatBookingRepository.save(booking);
    }

    @Override
    public SeatBooking getSeatBookingByUser(User user) {
        return seatBookingRepository.findByUser(user);
    }

    @Override
    public boolean cancelBooking(User user, int seatsToCancel) {
        SeatBooking booking = seatBookingRepository.findByUser(user);
        
        if (booking != null && booking.getBookedSeats() >= seatsToCancel) {
            booking.setBookedSeats(booking.getBookedSeats() - seatsToCancel);
            seatBookingRepository.save(booking);
            return true;
        }
        
        return false; 
    }
}
