package com.qd.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.qd.model.StudentDetails;

public interface StudentDao extends JpaRepository<StudentDetails, Long>

{
	

}
