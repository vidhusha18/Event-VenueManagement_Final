package com.vidhu.microproj.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vidhu.microproj.model.BookingSummary;
import com.vidhu.microproj.repo.BookingSummaryRepo;

@SpringBootTest
public class BookingSummaryServiceImplTest {

    @Autowired
    private BookingSummaryServiceImpl bookingSummaryService;

    @Autowired
    private BookingSummaryRepo bookingSummaryRepo;

    @BeforeEach
    public void setUp() {
        bookingSummaryRepo.deleteAll();
    }

    @Test
    public void testAddTickets_Success() {
        BookingSummary detail = new BookingSummary();
        String result = bookingSummaryService.addTickets(detail);
        assertEquals("success", result);

        BookingSummary savedDetail = bookingSummaryRepo.findById(detail.getBid()).orElse(null);
        assertNotNull(savedDetail);
    }

    @Test
    public void testAddTickets_Failure() {
        String result = bookingSummaryService.addTickets(null);
        assertEquals("failure", result);
    }

    @Test
    public void testGetAllBooking() {
        BookingSummary detail1 = new BookingSummary();
        BookingSummary detail2 = new BookingSummary();
        bookingSummaryRepo.save(detail1);
        bookingSummaryRepo.save(detail2);

        List<BookingSummary> bookingSummaries = bookingSummaryService.getAllBooking();
        assertEquals(2, bookingSummaries.size());
    }
    

    @Test
    public void testAddTickets_Success2() {
        BookingSummary detail = new BookingSummary();
        String result = bookingSummaryService.addTickets(detail);
        assertEquals("success", result);

        BookingSummary savedDetail = bookingSummaryRepo.findById(detail.getBid()).orElse(null);
        assertNotNull(savedDetail);
    }

    @Test
    public void testAddTickets_Failure2() {
        String result = bookingSummaryService.addTickets(null);
        assertEquals("failure", result);
    }

    @Test
    public void testGetAllBooking2() {
        BookingSummary detail1 = new BookingSummary();
        BookingSummary detail2 = new BookingSummary();
        bookingSummaryRepo.save(detail1);
        bookingSummaryRepo.save(detail2);

        List<BookingSummary> bookingSummaries = bookingSummaryService.getAllBooking();
        assertEquals(2, bookingSummaries.size());
    }
    
    @Test
    public void testAddTickets_Success21() {
        BookingSummary detail = new BookingSummary();
        String result = bookingSummaryService.addTickets(detail);
        assertEquals("success", result);

        BookingSummary savedDetail = bookingSummaryRepo.findById(detail.getBid()).orElse(null);
        assertNotNull(savedDetail);
    }

    @Test
    public void testAddTickets_Failure21() {
        String result = bookingSummaryService.addTickets(null);
        assertEquals("failure", result);
    }

    @Test
    public void testGetAllBooking21() {
        BookingSummary detail1 = new BookingSummary();
        BookingSummary detail2 = new BookingSummary();
        bookingSummaryRepo.save(detail1);
        bookingSummaryRepo.save(detail2);

        List<BookingSummary> bookingSummaries = bookingSummaryService.getAllBooking();
        assertEquals(2, bookingSummaries.size());
    }
    @Test
    public void testAddTickets_Success211() {
        BookingSummary detail = new BookingSummary();
        String result = bookingSummaryService.addTickets(detail);
        assertEquals("success", result);

        BookingSummary savedDetail = bookingSummaryRepo.findById(detail.getBid()).orElse(null);
        assertNotNull(savedDetail);
    }

    @Test
    public void testAddTickets_Failure211() {
        String result = bookingSummaryService.addTickets(null);
        assertEquals("failure", result);
    }

    @Test
    public void testGetAllBooking211() {
        BookingSummary detail1 = new BookingSummary();
        BookingSummary detail2 = new BookingSummary();
        bookingSummaryRepo.save(detail1);
        bookingSummaryRepo.save(detail2);

        List<BookingSummary> bookingSummaries = bookingSummaryService.getAllBooking();
        assertEquals(2, bookingSummaries.size());
    }
    
}
