package com.tennis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Stats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Stat {
	
	@XmlElement(name="statNumber")
	private int statNumber;

	@XmlElement(name="statType")
	private String statType;
	
	@XmlElement(name="playerId")
	private int playerId;

	public Stat() {
		super();
	}

	public Stat(int statNumber, String statType, int playerId) {
		super();
		this.statNumber = statNumber;
		this.statType = statType;
		this.playerId = playerId;
	}

	public int getStatNumber() {
		return statNumber;
	}

	public void setStatNumber(int statNumber) {
		this.statNumber = statNumber;
	}

	public String getStatType() {
		return statType;
	}

	public void setStatType(String statType) {
		this.statType = statType;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	@Override
	public String toString() {
		return "Stat [statNumber=" + statNumber + ", statType=" + statType + ", playerId=" + playerId + "]";
	}

}
