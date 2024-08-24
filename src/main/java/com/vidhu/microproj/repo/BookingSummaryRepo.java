package com.vidhu.microproj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vidhu.microproj.model.BookingSummary;


@Repository
public interface BookingSummaryRepo extends JpaRepository<BookingSummary, Integer>{

}
