package com.tennis.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

import com.tennis.model.Fixture;
import com.tennis.model.Game;
import com.tennis.model.Match;
import com.tennis.model.Player;
import com.tennis.model.Set;
import com.tennis.model.Stat;
import com.tennis.service.TennisService;

public class TennisFunctions {
	
	public static List<Fixture> processAllFixtures(TennisService tennisService) {
		List<Fixture> fixtures = tennisService.getFixtures();
		for(Player plyr : tennisService.getAllPlayer()) {
			for(Fixture fix : fixtures) {
				if(fix.getHomePlayerFirst() == plyr.getPlayerId()) {
					fix.setHome_FirstPlayer(plyr);
				}
				if(fix.getAwayPlayerFirst() == plyr.getPlayerId()) {
					fix.setAway_FirstPlayer(plyr);
				}
				if(fix.getHomePlayerSecond() != null) {
					if(fix.getHomePlayerSecond() == plyr.getPlayerId()) {
						fix.setHome_SecondPlayer(plyr);
					}
				}
				if(fix.getAwayPlayerSecond() != null) {
					if(fix.getAwayPlayerSecond() == plyr.getPlayerId()) {
						fix.setAway_SecondPlayer(plyr);
					}
				}
			}
		}
		return fixtures;
	}
	
	public static Match processStats(Match match, String whatToProcess) 
	{
		ListIterator<Stat> this_stats_itr;
		Stat this_stat;
		
		for(Set set : match.getSets()) {
			if(set.getSet_status().equalsIgnoreCase(TennisUtil.START)) {
				for(Game game : set.getGames()) {
					if(game.getGame_status().equalsIgnoreCase(TennisUtil.START)) {
						if(whatToProcess.toUpperCase().contains(TennisUtil.INCREMENT)) {
							this_stats_itr = game.getStats().listIterator();
							if(whatToProcess.toUpperCase().contains(TennisUtil.HOME)) {
								if(whatToProcess.toUpperCase().contains("_" + TennisUtil.FIRST + "_")) {
									this_stats_itr.add(new Stat(game.getStats().size() + 1, 
										whatToProcess.split(",")[0].split("_")[0], match.getHomeFirstPlayerId()));
								}else if(whatToProcess.toUpperCase().contains("_" + TennisUtil.SECOND + "_")) {
									this_stats_itr.add(new Stat(game.getStats().size() + 1, 
										whatToProcess.split(",")[0].split("_")[0], match.getHomeSecondPlayerId()));
								}
							}else if(whatToProcess.toUpperCase().contains(TennisUtil.AWAY)) {
								if(whatToProcess.toUpperCase().contains("_" + TennisUtil.FIRST + "_")) {
									this_stats_itr.add(new Stat(game.getStats().size() + 1, whatToProcess.split(",")[0].split("_")[0], 
										match.getAwayFirstPlayerId()));
								}else if(whatToProcess.toUpperCase().contains("_" + TennisUtil.SECOND + "_")) {
									this_stats_itr.add(new Stat(game.getStats().size() + 1, whatToProcess.split(",")[0].split("_")[0], 
										match.getAwaySecondPlayerId()));
								}
							}
						} else if(whatToProcess.toUpperCase().contains(TennisUtil.DECREMENT)) {
							this_stats_itr = game.getStats().listIterator(game.getStats().size());
							while(this_stats_itr.hasPrevious()) {
								this_stat = this_stats_itr.previous();
								if(this_stat.getStatType().equalsIgnoreCase(whatToProcess.split(",")[0].split("_")[0])) {
									if(whatToProcess.toUpperCase().contains(TennisUtil.HOME)) {
										if(whatToProcess.toUpperCase().contains("_" + TennisUtil.FIRST + "_")) {
											if(this_stat.getPlayerId() == match.getHomeFirstPlayerId()) {
												this_stats_itr.remove();
											}
										}else if(whatToProcess.toUpperCase().contains("_" + TennisUtil.SECOND + "_")) {
											if(this_stat.getPlayerId() == match.getHomeSecondPlayerId()) {
												this_stats_itr.remove();
											}
										}
									}else if(whatToProcess.toUpperCase().contains(TennisUtil.AWAY)) {
										if(whatToProcess.toUpperCase().contains("_" + TennisUtil.FIRST + "_")) {
											if(this_stat.getPlayerId() == match.getAwayFirstPlayerId()) {
												this_stats_itr.remove();
											}
										}else if(whatToProcess.toUpperCase().contains("_" + TennisUtil.SECOND + "_")) {
											if(this_stat.getPlayerId() == match.getAwaySecondPlayerId()) {
												this_stats_itr.remove();
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return match;
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
