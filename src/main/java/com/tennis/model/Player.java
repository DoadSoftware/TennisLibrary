package com.tennis.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Column;

@Entity
@Table(name = "Players")
public class Player
{

  @Id
  @Column(name = "PLAYERID")
  private int playerId;
	
  @Column(name = "FULLNAME")
  private String full_name;

  @Column(name = "FIRSTNAME")
  private String firstname;

  @Column(name = "SURNAME")
  private String surname;
  
  @Column(name = "TICKERNAME")
  private String ticker_name;
  
  @Column(name = "RankingSingle")
  private int rankingSingle;
  
  @Column(name = "RankingDouble")
  private Integer rankingDouble;
  
  @Column(name = "Nationality")
  private String Nationality;
  
  @Column(name = "Photo")
  private String photo;

  @Column(name = "TeamId")
  private Integer teamId;
  
  @Transient
  private Team team;
 
public Team getTeam() {
	return team;
}

public void setTeam(Team team) {
	this.team = team;
}

public Integer getTeamId() {
	return teamId;
}

public void setTeamId(Integer teamId) {
	this.teamId = teamId;
}

public int getPlayerId() {
	return playerId;
}

public void setPlayerId(int playerId) {
	this.playerId = playerId;
}

public String getFull_name() {
	return full_name;
}

public void setFull_name(String full_name) {
	this.full_name = full_name;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public String getTicker_name() {
	return ticker_name;
}

public void setTicker_name(String ticker_name) {
	this.ticker_name = ticker_name;
}

public int getRankingSingle() {
	return rankingSingle;
}

public void setRankingSingle(int rankingSingle) {
	this.rankingSingle = rankingSingle;
}

public Integer getRankingDouble() {
	return rankingDouble;
}

public void setRankingDouble(Integer rankingDouble) {
	this.rankingDouble = rankingDouble;
}

public String getNationality() {
	return Nationality;
}

public void setNationality(String nationality) {
	Nationality = nationality;
}

public String getPhoto() {
	return photo;
}

public void setPhoto(String photo) {
	this.photo = photo;
}

@Override
public String toString() {
	return "Player [playerId=" + playerId + ", full_name=" + full_name + ", firstname=" + firstname + ", surname="
			+ surname + ", ticker_name=" + ticker_name + ", rankingSingle=" + rankingSingle + ", rankingDouble="
			+ rankingDouble + ", Nationality=" + Nationality + ", photo=" + photo + "]";
}

}