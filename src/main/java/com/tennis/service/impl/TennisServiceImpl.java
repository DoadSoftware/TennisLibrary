package com.tennis.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tennis.dao.TennisDao;
import com.tennis.model.Fixture;
import com.tennis.model.NameSuper;
import com.tennis.model.Player;
import com.tennis.model.VariousText;
import com.tennis.service.TennisService;

@Service("tennisService")
@Transactional
public class TennisServiceImpl implements TennisService {

 @Autowired
 private TennisDao tennisDao;
 
@Override
public Player getPlayer(int player_id) {
	return tennisDao.getPlayer(player_id);
}
@Override
public List<Player> getAllPlayer() {
	return tennisDao.getAllPlayer();
}
@Override
public List<NameSuper> getNameSupers() {
	return tennisDao.getNameSupers();
}
@Override
public List<Fixture> getFixtures() {
	return tennisDao.getFixtures();
}
@Override
public List<VariousText> getVariousTexts() {
	return tennisDao.getVariousTexts();
}

}