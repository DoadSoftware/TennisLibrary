package com.tennis.model;


public class MatchStats {
	
	private int ace;
	private int double_fault;
	private int forehand_winner;
	private int backhand_winner;
	private int serve_winner;
	private int forehand_error;
	private int backhand_error;
	private int serve_error;
	private int firstServeWon;
	private int secondServeWon;
	private int breakPointWon;

	public MatchStats() {
		super();
	}

	public int getAce() {
		return ace;
	}

	public void setAce(int ace) {
		this.ace = ace;
	}

	public int getDouble_fault() {
		return double_fault;
	}

	public void setDouble_fault(int double_fault) {
		this.double_fault = double_fault;
	}

	public int getForehand_winner() {
		return forehand_winner;
	}

	public void setForehand_winner(int forehand_winner) {
		this.forehand_winner = forehand_winner;
	}

	public int getBackhand_winner() {
		return backhand_winner;
	}

	public void setBackhand_winner(int backhand_winner) {
		this.backhand_winner = backhand_winner;
	}

	public int getServe_winner() {
		return serve_winner;
	}

	public void setServe_winner(int serve_winner) {
		this.serve_winner = serve_winner;
	}

	public int getForehand_error() {
		return forehand_error;
	}

	public void setForehand_error(int forehand_error) {
		this.forehand_error = forehand_error;
	}

	public int getBackhand_error() {
		return backhand_error;
	}

	public void setBackhand_error(int backhand_error) {
		this.backhand_error = backhand_error;
	}

	public int getServe_error() {
		return serve_error;
	}

	public void setServe_error(int serve_error) {
		this.serve_error = serve_error;
	}

	public int getFirstServeWon() {
		return firstServeWon;
	}

	public void setFirstServeWon(int firstServeWon) {
		this.firstServeWon = firstServeWon;
	}

	public int getSecondServeWon() {
		return secondServeWon;
	}

	public void setSecondServeWon(int secondServeWon) {
		this.secondServeWon = secondServeWon;
	}

	public int getBreakPointWon() {
		return breakPointWon;
	}

	public void setBreakPointWon(int breakPointWon) {
		this.breakPointWon = breakPointWon;
	}

	@Override
	public String toString() {
		return "MatchStats [ace=" + ace + ", double_fault=" + double_fault + ", forehand_winner=" + forehand_winner
				+ ", backhand_winner=" + backhand_winner + ", serve_winner=" + serve_winner + ", forehand_error="
				+ forehand_error + ", backhand_error=" + backhand_error + ", serve_error=" + serve_error
				+ ", firstServeWon=" + firstServeWon + ", secondServeWon=" + secondServeWon + ", breakPointWon="
				+ breakPointWon + "]";
	}
	
	
}
