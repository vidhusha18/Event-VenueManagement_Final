package com.vidhu.microproj.service;



import com.vidhu.microproj.model.BookingRequest;

import java.util.List;
import java.util.Optional;

public interface BookingRequestService {
    BookingRequest saveBookingRequest(BookingRequest bookingRequest);
    Optional<BookingRequest> getBookingRequestById(Long id);
    List<BookingRequest> getAllBookingRequests();
    public BookingRequest approveRequest(int id);
	 public BookingRequest rejectRequest(int id);
}
