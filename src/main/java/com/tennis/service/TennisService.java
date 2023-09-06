package com.tennis.service;

import java.util.List;

import com.tennis.model.Fixture;
import com.tennis.model.NameSuper;
import com.tennis.model.Player;
import com.tennis.model.Statistics;
import com.tennis.model.VariousText;

public interface TennisService {
  Player getPlayer(int player_id);
  List<Player> getAllPlayer();
  List<NameSuper> getNameSupers();
  List<Fixture> getFixtures();
  List<VariousText> getVariousTexts();
  List<Statistics> getStatistics();
}