package com.vidhu.microproj.service;


import com.vidhu.microproj.model.EventHoster;

public interface EventHosterService {

	public String addRegsiter(EventHoster hoster);
	 EventHoster findByEmail(String email);
}


