package com.sl.pmp.dao;

import org.apache.ibatis.annotations.Mapper;

import com.sl.pmp.entity.User;

@Mapper
public interface LoginDao {
	User findUserByName(String username);
}
