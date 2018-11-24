package com.rf.searchapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.rf.searchapi.model.JokeResultList;

@Service("jokeService")
public class JokeServiceImpl implements JokeService {
	
	@Value("{api.joke.base}")
	private String apiBase;
	

	@Override
	public JokeResultList getJokes() {
		RestTemplate template = new RestTemplate();
		return template.getForObject(apiBase, JokeResultList.class);		
	}

}
