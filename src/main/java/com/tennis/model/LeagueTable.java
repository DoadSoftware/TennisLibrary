package com.tennis.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="LeagueTable")
@XmlAccessorType(XmlAccessType.FIELD)
public class LeagueTable {
	
	@XmlElementWrapper(name = "LeagueTeams")
	  @XmlElement(name = "LeagueTeam")
	  private List<LeagueTable> LeagueTeams;

	public List<LeagueTable> getLeagueTeams() {
		return LeagueTeams;
	}

	public void setLeagueTeams(List<LeagueTable> leagueTeams) {
		LeagueTeams = leagueTeams;
	}

}

