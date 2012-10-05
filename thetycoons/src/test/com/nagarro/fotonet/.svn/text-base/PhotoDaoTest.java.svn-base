package com.nagarro.fotonet;


import static org.junit.Assert.assertEquals;

import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.nagarro.fotonet.dao.PhotoDao;
import com.nagarro.fotonet.dao.UserDao;
import com.nagarro.fotonet.entity.Photo;
import com.nagarro.fotonet.entity.User;

/**
 * 
 * @author shalini1814
 *
 */
public class PhotoDaoTest extends FotonetTestBase {
	
	@Autowired
	private PhotoDao photoDao;
	@Autowired
	private UserDao userDao;
	
	User sampleUser; 
	Photo samplePhoto1; 
	Photo samplePhoto2; 
	
	@Before
	public void init() {
		
		sampleUser = new User("shalini");
		userDao.makePersistent(sampleUser, false);
		
		samplePhoto1 = new Photo("abc.jpg", sampleUser, "abc/path", 1, new Date());
		samplePhoto2 = new Photo("def.jpg", sampleUser, "def/path", 1, new Date());
	}
	
	@Test
	public void persistPhotoTest() {
		assertEquals("Result", samplePhoto1, photoDao.makePersistent(samplePhoto1, false));
	}
	
	@Test
	public void getPhotosByUploaderTest(){
		photoDao.makePersistent(samplePhoto1, false);
		photoDao.makePersistent(samplePhoto2, false);
		assertEquals(2, photoDao.getPhotosByUploader(sampleUser).size());
	}
	
}
