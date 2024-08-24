package com.vidhu.microproj.repo;




import org.springframework.data.jpa.repository.JpaRepository;

import com.vidhu.microproj.model.Booking;

public interface BookingRepo extends JpaRepository<Booking, Long> {
}
