package com.vidhu.microproj.serviceimpl;

import com.vidhu.microproj.model.EventHoster;
import com.vidhu.microproj.repo.EventHosterRepository;
import com.vidhu.microproj.service.EventHosterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventHosterServiceImpl implements EventHosterService {

    @Autowired
    private EventHosterRepository repo;

	@Override
	public String addRegsiter(EventHoster hoster) {
		if(hoster!=null) {
			repo.save(hoster);
			return "success";
		}
		else {
			return "failure";
		}
	}

	@Override
	public EventHoster findByEmail(String email) {
		// TODO Auto-generated method stub
		return repo.findByEmail(email);
	}


}
