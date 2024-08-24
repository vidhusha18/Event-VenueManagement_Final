package com.vidhu.microproj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vidhu.microproj.model.*;

@Repository
public interface SeatBookingRepo extends JpaRepository<SeatBooking, Long> {

	 SeatBooking findByUser(User user);
}