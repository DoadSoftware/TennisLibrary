package com.tennis.dao;

import java.util.List;

import com.tennis.model.Player;

public interface TennisDao {
  Player getPlayer(int player_id);
  List<Player> getAllPlayer();
}