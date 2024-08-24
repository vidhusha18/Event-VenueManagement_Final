package com.vidhu.microproj.service;

import java.util.List;

import com.vidhu.microproj.model.BookingSummary;

public interface BookingSummaryService {
	
	public String addTickets(BookingSummary detail);
	public List<BookingSummary> getAllBooking();
}
