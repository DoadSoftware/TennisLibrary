package com.tennis.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Sets")
@XmlAccessorType(XmlAccessType.FIELD)
public class Set {
	
	@XmlElement(name="setNumber")
	private int set_number;

	@XmlElement(name="setStatus")
	private String set_status;
	
	@XmlElement(name="setWinner")
	private String set_winner;

    @XmlElementWrapper(name = "games")
    @XmlElement(name = "game")
    private List<Game> games;

	public Set(int set_number, String set_status, List<Game> games) {
		super();
		this.set_number = set_number;
		this.set_status = set_status;
		this.games = games;
	}

	public Set() {
		super();
	}

	public String getSet_status() {
		return set_status;
	}

	public void setSet_status(String set_status) {
		this.set_status = set_status;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}

	public int getSet_number() {
		return set_number;
	}

	public void setSet_number(int set_number) {
		this.set_number = set_number;
	}

	public String getSet_winner() {
		return set_winner;
	}

	public void setSet_winner(String set_winner) {
		this.set_winner = set_winner;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}

	@Override
	public String toString() {
		return "Set [set_number=" + set_number + ", set_status=" + set_status + ", set_winner=" + set_winner
				+ ", games=" + games + "]";
	}

}
