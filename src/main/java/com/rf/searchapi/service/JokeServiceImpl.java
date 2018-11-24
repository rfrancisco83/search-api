package com.rf.searchapi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rf.searchapi.model.JokeResult;
import com.rf.searchapi.model.JokeResultList;

@Service("jokeService")
public class JokeServiceImpl implements JokeService {
	
	@Value("${api.joke.base}")
	private String apiBase;
	

	@Override
	public JokeResultList getJokes() {
		RestTemplate template = new RestTemplate();
		List<JokeResult> finalList = Arrays.asList(template.getForObject(apiBase, JokeResult[].class));
		
		JokeResultList allTheJokes = new JokeResultList();
		allTheJokes.setResults(finalList);
		
		return allTheJokes;		
	}

}
