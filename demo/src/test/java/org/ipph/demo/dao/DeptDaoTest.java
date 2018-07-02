package org.ipph.demo.dao;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.ipph.demo.dao.DeptDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeptDaoTest {
	
	@Resource
	private DeptDao deptDao;
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
