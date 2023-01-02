package com.tennis.model;

public class Stats{

  private int home_ace;
  private int away_ace;
  private int home_double_fault;
  private int away_double_fault;

public Stats() {
	super();
}

public int getHome_ace() {
	return home_ace;
}

public void setHome_ace(int home_ace) {
	this.home_ace = home_ace;
}

public int getAway_ace() {
	return away_ace;
}

public void setAway_ace(int away_ace) {
	this.away_ace = away_ace;
}

public int getHome_double_fault() {
	return home_double_fault;
}

public void setHome_double_fault(int home_double_fault) {
	this.home_double_fault = home_double_fault;
}

public int getAway_double_fault() {
	return away_double_fault;
}

public void setAway_double_fault(int away_double_fault) {
	this.away_double_fault = away_double_fault;
}




}