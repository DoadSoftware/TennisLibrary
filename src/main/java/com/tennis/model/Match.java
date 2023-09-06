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

  @XmlElement(name = "tieBreakerRule")
  private String tieBreakerRule;

  @XmlElement(name = "advantageRule")
  private String advantageRule;
  
  @XmlElement(name = "matchStatus")
  private String matchStatus;
  
  @XmlElement(name = "matchFileName")
  private String matchFileName;

  @XmlElement(name = "tournament")
  private String tournament;

  @XmlElement(name = "matchIdent")
  private String matchIdent;
  
  @XmlElement(name = "categoryType")
  private String categoryType;
  
  @XmlElement(name = "matchType")
  private String matchType;
  
  @XmlElement(name = "matchId")
  private String matchId;

  @XmlElement(name = "homeFirstPlayerId")
  private int homeFirstPlayerId;

  @XmlElement(name = "homeSecondPlayerId")
  private int homeSecondPlayerId;

  @XmlElement(name = "awayFirstPlayerId")
  private int awayFirstPlayerId;

  @XmlElement(name = "awaySecondPlayerId")
  private int awaySecondPlayerId;
  
  @XmlElement(name = "retiredHurtPlayerId")
  private int retiredHurtPlayerId;

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
  
  @XmlElement(name = "clock")
  private Clock clock;
  
  @XmlTransient
  private List<Event> events;

public String getAdvantageRule() {
	return advantageRule;
}

public void setAdvantageRule(String advantageRule) {
	this.advantageRule = advantageRule;
}

public String getTieBreakerRule() {
	return tieBreakerRule;
}

public void setTieBreakerRule(String tieBreakerRule) {
	this.tieBreakerRule = tieBreakerRule;
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

public Clock getClock() {
	return clock;
}

public void setClock(Clock clock) {
	this.clock = clock;
}

public String getCategoryType() {
	return categoryType;
}

public void setCategoryType(String categoryType) {
	this.categoryType = categoryType;
}

public String getMatchId() {
	return matchId;
}

public void setMatchId(String matchId) {
	this.matchId = matchId;
}

public int getRetiredHurtPlayerId() {
	return retiredHurtPlayerId;
}

public void setRetiredHurtPlayerId(int retiredHurtPlayerId) {
	this.retiredHurtPlayerId = retiredHurtPlayerId;
}

@Override
public String toString() {
	return "Match [matchFileTimeStamp=" + matchFileTimeStamp + ", matchResult=" + matchResult + ", tieBreakerRule="
			+ tieBreakerRule + ", advantageRule=" + advantageRule + ", matchStatus=" + matchStatus + ", matchFileName="
			+ matchFileName + ", tournament=" + tournament + ", matchIdent=" + matchIdent + ", categoryType="
			+ categoryType + ", matchType=" + matchType + ", matchId=" + matchId + ", homeFirstPlayerId="
			+ homeFirstPlayerId + ", homeSecondPlayerId=" + homeSecondPlayerId + ", awayFirstPlayerId="
			+ awayFirstPlayerId + ", awaySecondPlayerId=" + awaySecondPlayerId + ", retiredHurtPlayerId="
			+ retiredHurtPlayerId + ", sets=" + sets + ", homeFirstPlayer=" + homeFirstPlayer + ", homeSecondPlayer="
			+ homeSecondPlayer + ", awayFirstPlayer=" + awayFirstPlayer + ", awaySecondPlayer=" + awaySecondPlayer
			+ ", clock=" + clock + ", events=" + events + "]";
}

}