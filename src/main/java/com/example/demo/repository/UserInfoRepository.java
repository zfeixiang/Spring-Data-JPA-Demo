package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.UserInfo;

public interface UserInfoRepository extends BaseRepository<UserInfo, Integer> {

	List<UserInfo> findByUsernameAndQq(String username,String qq);
	
	List<UserInfo> findByUsernameOrQq(String username,String qq);
}
