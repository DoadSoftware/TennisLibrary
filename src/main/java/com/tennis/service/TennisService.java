package com.tennis.service;

import java.util.List;
import com.tennis.model.Player;

public interface TennisService {
  Player getPlayer(int player_id);
  List<Player> getAllPlayer();
}