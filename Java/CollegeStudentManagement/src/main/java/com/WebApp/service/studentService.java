package com.WebApp.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.WebApp.model.students;

@Component
public interface studentService {
	
	public boolean addStudent(students student);

	public students getStudentByid(int id);

	public List<students> findStudent();


}
