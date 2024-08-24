package com.vidhu.microproj.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vidhu.microproj.model.Venue1;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface Venue1Repo extends JpaRepository<Venue1, Integer> {


}
