package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(DemoApplication.class)
public class UserInfoServiceTest {

	@Autowired
    private UserInfoService userInfoService;
	
	@Test
	public void addTest() {
		UserInfo user = new UserInfo();
        user.setUsername("Jay");
        user.setQq("123456");
        user = userInfoService.add(user);
        System.out.println(user.toString());
        
	}
	
	@Test
	public void updateTest() {
		UserInfo user = userInfoService.findById(7);
        user.setTel("5673575");
        user.setEmail("123456@qq.com");
        user = userInfoService.update(user);
        System.out.println(user.toString());
	}
	
	@Test
	public void findByUsernameAndQqTest() {
		
		List<UserInfo> uis = userInfoService.findByUsernameAndQq("Jay", "123456");
		
		for (UserInfo ui : uis) {
			System.out.println(ui.toString());
		}
	}
	
	@Test
	public void findByUsernameOrQqTest() {
		String s = "123456";
		List<UserInfo> uis = userInfoService.findByUsernameOrQq(s,s);
		
		for (UserInfo ui : uis) {
			System.out.println(ui.toString());
		}
	}
	
	@Test
	public void findAllTest() {
		List<UserInfo> uis = userInfoService.findAll();
		
		for (UserInfo ui : uis) {
			System.out.println(ui.toString());
		}
	}
	
}
