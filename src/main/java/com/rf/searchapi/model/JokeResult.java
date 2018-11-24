package com.rf.searchapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JokeResult {
	
	@JsonProperty("id")
	public int id;
	
	@JsonProperty("type")
	public String type;
	
	@JsonProperty("setup")
	public String setup;
	
	@JsonProperty("punchline")
	public String punchline;

}
