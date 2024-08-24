package com.vidhu.microproj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vidhu.microproj.model.BookingSummary;
import com.vidhu.microproj.service.BookingSummaryService;

import jakarta.persistence.GeneratedValue;

@RestController
@RequestMapping("/bookingtable")
@CrossOrigin("*")
public class BookingSummaryController {
	
	@Autowired
	BookingSummaryService service;
	
	@PostMapping
	public String addBooking(@RequestBody BookingSummary detail) {
		return service.addTickets(detail);
	}
	@GetMapping("/allbooking")
	public List<BookingSummary> getAllBooking(){
		return service.getAllBooking();
	}
}
