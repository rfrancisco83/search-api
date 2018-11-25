package com.rf.searchapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JokeResult {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JokeResult other = (JokeResult) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@JsonProperty("id")
	public int id;
	
	@JsonProperty("type")
	public String type;
	
	@JsonProperty("setup")
	public String setup;
	
	@JsonProperty("punchline")
	public String punchline;

}
