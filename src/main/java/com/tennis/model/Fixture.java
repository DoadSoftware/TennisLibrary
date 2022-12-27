package com.tennis.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
  
  @Column(name = "Day")
  private int day;
  
  @Column(name = "HomePlayerFirst")
  private int homePlayerFirst;
  
  @Column(name = "HomePlayerSecond")
  private int homePlayerSecond;
  
  @Column(name = "AwayPlayerFirst")
  private int awayPlayerFirst;
  
  @Column(name = "AwayPlayerSecond")
  private int awayPlayerSecond;

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

public int getHomePlayerFirst() {
	return homePlayerFirst;
}

public void setHomePlayerFirst(int homePlayerFirst) {
	this.homePlayerFirst = homePlayerFirst;
}

public int getHomePlayerSecond() {
	return homePlayerSecond;
}

public void setHomePlayerSecond(int homePlayerSecond) {
	this.homePlayerSecond = homePlayerSecond;
}

public int getAwayPlayerFirst() {
	return awayPlayerFirst;
}

public void setAwayPlayerFirst(int awayPlayerFirst) {
	this.awayPlayerFirst = awayPlayerFirst;
}

public int getAwayPlayerSecond() {
	return awayPlayerSecond;
}

public void setAwayPlayerSecond(int awayPlayerSecond) {
	this.awayPlayerSecond = awayPlayerSecond;
}

}