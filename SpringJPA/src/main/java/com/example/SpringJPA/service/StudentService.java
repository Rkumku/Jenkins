package com.example.SpringJPA.service;

import java.util.List;
import java.util.Optional;

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
	public Student1 getStudentDetails(Long id)
	{
		Optional <Student1> op=repo.findById(id);
		if(op.isPresent())
		{
			return op.get();
		}
		else
		{
			return null;
		}
	}
		public List<Student1> getAllStudents(String str)
		{
			return repo.findByname(str);
		}
		public List<Student1> getAllStudentspercent(int percentage)
		{
			return repo.findBypercentage(percentage);
		}
		
		public List<Student1> findNameAndCollege(String name,String college)
		{
			return repo.findByNameAndCollege(name,college);
		}
		public String updatePerBasedOnName(int p,String s)
		{
			String str=null;
			int i=repo.updatePercentBasedOnName(p, s);
			
			if(i==1){
				str= "successfully updated";
			}
			else
			{
				str="sorry!!could not update";
			}
			return str;
		}
		
		
	}

