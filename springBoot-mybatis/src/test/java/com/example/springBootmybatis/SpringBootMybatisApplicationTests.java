package com.example.springBootmybatis;

import com.example.springBootmybatis.domain.entity.UserEntity;
import com.example.springBootmybatis.domain.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void testQuery() {
		List<UserEntity> userEntities = userMapper.getAllUsers();
		System.out.println(userEntities.toString());
	}

}
