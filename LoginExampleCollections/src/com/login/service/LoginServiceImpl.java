package com.login.service;

import java.util.Set;

import com.login.dao.LoginDaoImpl;
import com.login.dao.LoginDaoIntf;
import com.login.exception.InvaildException;
import com.login.model.Login;

public class LoginServiceImpl implements LoginServiceIntf {

	@Override
	public Login validateUser(Set<Login> loginObj) throws InvaildException {
		Login login = null;
		for (Login login1 : loginObj) {
			int id = String.valueOf(login1.getUserId()).length();
			if ((id) > 5 && login1.getPassword().length() > 5) {
				LoginDaoIntf userDaoIntf = new LoginDaoImpl();
				login1 = userDaoIntf.validateUser(login1);
				login = login1;
				return login1;
			} else {
				throw new InvaildException();
			}

		}
		return login;
	}
}
