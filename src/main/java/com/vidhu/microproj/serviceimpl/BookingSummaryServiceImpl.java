package com.vidhu.microproj.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidhu.microproj.model.BookingSummary;
import com.vidhu.microproj.repo.BookingSummaryRepo;
import com.vidhu.microproj.service.BookingSummaryService;

@Service
public class BookingSummaryServiceImpl implements BookingSummaryService {
	
	@Autowired
	BookingSummaryRepo repo;
	@Override
	public String addTickets(BookingSummary detail) {
		if(detail!=null) {
			repo.save(detail);
			return "success";
		}
		else {
		return "failure";
		}
	}
	@Override
	public List<BookingSummary> getAllBooking() {
		return (List<BookingSummary>)repo.findAll();
	}

}
