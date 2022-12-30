package com.tennis.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Column;

@Entity
@Table(name = "Fixtures")
public class Fixture {

  @Id
  @Column(name = "MATCHNUMBER")
  private int matchnumber;
  
  @Column(name = "MatchFileName")
  private String matchfilename;
  
  @Column(name = "Date")
  private String date;
  
  @Column(name = "Categary")
  private String categary;
  
  @Column(name = "TypeOfMatch")
  private String typeOfMatch;
  
  @Column(name = "Day")
  private int day;
  
  @Column(name = "HomePlayerFirst")
  private Integer homePlayerFirst;
  
  @Column(name = "HomePlayerSecond")
  private Integer homePlayerSecond;
  
  @Column(name = "AwayPlayerFirst")
  private Integer awayPlayerFirst;
  
  @Column(name = "AwayPlayerSecond")
  private Integer awayPlayerSecond;
  
  @Transient
  private Player home_FirstPlayer;
  
  @Transient
  private Player home_SecondPlayer;
  
  @Transient
  private Player away_FirstPlayer;
  
  @Transient
  private Player away_SecondPlayer;

public Fixture() {
	super();
}

public Fixture(int matchnumber) {
	super();
	this.matchnumber = matchnumber;
}

public int getMatchnumber() {
	return matchnumber;
}

public void setMatchnumber(int matchnumber) {
	this.matchnumber = matchnumber;
}

public String getMatchfilename() {
	return matchfilename;
}

public void setMatchfilename(String matchfilename) {
	this.matchfilename = matchfilename;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

public Integer getHomePlayerFirst() {
	return homePlayerFirst;
}

public void setHomePlayerFirst(Integer homePlayerFirst) {
	this.homePlayerFirst = homePlayerFirst;
}

public Integer getHomePlayerSecond() {
	return homePlayerSecond;
}

public void setHomePlayerSecond(Integer homePlayerSecond) {
	this.homePlayerSecond = homePlayerSecond;
}

public Integer getAwayPlayerFirst() {
	return awayPlayerFirst;
}

public void setAwayPlayerFirst(Integer awayPlayerFirst) {
	this.awayPlayerFirst = awayPlayerFirst;
}

public Integer getAwayPlayerSecond() {
	return awayPlayerSecond;
}

public void setAwayPlayerSecond(Integer awayPlayerSecond) {
	this.awayPlayerSecond = awayPlayerSecond;
}

public String getCategary() {
	return categary;
}

public void setCategary(String categary) {
	this.categary = categary;
}

public String getTypeOfMatch() {
	return typeOfMatch;
}

public void setTypeOfMatch(String typeOfMatch) {
	this.typeOfMatch = typeOfMatch;
}

public Player getHome_FirstPlayer() {
	return home_FirstPlayer;
}

public void setHome_FirstPlayer(Player home_FirstPlayer) {
	this.home_FirstPlayer = home_FirstPlayer;
}

public Player getHome_SecondPlayer() {
	return home_SecondPlayer;
}

public void setHome_SecondPlayer(Player home_SecondPlayer) {
	this.home_SecondPlayer = home_SecondPlayer;
}

public Player getAway_FirstPlayer() {
	return away_FirstPlayer;
}

public void setAway_FirstPlayer(Player away_FirstPlayer) {
	this.away_FirstPlayer = away_FirstPlayer;
}

public Player getAway_SecondPlayer() {
	return away_SecondPlayer;
}

public void setAway_SecondPlayer(Player away_SecondPlayer) {
	this.away_SecondPlayer = away_SecondPlayer;
}

}