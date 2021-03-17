package org.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.cg.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentWebProjectApplicationTests {

	@Autowired
	StudentService sService;
	
	@Test
	void contextLoads() {
		assertEquals("Jaya Sree",sService.getStudentById(104).getName());
	}
	
	@Test
	void contextLoads1() {
		assertEquals(102, sService.getStudentByName("Nihan").get(0).getSid());
	}

}
