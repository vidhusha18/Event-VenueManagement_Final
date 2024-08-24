package com.vidhu.microproj.repo;

import com.vidhu.microproj.model.EventHoster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventHosterRepository extends JpaRepository<EventHoster, Long> {

	EventHoster findByEmail(String email);

}
