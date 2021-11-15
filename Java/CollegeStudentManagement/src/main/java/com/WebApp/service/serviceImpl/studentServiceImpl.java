package com.WebApp.service.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebApp.model.students;
import com.WebApp.repository.studentRepository;
import com.WebApp.service.studentService;

@Service
public class studentServiceImpl implements studentService{
  
	@Autowired
	private studentRepository studentrepo;
	
	@Override
	public boolean addStudent(students student) {
		
		if(student !=null) 
		{		
			
		studentrepo.save(student);
		return true;
		
		}
		
		else return false;
		
	}

	@Override
	public students getStudentByid(int id) {
		
		students student= studentrepo.findById(id).get();
		return student;
	}

	@Override
	public List<students> findStudent() {
		
		return studentrepo.findAll();
	}

}
