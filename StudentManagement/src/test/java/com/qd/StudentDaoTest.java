package com.qd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.qd.dao.StudentDao;
import com.qd.model.StudentDetails;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class StudentDaoTest {
	
	@Autowired
	private StudentDao stddao;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateRegisterUser()
	{
		StudentDetails student = new StudentDetails ();
		
		student.setStudentName("Vicky");
		student.setMobileNumber("9629403198");
		student.setAddress("RS Puram, coimbatore");
		
		
		//student.setCreatedAt(null);
		//student.setUpdatedAt(null);
		
		StudentDetails savedRegister=stddao.save(student);
		
		StudentDetails exitRegister = entityManager.find(StudentDetails.class, savedRegister.getId());
		
		assertThat(exitRegister.getMobileNumber()).isEqualTo(student.getMobileNumber());
		
	}
	
	/*
	@Test
	public void testFindRegisterByEmail()
	{
		String email = "ragul@gmail.com";
		
		 RegisterUser register = regdao.findByEmail(email);
		 assertThat(register).isNotNull();
		
	}*/
}
