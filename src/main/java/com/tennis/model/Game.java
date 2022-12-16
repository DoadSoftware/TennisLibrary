package com.tennis.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Games")
@XmlAccessorType(XmlAccessType.FIELD)
public class Game {
	
	@XmlElement(name="gameNumber")
	private int game_number;
	
	@XmlElement(name="servingPlayer")
	private int serving_player;

	@XmlElement(name="homeScore")
	private String home_score;

	@XmlElement(name="awayScore")
	private String away_score;

	@XmlElement(name="gameStatus")
	private String game_status;
	
	@XmlElement(name="gameWinner")
	private String game_winner;

	@XmlElement(name="gameType")
	private String game_type;
	
    @XmlElementWrapper(name = "stats")
    @XmlElement(name = "stat")
    private List<Stat> stats;
	
	public Game() {
		super();
	}

	public Game(int game_number, String home_score, String away_score, String game_status, String game_type) {
		super();
		this.game_number = game_number;
		this.home_score = home_score;
		this.away_score = away_score;
		this.game_status = game_status;
		this.game_type = game_type;
	}

	public List<Stat> getStats() {
		return stats;
	}

	public void setStats(List<Stat> stats) {
		this.stats = stats;
	}

	public String getGame_type() {
		return game_type;
	}

	public void setGame_type(String game_type) {
		this.game_type = game_type;
	}

	public int getServing_player() {
		return serving_player;
	}

	public void setServing_player(int serving_player) {
		this.serving_player = serving_player;
	}

	public String getGame_status() {
		return game_status;
	}

	public void setGame_status(String game_status) {
		this.game_status = game_status;
	}

	public int getGame_number() {
		return game_number;
	}

	public void setGame_number(int game_number) {
		this.game_number = game_number;
	}

	public String getHome_score() {
		return home_score;
	}

	public void setHome_score(String home_score) {
		this.home_score = home_score;
	}

	public String getAway_score() {
		return away_score;
	}

	public void setAway_score(String away_score) {
		this.away_score = away_score;
	}

	public String getGame_winner() {
		return game_winner;
	}

	public void setGame_winner(String game_winner) {
		this.game_winner = game_winner;
	}

	@Override
	public String toString() {
		return "Game [game_number=" + game_number + ", serving_player=" + serving_player + ", home_score=" + home_score
				+ ", away_score=" + away_score + ", game_status=" + game_status + ", game_winner=" + game_winner
				+ ", game_type=" + game_type + "]";
	}

}
