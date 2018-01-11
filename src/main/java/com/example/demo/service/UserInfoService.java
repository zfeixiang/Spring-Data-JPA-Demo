package com.example.demo.service;

import java.util.List;

import com.example.demo.model.UserInfo;

public interface UserInfoService {

	UserInfo findById(Integer id);
	
	UserInfo add(UserInfo ui);
	
	UserInfo update(UserInfo ui);

	void delete(UserInfo ui);
	
	void deleteById(Integer id);
	
	List<UserInfo> findByUsernameAndQq(String username,String qq);
	
	List<UserInfo> findByUsernameOrQq(String username,String qq);

	List<UserInfo> findAll();
}
