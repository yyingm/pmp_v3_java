package com.sl.pmp.service;

import com.sl.pmp.entity.User;

public interface LoginService {
	//根据用户名查找用户
	User findUserByName(String username);
}
