package com.WebApp.service.serviceImpl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WebApp.model.college;
import com.WebApp.model.students;
import com.WebApp.repository.collegeRepository;
// import com.WebApp.repository.studentRepository;
import com.WebApp.service.collegeService;

@Service
public class collegeServiceImpl implements collegeService{

	@Autowired
	private collegeRepository collegerepo;
	
//	@Autowired
//	private studentRepository repo;
	
	@Override
	public boolean addCollege(college clg) {
		if(clg !=null) {
			collegerepo.save(clg);
			return true;
			}
			else return false;
	}

	@Override
	public List<college> findcollege() {
		Comparator<college> collegeName=(college o1,college o2)->{
			 return o1.getName().compareTo(o2.getName());
		 };
		 
		 List<college> collegelist= collegerepo.findAll();
		 
         Collections.sort( collegelist,collegeName);
         
		 
		return collegelist;
		
	}

	@Override
	public List<students> getStudentBycollegeID(int colg) {
		
    	Comparator<students> studentName=(students o1,students o2)->{
					 return o1.getName().compareTo(o2.getName());
				 };
		
		 Optional<college> list=collegerepo.findById(colg);
		 List<students> studentlist=list.get().getStudent();
		 Collections.sort( studentlist,studentName);
		 
		// System.out.println("**********************************************************************************************************************");
		// System.out.println(repo.findStudentByCollege(colg));
		 
		 
		return studentlist;
	}

	
	
}
