package com.tennis.dao;

import java.util.List;

import com.tennis.model.Fixture;
import com.tennis.model.NameSuper;
import com.tennis.model.Player;
import com.tennis.model.Result;
import com.tennis.model.Statistics;
import com.tennis.model.Team;
import com.tennis.model.VariousText;

public interface TennisDao {
  Player getPlayer(int player_id);
  Team getTeam(int teamId);
  List<Player> getAllPlayer();
  List<Team> getAllTeams();
  List<NameSuper> getNameSupers();
  List<Fixture> getFixtures();
  List<VariousText> getVariousTexts();
  List<Statistics> getStatistics();
  List<Result> getResults(); 
}