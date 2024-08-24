//package com.vidhu.microproj.controller;
//
//
//
//
//import com.vidhu.microproj.service.BookingService;
//import com.vidhu.microproj.service.TicketService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/bookings")
//@CrossOrigin("*")
//public class BookingController {
//
//	  @Autowired
//	    private BookingService bookingService;
//	    @Autowired
//	    private EventService eventService;
//
//	    @PostMapping
//	    public ResponseEntity<String> bookTickets(@RequestBody Booking booking) {
//	        Booking savedBooking = bookingService.saveBooking(booking);
//	        String message = "Tickets booked successfully for " + savedBooking.getUserName();
//
//	        // Generate PDF
//	        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//	        PdfWriter writer = new PdfWriter(baos);
//	        Document document = new Document(writer);
//	        document.add(new Paragraph("Booking Confirmation"));
//	        document.add(new Paragraph("Name: " + savedBooking.getUserName()));
//	        document.add(new Paragraph("Phone Number: " + savedBooking.getPhoneNumber()));
//	        document.add(new Paragraph("Number of Seats: " + savedBooking.getNumSeats()));
//	        document.add(new Paragraph("Event: " + savedBooking.getEvent().getName()));
//	        document.close();
//
//	        HttpHeaders headers = new HttpHeaders();
//	        headers.setContentType(MediaType.APPLICATION_PDF);
//	        headers.setContentDispositionFormData("attachment", "booking_confirmation.pdf");
//
//	        return ResponseEntity.ok()
//	                .headers(headers)
//	                .body(message);
//	    }
//}
