package com.rf.searchapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rf.searchapi.model.JokeResultList;
import com.rf.searchapi.service.JokeService;

@RestController
public class JokeController {
	
	@Autowired
	JokeService jokeService;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping("/jokes")
	public JokeResultList getJokes() {
		
		return jokeService.getJokes();
	}

}
