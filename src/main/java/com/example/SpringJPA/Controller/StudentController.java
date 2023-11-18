package com.example.SpringJPA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringJPA.Model.Student1;
import com.example.SpringJPA.repo.StudentRepo;

@RestController

public class StudentController {
	@Autowired
	StudentRepo repo1;
	
	@PostMapping("/savestudent")
	public Student1 SaveStudentDetails(@RequestBody Student1 st)
	{
		try
		{
			repo1.save(st);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return st;
	}
	

}
