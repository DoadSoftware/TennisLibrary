package com.tennis.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Column;

@Entity
@Table(name = "Results")
public class Result {

  @Id
  @Column(name = "MatchId")
  private int matchId;
  
  @Column(name = "MatchNumber")
  private int matchNumber;
  
  @Column(name = "Date")
  private String date;
  
  @Column(name = "Time")
  private String time;
  
  @Column(name = "Day")
  private String day;
  
  @Column(name = "HomeTeam")
  private String homeTeam;
  
  @Column(name = "AwayTeam")
  private String awayTeam;
  
  @Column(name = "MatchResult")
  private String matchResult;

public int getMatchId() {
	return matchId;
}

public void setMatchId(int matchId) {
	this.matchId = matchId;
}

public int getMatchNumber() {
	return matchNumber;
}

public void setMatchNumber(int matchNumber) {
	this.matchNumber = matchNumber;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

public String getDay() {
	return day;
}

public void setDay(String day) {
	this.day = day;
}

public String getHomeTeam() {
	return homeTeam;
}

public void setHomeTeam(String homeTeam) {
	this.homeTeam = homeTeam;
}

public String getAwayTeam() {
	return awayTeam;
}

public void setAwayTeam(String awayTeam) {
	this.awayTeam = awayTeam;
}

public String getMatchResult() {
	return matchResult;
}

public void setMatchResult(String matchResult) {
	this.matchResult = matchResult;
}

@Override
public String toString() {
	return "Result [matchId=" + matchId + ", matchNumber=" + matchNumber + ", date=" + date + ", time=" + time
			+ ", day=" + day + ", homeTeam=" + homeTeam + ", awayTeam=" + awayTeam + ", matchResult=" + matchResult
			+ "]";
}
 
}