package edu.training.web.dao;


import edu.training.web.bean.User;
import edu.training.web.bean.UserRegInfo;

public interface UserRegDao {
	User signUp(UserRegInfo info) throws DaoException;

}
