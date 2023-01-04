package com.tennis.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class APIsets {

	@JsonProperty("SetNumber")
	private int setNumber;

	@JsonProperty("SetScore")
	private String setScore;
	
	@JsonProperty("TieBreakScore")
	private String tieBreakScore;
	
	@JsonProperty("Stats")
	private List<APIstats> stats;

	public int getSetNumber() {
		return setNumber;
	}

	public void setSetNumber(int setNumber) {
		this.setNumber = setNumber;
	}

	public String getSetScore() {
		return setScore;
	}

	public void setSetScore(String setScore) {
		this.setScore = setScore;
	}

	public String getTieBreakScore() {
		return tieBreakScore;
	}

	public void setTieBreakScore(String tieBreakScore) {
		this.tieBreakScore = tieBreakScore;
	}

	public List<APIstats> getStats() {
		return stats;
	}

	public void setStats(List<APIstats> stats) {
		this.stats = stats;
	}

	@Override
	public String toString() {
		return "APIsets [setNumber=" + setNumber + ", setScore=" + setScore + ", tieBreakScore=" + tieBreakScore + "]";
	}

	
}
