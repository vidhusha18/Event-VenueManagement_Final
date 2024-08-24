package com.vidhu.microproj.serviceimpl;



import com.vidhu.microproj.model.Venue1;
import com.vidhu.microproj.repo.Venue1Repo;
import com.vidhu.microproj.service.Venue1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Venue1ServiceImpl implements Venue1Service {

    @Autowired
    private Venue1Repo repository;

    @Override
    public void addVenue(Venue1 venue) {
        repository.save(venue);
    }

    @Override
    public List<Venue1> findAllVenue() {
        return repository.findAll();
    }
}

