package edu.training.web.dao;

import edu.training.web.bean.AuthInfo;
import edu.training.web.bean.User;

public interface AuthDao {
	User checkToken(String token) throws DaoException;

	User signIn(AuthInfo info) throws DaoException;

}
