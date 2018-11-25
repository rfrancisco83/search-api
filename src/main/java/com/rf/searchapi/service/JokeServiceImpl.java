package com.rf.searchapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		//api doesn't provide a customizable length, so let's just call twice and merge
		List<JokeResult> list1 = Arrays.asList(template.getForObject(apiBase, JokeResult[].class));
		List<JokeResult> list2 = Arrays.asList(template.getForObject(apiBase, JokeResult[].class));
		
		//JokeResult overrides equals() and hashcode().  Adding to set will eliminate dupes.
		Set<JokeResult> setOfJokes = new HashSet<JokeResult>();
		setOfJokes.addAll(list1);
		setOfJokes.addAll(list2);
		
		JokeResultList allTheJokes = new JokeResultList();
		allTheJokes.setResults(new ArrayList<JokeResult>(setOfJokes));
		
		return allTheJokes;		
	}

}
