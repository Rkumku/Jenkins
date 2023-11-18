package com.example.SpringJPA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringJPA.Model.Student1;
import com.example.SpringJPA.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo repo;
	public Student1 saveStudent(Student1 st)
	{
		repo.save(st);
		return st;
	}
}
