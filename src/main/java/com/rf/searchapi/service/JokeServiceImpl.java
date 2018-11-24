package com.rf.searchapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.rf.searchapi.model.JokeResult;

public class JokeServiceImpl implements JokeService {
	
	@Value("{api.joke.base}")
	private String apiBase;
	

	@Override
	public JokeResult getJokes(String firstName, String lastName) {
		RestTemplate template = new RestTemplate();
		return template.getForObject(apiBase, JokeResult.class);		
	}

}
