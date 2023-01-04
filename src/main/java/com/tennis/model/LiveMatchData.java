package com.tennis.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LiveMatchData {
	
	@JsonProperty("TournamentYear")
	private int Tournament_year;
	
	@JsonProperty("TournamentId")
	private int Tournament_id;

	@JsonProperty("MatchId")
	private String MatchId;
	
	@JsonProperty("Status")
	private String Status;
	
	@JsonProperty("PlayerTeam1")
	private List<PlayerSetMatchStats> Player1;
	
	@JsonProperty("PlayerTeam2")
	private List<PlayerSetMatchStats> Player2;

	public int getTournament_year() {
		return Tournament_year;
	}

	public void setTournament_year(int tournament_year) {
		Tournament_year = tournament_year;
	}

	public int getTournament_id() {
		return Tournament_id;
	}

	public void setTournament_id(int tournament_id) {
		Tournament_id = tournament_id;
	}

	public String getMatchId() {
		return MatchId;
	}

	public void setMatchId(String matchId) {
		MatchId = matchId;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public List<PlayerSetMatchStats> getPlayer1() {
		return Player1;
	}

	public void setPlayer1(List<PlayerSetMatchStats> player1) {
		Player1 = player1;
	}

	public List<PlayerSetMatchStats> getPlayer2() {
		return Player2;
	}

	public void setPlayer2(List<PlayerSetMatchStats> player2) {
		Player2 = player2;
	}
	
}
