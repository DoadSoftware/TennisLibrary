package com.tennis.dao.impl;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.tennis.dao.TennisDao;
import com.tennis.model.Fixture;
import com.tennis.model.NameSuper;
import com.tennis.model.Player;
import com.tennis.model.VariousText;

@Transactional
@Repository("tennisDao")
public class TennisDaoImpl implements TennisDao {

 @Autowired
 private SessionFactory sessionFactory;
 
@Override
public Player getPlayer(int player_id) {
	return (Player) sessionFactory.getCurrentSession().createQuery(
			"from Player WHERE PlayerId=" + player_id).uniqueResult();  
}

@SuppressWarnings("unchecked")
@Override
public List<Player> getAllPlayer() {
	return sessionFactory.getCurrentSession().createQuery("from Player").list();
}

@SuppressWarnings("unchecked")
@Override
public List<NameSuper> getNameSupers() {
	return sessionFactory.getCurrentSession().createQuery("from NameSuper").list();
}

@SuppressWarnings("unchecked")
@Override
public List<Fixture> getFixtures() {
	return sessionFactory.getCurrentSession().createQuery("from Fixture").list();
}

@SuppressWarnings("unchecked")
@Override
public List<VariousText> getVariousTexts() {
	return sessionFactory.getCurrentSession().createQuery("from VariousText").list();
}

}