package com.vidhu.microproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vidhu.microproj.model.BookingRequest;
import com.vidhu.microproj.service.BookingRequestService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/bookings")
public class BookingRequestController {

    @Autowired
    BookingRequestService bookingRequestService;
    
    @PostMapping
    public BookingRequest createBookingRequest(@RequestBody BookingRequest bookingRequest) {
        return bookingRequestService.saveBookingRequest(bookingRequest);
    }
    
    @GetMapping("/allbookreq")
    public List<BookingRequest> getAllBookings() {
        return bookingRequestService.getAllBookingRequests();
    }
    
    @GetMapping("/bookreq/{id}")
    public Optional<BookingRequest> getBookingRequestById(@PathVariable Long id) {
        return bookingRequestService.getBookingRequestById(id);
    }
   
    
    @PutMapping("/approve/{id}")
    public ResponseEntity<BookingRequest> approveRequest(@PathVariable int id) {
        BookingRequest updatedRequest = bookingRequestService.approveRequest(id);
        return ResponseEntity.ok(updatedRequest);
    }
  

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> rejectRequest(@PathVariable int id) {
        bookingRequestService.rejectRequest(id);
        return ResponseEntity.noContent().build();
    }
    
    
}
