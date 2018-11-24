package com.rf.searchapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rf.searchapi.model.JokeResult;

@RestController
public class JokeController {
	
	@RequestMapping("/jokes")
	public JokeResult getJokes(@RequestParam(required=false) String firstName, 
			@RequestParam(required=false) String lastName) {
		
		JokeResult result = new JokeResult();
		
		
		return result;
		
	}

}
