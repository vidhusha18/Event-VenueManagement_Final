//package com.vidhu.microproj.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//import com.vidhu.microproj.model.Venue1;
//import com.vidhu.microproj.service.Venue1Service;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.List;
//
//@RestController
//@RequestMapping("/venue")
//@CrossOrigin(origins = "http://localhost:3000")
//public class Venue1Controller {
//
//    @Autowired
//    private Venue1Service service;
//
//    private static final String UPLOAD_DIR = "uploads/";
//
//    @PostMapping
//    public String addVenue(@RequestParam("name") String name,
//                           @RequestParam("location") String location,
//                           @RequestParam("seatCapacity") int seatCapacity,
//                           @RequestParam("description") String description,
//                           @RequestParam("priceperday") double priceperday,
//                           @RequestParam("url") String url,
//                           @RequestParam(value = "file", required = false) MultipartFile file) {
//        String imageUrl = "";
//        if (file != null && !file.isEmpty()) {
//            imageUrl = saveFile(file);
//        }
//
//        Venue1 venue = new Venue1();
//        venue.setName(name);
//        venue.setLocation(location);
//        venue.setSeatCapacity(seatCapacity);
//        venue.setDescription(description);
//        venue.setPriceperday(priceperday);
//        venue.setUrl(url);
//        venue.setImageUrl(imageUrl);
//
//        service.addVenue(venue);
//        return "Venue added successfully";
//    }
//
//    private String saveFile(MultipartFile file) {
//        String fileName = file.getOriginalFilename();
//        Path path = Paths.get(UPLOAD_DIR + fileName);
//        try {
//            Files.createDirectories(path.getParent());
//            Files.write(path, file.getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return ServletUriComponentsBuilder.fromCurrentContextPath()
//                .path("/" + UPLOAD_DIR + fileName)
//                .toUriString();
//    }
//
//    @GetMapping("/allvenue")
//    public List<Venue1> getAllVenues() {
//        return service.findAllVenue();
//    }
//}
//

package com.vidhu.microproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.vidhu.microproj.model.Venue1;
import com.vidhu.microproj.service.Venue1Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/venue")
@CrossOrigin(origins = "http://localhost:3000")
public class Venue1Controller {

    @Autowired
    private Venue1Service service;

    private static final String UPLOAD_DIR = "uploads/";

    @PostMapping
    public String addVenue(@RequestParam("name") String name,
                           @RequestParam("location") String location,
                           @RequestParam("seatCapacity") int seatCapacity,
                           @RequestParam("description") String description,
                           @RequestParam("priceperday") double priceperday,
                           @RequestParam("url") String url,
                           @RequestParam(value = "file", required = false) MultipartFile file) {
        String imageUrl = "";
        if (file != null && !file.isEmpty()) {
            imageUrl = saveFile(file);
        }

        Venue1 venue = new Venue1();
        venue.setName(name);
        venue.setLocation(location);
        venue.setSeatCapacity(seatCapacity);
        venue.setDescription(description);
        venue.setPriceperday(priceperday);
        venue.setUrl(url);
        venue.setImageUrl(imageUrl);

        service.addVenue(venue);
        return "Venue added successfully";
    }

    private String saveFile(MultipartFile file) {
        String fileName = file.getOriginalFilename();
        Path path = Paths.get(UPLOAD_DIR + fileName);
        try {
            Files.createDirectories(path.getParent());
            Files.write(path, file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/" + UPLOAD_DIR + fileName)
                .toUriString();
    }

    @GetMapping("/allvenue")
    public List<Venue1> getAllVenues() {
        return service.findAllVenue();
    }
}

