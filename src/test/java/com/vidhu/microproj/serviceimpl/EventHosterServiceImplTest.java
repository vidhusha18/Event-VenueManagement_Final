package com.vidhu.microproj.serviceimpl;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vidhu.microproj.model.EventHoster;
import com.vidhu.microproj.repo.EventHosterRepository;

@SpringBootTest
public class EventHosterServiceImplTest {

    @Autowired
    private EventHosterServiceImpl eventHosterService;

    @Autowired
    private EventHosterRepository eventHosterRepository;

    @BeforeEach
    public void setUp() {
        eventHosterRepository.deleteAll();
    }

    @Test
    public void testAddRegister_Success() {
        EventHoster hoster = new EventHoster();
        String result = eventHosterService.addRegsiter(hoster);
        assertEquals("success", result);

        EventHoster savedHoster = eventHosterRepository.findById(hoster.getId()).orElse(null);
        assertNotNull(savedHoster);
    }

    @Test
    public void testAddRegister_Failure() {
        String result = eventHosterService.addRegsiter(null);
        assertEquals("failure", result);
    }

    @Test
    public void testFindByEmail() {
        EventHoster hoster = new EventHoster();
        hoster.setEmail("test@example.com");
        eventHosterRepository.save(hoster);

        EventHoster foundHoster = eventHosterService.findByEmail("test@example.com");
        assertNotNull(foundHoster);
        assertEquals("test@example.com", foundHoster.getEmail());
    }
}
