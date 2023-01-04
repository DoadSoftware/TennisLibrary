package com.tennis.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerSetMatchStats {

	@JsonProperty("PlayerId")
	private String firstPlayerId;

	@JsonProperty("PartnerId")
	private String secondPlayerId;
	
	@JsonProperty("GamePointsPlayerTeam")
	private int gamePointsPlayerTeam;
	
	@JsonProperty("Sets")
	private List<APIsets> sets;

	public String getFirstPlayerId() {
		return firstPlayerId;
	}

	public void setFirstPlayerId(String firstPlayerId) {
		this.firstPlayerId = firstPlayerId;
	}

	public String getSecondPlayerId() {
		return secondPlayerId;
	}

	public void setSecondPlayerId(String secondPlayerId) {
		this.secondPlayerId = secondPlayerId;
	}

	public int getGamePointsPlayerTeam() {
		return gamePointsPlayerTeam;
	}

	public void setGamePointsPlayerTeam(int gamePointsPlayerTeam) {
		this.gamePointsPlayerTeam = gamePointsPlayerTeam;
	}

	public List<APIsets> getSets() {
		return sets;
	}

	public void setSets(List<APIsets> sets) {
		this.sets = sets;
	}

	@Override
	public String toString() {
		return "PlayerSetMatchStats [firstPlayerId=" + firstPlayerId + ", secondPlayerId=" + secondPlayerId
				+ ", gamePointsPlayerTeam=" + gamePointsPlayerTeam + ", sets=" + sets + "]";
	}
	
}
