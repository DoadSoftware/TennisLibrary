package com.tennis.model;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="Match")
@XmlAccessorType(XmlAccessType.FIELD)
public class Match {

  @XmlElement(name = "matchFileTimeStamp")
  private String matchFileTimeStamp;

  @XmlElement(name = "matchResult")
  private String matchResult;

  @XmlElement(name = "tierBreakerRule")
  private String tierBreakerRule;
  
  @XmlElement(name = "matchStatus")
  private String matchStatus;
  
  @XmlElement(name = "matchFileName")
  private String matchFileName;

  @XmlElement(name = "tournament")
  private String tournament;

  @XmlElement(name = "matchIdent")
  private String matchIdent;
  
  @XmlElement(name = "matchType")
  private String matchType;

  @XmlElement(name = "homeFirstPlayerId")
  private int homeFirstPlayerId;

  @XmlElement(name = "homeSecondPlayerId")
  private int homeSecondPlayerId;

  @XmlElement(name = "awayFirstPlayerId")
  private int awayFirstPlayerId;

  @XmlElement(name = "awaySecondPlayerId")
  private int awaySecondPlayerId;

  @XmlElementWrapper(name = "sets")
  @XmlElement(name = "set")
  private List<Set> sets;
  
  @XmlTransient
  private Player homeFirstPlayer;

  @XmlTransient
  private Player homeSecondPlayer;
  
  @XmlTransient
  private Player awayFirstPlayer;

  @XmlTransient
  private Player awaySecondPlayer;
  
  @XmlTransient
  private List<Event> events;

public String getTierBreakerRule() {
	return tierBreakerRule;
}

public void setTierBreakerRule(String tierBreakerRule) {
	this.tierBreakerRule = tierBreakerRule;
}

public String getMatchFileTimeStamp() {
	return matchFileTimeStamp;
}

public void setMatchFileTimeStamp(String matchFileTimeStamp) {
	this.matchFileTimeStamp = matchFileTimeStamp;
}

public String getMatchResult() {
	return matchResult;
}

public void setMatchResult(String matchResult) {
	this.matchResult = matchResult;
}

public String getMatchStatus() {
	return matchStatus;
}

public void setMatchStatus(String matchStatus) {
	this.matchStatus = matchStatus;
}

public String getMatchFileName() {
	return matchFileName;
}

public void setMatchFileName(String matchFileName) {
	this.matchFileName = matchFileName;
}

public String getTournament() {
	return tournament;
}

public void setTournament(String tournament) {
	this.tournament = tournament;
}

public String getMatchIdent() {
	return matchIdent;
}

public void setMatchIdent(String matchIdent) {
	this.matchIdent = matchIdent;
}

public String getMatchType() {
	return matchType;
}

public void setMatchType(String matchType) {
	this.matchType = matchType;
}

public int getHomeFirstPlayerId() {
	return homeFirstPlayerId;
}

public void setHomeFirstPlayerId(int homeFirstPlayerId) {
	this.homeFirstPlayerId = homeFirstPlayerId;
}

public int getHomeSecondPlayerId() {
	return homeSecondPlayerId;
}

public void setHomeSecondPlayerId(int homeSecondPlayerId) {
	this.homeSecondPlayerId = homeSecondPlayerId;
}

public int getAwayFirstPlayerId() {
	return awayFirstPlayerId;
}

public void setAwayFirstPlayerId(int awayFirstPlayerId) {
	this.awayFirstPlayerId = awayFirstPlayerId;
}

public int getAwaySecondPlayerId() {
	return awaySecondPlayerId;
}

public void setAwaySecondPlayerId(int awaySecondPlayerId) {
	this.awaySecondPlayerId = awaySecondPlayerId;
}

public List<Set> getSets() {
	return sets;
}

public void setSets(List<Set> sets) {
	this.sets = sets;
}

public Player getHomeFirstPlayer() {
	return homeFirstPlayer;
}

public void setHomeFirstPlayer(Player homeFirstPlayer) {
	this.homeFirstPlayer = homeFirstPlayer;
}

public Player getHomeSecondPlayer() {
	return homeSecondPlayer;
}

public void setHomeSecondPlayer(Player homeSecondPlayer) {
	this.homeSecondPlayer = homeSecondPlayer;
}

public Player getAwayFirstPlayer() {
	return awayFirstPlayer;
}

public void setAwayFirstPlayer(Player awayFirstPlayer) {
	this.awayFirstPlayer = awayFirstPlayer;
}

public Player getAwaySecondPlayer() {
	return awaySecondPlayer;
}

public void setAwaySecondPlayer(Player awaySecondPlayer) {
	this.awaySecondPlayer = awaySecondPlayer;
}

public List<Event> getEvents() {
	return events;
}

public void setEvents(List<Event> events) {
	this.events = events;
}

@Override
public String toString() {
	return "Match [matchFileTimeStamp=" + matchFileTimeStamp + ", matchResult=" + matchResult + ", tierBreakerRule="
			+ tierBreakerRule + ", matchStatus=" + matchStatus + ", matchFileName=" + matchFileName + ", tournament="
			+ tournament + ", matchIdent=" + matchIdent + ", matchType=" + matchType + ", homeFirstPlayerId="
			+ homeFirstPlayerId + ", homeSecondPlayerId=" + homeSecondPlayerId + ", awayFirstPlayerId="
			+ awayFirstPlayerId + ", awaySecondPlayerId=" + awaySecondPlayerId + ", sets=" + sets + ", homeFirstPlayer="
			+ homeFirstPlayer + ", homeSecondPlayer=" + homeSecondPlayer + ", awayFirstPlayer=" + awayFirstPlayer
			+ ", awaySecondPlayer=" + awaySecondPlayer + ", events=" + events + "]";
}

}