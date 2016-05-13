package com.pany.dao;

import static org.junit.Assert.fail;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.pany.po.Student;
import com.pany.util.HibernateSessionFactory;

public class DaoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsert() {
		
		Student stu = new Student("jack","game","desc");
		
		Dao dao = new Dao();
		dao.insert(stu);

		
	}

	@Test
	public void testFind() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testEdit() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveOrUpdate() {
		fail("Not yet implemented");
	}

}
