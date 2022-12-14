package com.tennis.dao;

import java.util.List;

import com.tennis.model.Fixture;
import com.tennis.model.NameSuper;
import com.tennis.model.Player;
import com.tennis.model.VariousText;

public interface TennisDao {
  Player getPlayer(int player_id);
  List<Player> getAllPlayer();
  List<NameSuper> getNameSupers();
  List<Fixture> getFixtures();
  List<VariousText> getVariousTexts();
}