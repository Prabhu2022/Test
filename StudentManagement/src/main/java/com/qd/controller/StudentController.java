package com.qd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.qd.dao.StudentDao;
import com.qd.model.StudentDetails;

@Controller
public class StudentController {

	@Autowired
	private StudentDao stddao;
	
	@GetMapping("")
	public String homePage()
	{
		return "index";
		
	}
	@RequestMapping("/register")
	public String register(Model model)
	{
		model.addAttribute("student", new StudentDetails());
		
		return "register2";
		
	}
	@PostMapping("/processRegister")
	public String processRegister(StudentDetails student)
	{
		stddao.save(student);
		return "registerSuccess";
		
	}
	@GetMapping("/list_users")
	public String viewUserList(Model model)
	{
		List <StudentDetails> listStudents = stddao.findAll();
		model.addAttribute("listUsers",listStudents);
		return "users";
		
	}

}


