package com.example.demo.service;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserInfo;
import com.example.demo.repository.UserInfoRepository;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoRepository userInfoRepository;

	@Override
	public UserInfo add(UserInfo ui) {
		return userInfoRepository.save(ui);
	}

	@Override
	public UserInfo update(UserInfo ui) {
		return userInfoRepository.save(ui);
	}
	
	@Override
	public void delete(UserInfo ui) {
		userInfoRepository.delete(ui);
	}

	@Override
	public void deleteById(Integer id) {
		userInfoRepository.delete(id);
	}

	@Override
	public UserInfo findById(Integer id) {
		return userInfoRepository.findOne(id);
	}

	@Override
	public List<UserInfo> findByUsernameAndQq(String username, String qq) {
		return userInfoRepository.findByUsernameAndQq(username, qq);
	}

	@Override
	public List<UserInfo> findByUsernameOrQq(String username,String qq) {
		return userInfoRepository.findByUsernameOrQq(username,qq);
	}
	
	@Override
	public List<UserInfo> findAll() {
//		return userInfoRepository.findAll(new Sort(Direction.DESC,"id"));
		
//		Page<UserInfo> uis = userInfoRepository.findAll(new PageRequest(1, 10));
//		return uis.getContent();
		
		return userInfoRepository.findAll(new Specification<UserInfo>() {
			@Override
			public Predicate toPredicate(Root<UserInfo> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				//等效于select * from user_info ui where ui.username='Jay' and ui.usertype='1'
				Path<String> exp1 = root.get("username");
				Path<String> exp2 = root.get("usertype");
				Predicate predicate = cb.and(cb.equal(exp1, "Jay"),cb.equal(exp2, "1"));
				return predicate;
			}
		});
	}
}
