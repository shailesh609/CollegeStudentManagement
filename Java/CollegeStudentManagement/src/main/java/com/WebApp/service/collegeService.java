package com.WebApp.service;

import java.util.List;
import org.springframework.stereotype.Component;

import com.WebApp.model.college;
import com.WebApp.model.students;

@Component
public interface collegeService {
	
	public boolean addCollege(college clg);

	public List<college> findcollege();

	public List<students> getStudentBycollegeID(int colg);
	
	
}
