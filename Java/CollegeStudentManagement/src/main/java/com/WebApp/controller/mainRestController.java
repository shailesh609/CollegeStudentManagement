package com.WebApp.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.WebApp.model.college;
import com.WebApp.model.students;
import com.WebApp.service.collegeService;
import com.WebApp.service.studentService;

@RestController
@CrossOrigin
public class mainRestController {

	@Autowired
	private collegeService collegeservice;
	
	@Autowired
	studentService studentservice;

	/*
	 * @RequestMapping("/home") public String homePage() 
	 * { 
	 * return "home"; 
	 * }
	 */
	
	// get student list
	
	@GetMapping("/student")
	public  List<students> studentPage() {
		
	//	List<college> list = collegeservice.findcollege();
		
		List<students> list = studentservice.findStudent();
	//	md.addAttribute("collegelist", list);

		return list;
	}

	
	//get  college list

	@GetMapping("/view")
	public  List<college> viewPage() {

		List<college> list = collegeservice.findcollege();

	//	List<students> studentlist = new ArrayList<>();

	//	md.addAttribute("studentlist", studentlist);
	//	md.addAttribute("collegelist", list);

		return list;
	}

	
}
