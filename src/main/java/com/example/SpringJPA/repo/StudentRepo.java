package com.example.SpringJPA.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringJPA.Model.Student1;

@Repository
public interface StudentRepo extends JpaRepository<Student1,Long>{
	

}
