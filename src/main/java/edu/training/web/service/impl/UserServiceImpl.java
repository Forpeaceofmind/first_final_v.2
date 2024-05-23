package edu.training.web.service.impl;

import edu.training.web.bean.AuthInfo;
import edu.training.web.bean.Profile;
import edu.training.web.bean.User;
import edu.training.web.bean.UserRegInfo;
import edu.training.web.dao.AuthDao;
import edu.training.web.dao.DaoException;
import edu.training.web.dao.DaoProvider;
import edu.training.web.service.UserService;

public class UserServiceImpl implements UserService {
	private AuthDao authDao = DaoProvider.getInstance().getAuthDao();

	@Override
	public User signIn(AuthInfo authInfo) throws ServiceException{
		try {
			User user = authDao.signIn(authInfo);
			return user;
		}catch(DaoException e) {
			throw new ServiceException(e);}
		}
	@Override
	public User rememberMe(String token) throws ServiceException {
		try {
			User user = authDao.checkToken(token);
			return user;
		}catch(DaoException e) {
			throw new ServiceException(e);
		}

	}

	@Override
	public boolean registration(UserRegInfo regInfo)  {
		return false;
	}

	@Override
	public boolean blockUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Profile userProfile(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
