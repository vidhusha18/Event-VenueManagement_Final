package com.vidhu.microproj.serviceimpl;

import com.vidhu.microproj.model.BookingRequest;
import com.vidhu.microproj.repo.BookingRequestRepository;
import com.vidhu.microproj.service.BookingRequestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingRequestServiceImpl implements BookingRequestService {


    @Autowired
    BookingRequestRepository repo;

    @Override
    public BookingRequest saveBookingRequest(BookingRequest bookingRequest) {
        return repo.save(bookingRequest);
    }

    @Override
    public Optional<BookingRequest> getBookingRequestById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<BookingRequest> getAllBookingRequests() {
        return repo.findAll();
    }

	@Override
	public BookingRequest approveRequest(int id) {
		BookingRequest request = repo.findById((long) id).orElseThrow(() -> new RuntimeException("Request not found"));
        request.setStatus("approved");
        return repo.save(request);
	}

	@Override
	public BookingRequest rejectRequest(int id) {
		  BookingRequest request = repo.findById((long) id).orElseThrow(() -> new RuntimeException("Request not found"));
	        request.setStatus("rejected");
	        return repo.save(request);
		
	}
}
