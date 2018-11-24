package com.rf.searchapi.service;

import com.rf.searchapi.model.JokeResult;

public interface JokeService {
	
	public JokeResult getJokes(String firstName, String lastName);

}
