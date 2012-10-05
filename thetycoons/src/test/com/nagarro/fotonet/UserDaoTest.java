package com.nagarro.fotonet;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.fotonet.dao.UserDao;
import com.nagarro.fotonet.entity.User;

public class UserDaoTest extends FotonetTestBase {

	@Autowired
	private UserDao userDao;
	
	User sampleUser1;
	User sampleUser2;
	
	@Before
	public void init() {
		sampleUser1 = new User("user1");
		sampleUser2 = new User("user2");
	}
	
	@Test
	public void persistUserTest() {
		assertEquals("Result", sampleUser1, userDao.makePersistent(sampleUser1, false));
	}
	
	@Test
	public void getUserByUsernameTest(){
		
		assertEquals("Result", sampleUser2, userDao.makePersistent(sampleUser2, false));
		assertEquals("Result", sampleUser2, userDao.getUser("user2"));
	}
	
}
