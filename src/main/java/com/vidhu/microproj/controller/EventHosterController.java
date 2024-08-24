package com.vidhu.microproj.controller;


import com.vidhu.microproj.model.EventHoster;
import com.vidhu.microproj.service.EventHosterService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eventhoster")
//@CrossOrigin(origins = "http://localhost:3000/")
@CrossOrigin("*")
public class EventHosterController {

    @Autowired
    private EventHosterService service;

    @PostMapping
    public void addRegsiter(@RequestBody EventHoster hoster) {
    	service.addRegsiter(hoster);
    }
    
    @PostMapping("/login")
    public String loginEventHost(@RequestBody EventHoster eventHost) {
        EventHoster existingEventHost = service.findByEmail(eventHost.getEmail());
        if (existingEventHost != null && existingEventHost.getPassword().equals(eventHost.getPassword())) {
            return eventHost.getEmail();
        }
        return "Invalid credentials";
    }
}
