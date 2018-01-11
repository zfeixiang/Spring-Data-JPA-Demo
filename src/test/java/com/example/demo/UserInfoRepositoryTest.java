package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.model.UserInfo;
import com.example.demo.repository.UserInfoRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
@Import(DemoApplication.class)
public class UserInfoRepositoryTest {

	@Autowired
    private UserInfoRepository userInfoRepository;
    
    @Test
    public void baseTest() throws Exception {
        UserInfo user = new UserInfo();
        user.setUsername("Jay");
        user.setPassword("123456");
        user = userInfoRepository.save(user);
        System.out.println(user.toString());;
    }
}
