package com.sl.pmp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sl.pmp.dao.LoginDao;
import com.sl.pmp.entity.User;
import com.sl.pmp.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
	 
	@Autowired
	public LoginDao  loginDao;

	@Override
	public User findUserByName(String username) {
		// TODO Auto-generated method stub
		return  loginDao.findUserByName(username);
	}
	 

}
