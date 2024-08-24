package com.vidhu.microproj.repo;


import com.vidhu.microproj.model.BookingRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRequestRepository extends JpaRepository<BookingRequest, Long> {

}
