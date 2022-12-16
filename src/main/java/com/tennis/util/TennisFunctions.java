package com.tennis.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import com.tennis.model.Match;
import com.tennis.model.Stat;
import com.tennis.service.TennisService;

public class TennisFunctions {

	public static List<Stat> processStats(List<Stat> stats, String whatToProcess) 
	{
		ListIterator<Stat> this_stats_itr;
		String stats_type = "";
		if(whatToProcess.toUpperCase().contains(TennisUtil.ACE)) {
			stats_type = TennisUtil.ACE;
		}
		
		if(whatToProcess.toUpperCase().contains(TennisUtil.INCREMENT)) {
			stats.add(new Stat(stats.size() + 1, stats_type, 
					Integer.valueOf(whatToProcess.split(",")[1])));
		} else if(whatToProcess.toUpperCase().contains(TennisUtil.DECREMENT)) {
			this_stats_itr = stats.listIterator(stats.size());
			if(this_stats_itr.hasPrevious()) {
				if(this_stats_itr.previous().getStatType().equalsIgnoreCase(stats_type)) {
					this_stats_itr.remove();
				}
			}
		}

		return stats;
		
	}
	
	public static String processScore(Match match, int set_id, int game_id, String which_team, String increment_or_decrement)
	{
		switch (increment_or_decrement.toUpperCase()) {
		case TennisUtil.INCREMENT:
			
			switch (which_team.toUpperCase()) {
			case TennisUtil.HOME:
				switch (match.getSets().get(set_id).getGames().get(game_id).getGame_type().toUpperCase()) {
				case TennisUtil.NORMAL:
					switch (match.getSets().get(set_id).getGames().get(game_id).getHome_score().toUpperCase()) {
					case TennisUtil.LOVE:
						return TennisUtil.FIFTEEN;
					case TennisUtil.FIFTEEN:
						return TennisUtil.THIRTY;
					case TennisUtil.THIRTY:
						return TennisUtil.FORTY;
					case TennisUtil.FORTY:
						switch (match.getSets().get(set_id).getGames().get(game_id).getAway_score().toUpperCase()) {
						case TennisUtil.FORTY: case TennisUtil.ADVANTAGE:
							return TennisUtil.ADVANTAGE;
						default:
							return TennisUtil.GAME;
						}
					case TennisUtil.ADVANTAGE:
						return TennisUtil.GAME;
					default:
						return TennisUtil.LOVE;
					}
				case TennisUtil.TIE_BREAK:
					return String.valueOf(Integer.valueOf(match.getSets().get(set_id).getGames().get(game_id).getHome_score()) + 1);
				}
				break;
			case TennisUtil.AWAY:
				switch (match.getSets().get(set_id).getGames().get(game_id).getGame_type().toUpperCase()) {
				case TennisUtil.NORMAL:
					switch (match.getSets().get(set_id).getGames().get(game_id).getAway_score().toUpperCase()) {
					case TennisUtil.LOVE:
						return TennisUtil.FIFTEEN;
					case TennisUtil.FIFTEEN:
						return TennisUtil.THIRTY;
					case TennisUtil.THIRTY:
						return TennisUtil.FORTY;
					case TennisUtil.FORTY:
						switch (match.getSets().get(set_id).getGames().get(game_id).getHome_score().toUpperCase()) {
						case TennisUtil.FORTY: case TennisUtil.ADVANTAGE:
							return TennisUtil.ADVANTAGE;
						default:
							return TennisUtil.GAME;
						}
					case TennisUtil.ADVANTAGE:
						return TennisUtil.GAME;
					default:
						return TennisUtil.LOVE;
					}
				case TennisUtil.TIE_BREAK:
					return String.valueOf(Integer.valueOf(match.getSets().get(set_id).getGames().get(game_id).getAway_score()) + 1);
				}
				break;
			}
			
		case TennisUtil.DECREMENT:
			
			switch (which_team.toUpperCase()) {
			case TennisUtil.HOME:
				
				switch (match.getSets().get(set_id).getGames().get(game_id).getGame_type().toUpperCase()) {
				case TennisUtil.NORMAL:
					switch (match.getSets().get(set_id).getGames().get(game_id).getHome_score().toUpperCase()) {
					case TennisUtil.FIFTEEN:
						return TennisUtil.LOVE;
					case TennisUtil.THIRTY:
						return TennisUtil.FIFTEEN;
					case TennisUtil.FORTY:
						return TennisUtil.THIRTY;
					case TennisUtil.ADVANTAGE:
						return TennisUtil.FORTY;
					case TennisUtil.GAME:
						switch (match.getSets().get(set_id).getGames().get(game_id).getAway_score().toUpperCase()) {
						case TennisUtil.FORTY:
							return TennisUtil.ADVANTAGE;
						default:
							return TennisUtil.FORTY;
						}
					default:
						return TennisUtil.LOVE;
					}
				case TennisUtil.TIE_BREAK:
					if(Integer.valueOf(match.getSets().get(set_id).getGames().get(game_id).getHome_score()) - 1 < 0) {
						return String.valueOf(0);
					} else {
						return String.valueOf(Integer.valueOf(match.getSets().get(set_id).getGames().get(game_id).getHome_score()) - 1);
					}
				}
				break;

			case TennisUtil.AWAY:
				
				switch (match.getSets().get(set_id).getGames().get(game_id).getGame_type().toUpperCase()) {
				case TennisUtil.NORMAL:
					switch (match.getSets().get(set_id).getGames().get(game_id).getAway_score().toUpperCase()) {
					case TennisUtil.FIFTEEN:
						return TennisUtil.LOVE;
					case TennisUtil.THIRTY:
						return TennisUtil.FIFTEEN;
					case TennisUtil.FORTY:
						return TennisUtil.THIRTY;
					case TennisUtil.ADVANTAGE:
						return TennisUtil.FORTY;
					case TennisUtil.GAME:
						switch (match.getSets().get(set_id).getGames().get(game_id).getHome_score().toUpperCase()) {
						case TennisUtil.FORTY:
							return TennisUtil.ADVANTAGE;
						default:
							return TennisUtil.FORTY;
						}
					default:
						return TennisUtil.LOVE;
					}
				case TennisUtil.TIE_BREAK:
					if(Integer.valueOf(match.getSets().get(set_id).getGames().get(game_id).getAway_score()) - 1 < 0) {
						return String.valueOf(0);
					} else {
						return String.valueOf(Integer.valueOf(match.getSets().get(set_id).getGames().get(game_id).getAway_score()) - 1);
					}
				}
				break;
			}
		}
		switch (which_team.toUpperCase()) {
		case TennisUtil.HOME:
			return match.getSets().get(set_id).getGames().get(game_id).getHome_score();
		default:
			return match.getSets().get(set_id).getGames().get(game_id).getAway_score();
		}
	}
	public static Match populateMatchVariables(TennisService tennisService, Match match)
	{
		if(match.getHomeFirstPlayerId() > 0) {
			match.setHomeFirstPlayer(tennisService.getPlayer(match.getHomeFirstPlayerId()));
		}
		if(match.getHomeSecondPlayerId() > 0) {
			match.setHomeSecondPlayer(tennisService.getPlayer(match.getHomeSecondPlayerId()));
		}
		if(match.getAwayFirstPlayerId() > 0) {
			match.setAwayFirstPlayer(tennisService.getPlayer(match.getAwayFirstPlayerId()));
		}
		if(match.getAwaySecondPlayerId() > 0) {
			match.setAwaySecondPlayer(tennisService.getPlayer(match.getAwaySecondPlayerId()));
		}
		return match;
	}
	
	public static String getOnlineCurrentDate() throws IOException
	{
		HttpURLConnection httpCon = (HttpURLConnection) new URL("https://mail.google.com/").openConnection();
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date(httpCon.getDate()));
	}	
	
}