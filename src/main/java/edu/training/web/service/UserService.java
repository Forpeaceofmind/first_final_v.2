package edu.training.web.service;

import edu.training.web.bean.AuthInfo;
import edu.training.web.bean.Profile;
import edu.training.web.bean.User;
import edu.training.web.bean.UserRegInfo;
import edu.training.web.service.impl.ServiceException;

public interface UserService {

	User signIn(AuthInfo authInfo) throws ServiceException;

	boolean registration(UserRegInfo regInfo) throws ServiceException;

	boolean blockUser(int id) throws ServiceException;

	Profile userProfile(int id) throws ServiceException;
	
	User rememberMe(String token) throws ServiceException;

}
