package com.vidhu.microproj.serviceimpl;


import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.vidhu.microproj.model.BookingRequest;
import com.vidhu.microproj.repo.BookingRequestRepository;

@SpringBootTest
public class BookingRequestServiceImplTest {

    @Autowired
    private BookingRequestServiceImpl bookingRequestService;

    @Autowired
    private BookingRequestRepository bookingRequestRepository;

    @BeforeEach
    public void setUp() {
        bookingRequestRepository.deleteAll();
    }

    @Test
    public void testSaveBookingRequest() {
        BookingRequest bookingRequest = new BookingRequest();
        BookingRequest savedBookingRequest = bookingRequestService.saveBookingRequest(bookingRequest);
        assertNotNull(savedBookingRequest);
        assertEquals(bookingRequest.getId(), savedBookingRequest.getId());

        BookingRequest foundBookingRequest = bookingRequestRepository.findById(savedBookingRequest.getId()).orElse(null);
        assertNotNull(foundBookingRequest);
        assertEquals(savedBookingRequest.getId(), foundBookingRequest.getId());
    }

    @Test
    public void testGetBookingRequestById() {
        BookingRequest bookingRequest = new BookingRequest();
        bookingRequestRepository.save(bookingRequest);

        Optional<BookingRequest> foundBookingRequest = bookingRequestService.getBookingRequestById(bookingRequest.getId());
        assertTrue(foundBookingRequest.isPresent());
        assertEquals(bookingRequest.getId(), foundBookingRequest.get().getId());
    }

    @Test
    public void testGetAllBookingRequests() {
        BookingRequest bookingRequest1 = new BookingRequest();
        BookingRequest bookingRequest2 = new BookingRequest();
        bookingRequestRepository.save(bookingRequest1);
        bookingRequestRepository.save(bookingRequest2);

        List<BookingRequest> bookingRequests = bookingRequestService.getAllBookingRequests();
        assertEquals(2, bookingRequests.size());
    }

    @Test
    public void testApproveRequest() {
        BookingRequest bookingRequest = new BookingRequest();
        bookingRequestRepository.save(bookingRequest);

        BookingRequest approvedRequest = bookingRequestService.approveRequest(bookingRequest.getId().intValue());
        assertNotNull(approvedRequest);
        assertEquals("approved", approvedRequest.getStatus());

        BookingRequest foundBookingRequest = bookingRequestRepository.findById(bookingRequest.getId()).orElse(null);
        assertNotNull(foundBookingRequest);
        assertEquals("approved", foundBookingRequest.getStatus());
    }

    @Test
    public void testRejectRequest() {
        BookingRequest bookingRequest = new BookingRequest();
        bookingRequestRepository.save(bookingRequest);

        BookingRequest rejectedRequest = bookingRequestService.rejectRequest(bookingRequest.getId().intValue());
        assertNotNull(rejectedRequest);
        assertEquals("rejected", rejectedRequest.getStatus());

        BookingRequest foundBookingRequest = bookingRequestRepository.findById(bookingRequest.getId()).orElse(null);
        assertNotNull(foundBookingRequest);
        assertEquals("rejected", foundBookingRequest.getStatus());
    }
}
