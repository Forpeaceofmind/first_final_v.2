package edu.training.web.dao.impl;

import edu.training.web.bean.AuthInfo;
import edu.training.web.bean.User;
import edu.training.web.dao.AuthDao;
import edu.training.web.dao.DaoException;

public class SQLAuthDao implements AuthDao {

	@Override
	public User checkToken(String token) throws DaoException {
		/*
		try {
			
		}catch(SQLException e) {
			throw new DaoException(e);
		}
		*/
		return new User("Olga", "admin");
	}

	@Override
	public User signIn(AuthInfo info) throws DaoException {
		// stub code
		if("user@mail.ru".equals(info.getLogin())) {
			return new User("Olga", "admin");
		}
		return null;
		
	}
}
