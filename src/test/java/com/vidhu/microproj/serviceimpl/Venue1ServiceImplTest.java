package com.vidhu.microproj.serviceimpl;

import com.vidhu.microproj.model.Venue1;
import com.vidhu.microproj.repo.Venue1Repo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class Venue1ServiceImplTest {

    @Mock
    private Venue1Repo venue1Repo;

    @InjectMocks
    private Venue1ServiceImpl venue1Service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAddVenue() {
        Venue1 venue = new Venue1();
        venue.setName("Test Venue");

        venue1Service.addVenue(venue);

        verify(venue1Repo, times(1)).save(venue);
    }

    @Test
    void testFindAllVenue() {
        Venue1 venue1 = new Venue1();
        venue1.setName("Venue 1");

        Venue1 venue2 = new Venue1();
        venue2.setName("Venue 2");

        List<Venue1> venueList = Arrays.asList(venue1, venue2);

        when(venue1Repo.findAll()).thenReturn(venueList);

        List<Venue1> result = venue1Service.findAllVenue();

        assertEquals(2, result.size());
        assertEquals("Venue 1", result.get(0).getName());
        assertEquals("Venue 2", result.get(1).getName());
    }
}
