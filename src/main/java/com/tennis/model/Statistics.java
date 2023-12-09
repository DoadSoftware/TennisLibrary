package com.tennis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Statistics")
public class Statistics
{
  @Id
  @Column(name="StatisticsId")
  private int statistics_id;
  
  @Column(name="PlayerID")
  private int player_id;
  
  @Column(name="Age")
  private Integer age;
  
  @Column(name="Height")
  private Integer height;
  
  @Column(name="TurnedPro")
  private Integer turnedPro;
  
  @Column(name="BirthPlace")
  private String birthPlace;

  @Column(name="Plays")
  private String plays;
  
  @Column(name="Titles")
  private Integer titles;
  
  @Column(name="Win")
  private Integer win;
  
  @Column(name="Loss")
  private Integer loss;
  
  @Column(name="Earnings")
  private String earnings;
  
  @Column(name="BestRankingSingle")
  private Integer bestRankingSingle;
  
  @Column(name="BestRankingDouble")
  private Integer bestRankingDouble;
  
  @Column(name="BestResult1")
  private String bestResult1;
  
  @Column(name="BestResult12")
  private String bestResult2;



public String getBestResult1() {
	return bestResult1;
}

public void setBestResult1(String bestResult1) {
	this.bestResult1 = bestResult1;
}

public String getBestResult2() {
	return bestResult2;
}

public void setBestResult2(String bestResult2) {
	this.bestResult2 = bestResult2;
}

public Integer getBestRankingSingle() {
	return bestRankingSingle;
}

public void setBestRankingSingle(Integer bestRankingSingle) {
	this.bestRankingSingle = bestRankingSingle;
}

public Integer getBestRankingDouble() {
	return bestRankingDouble;
}

public void setBestRankingDouble(Integer bestRankingDouble) {
	this.bestRankingDouble = bestRankingDouble;
}


public int getStatistics_id() {
	return statistics_id;
}

public void setStatistics_id(int statistics_id) {
	this.statistics_id = statistics_id;
}

public int getPlayer_id() {
	return player_id;
}

public void setPlayer_id(int player_id) {
	this.player_id = player_id;
}

public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public Integer getHeight() {
	return height;
}

public void setHeight(Integer height) {
	this.height = height;
}

public Integer getTurnedPro() {
	return turnedPro;
}

public void setTurnedPro(Integer turnedPro) {
	this.turnedPro = turnedPro;
}

public String getBirthPlace() {
	return birthPlace;
}

public void setBirthPlace(String birthPlace) {
	this.birthPlace = birthPlace;
}

public String getPlays() {
	return plays;
}

public void setPlays(String plays) {
	this.plays = plays;
}

public Integer getTitles() {
	return titles;
}

public void setTitles(Integer titles) {
	this.titles = titles;
}

public Integer getWin() {
	return win;
}

public void setWin(Integer win) {
	this.win = win;
}

public Integer getLoss() {
	return loss;
}

public void setLoss(Integer loss) {
	this.loss = loss;
}

public String getEarnings() {
	return earnings;
}

public void setEarnings(String earnings) {
	this.earnings = earnings;
}


}