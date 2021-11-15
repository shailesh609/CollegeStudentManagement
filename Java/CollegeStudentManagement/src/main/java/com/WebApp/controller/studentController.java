package com.WebApp.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.WebApp.model.college;
import com.WebApp.model.students;
import com.WebApp.service.collegeService;
import com.WebApp.service.studentService;

@Controller
@RequestMapping("/mvc")
public class studentController {

	@Autowired
	studentService studentservice;

	@Autowired
	private collegeService collegeservice;

	@PostMapping(path = "/addStudent")
	public String setStudent(students student) {

		System.out.println(student);

		boolean isSave = studentservice.addStudent(student);
		System.out.println(isSave);

		return "success";

	}

	@GetMapping(path = "/getStudent")
	public String getStudentByid(@RequestParam int colg, Model model) {

		List<college> collegelist = collegeservice.findcollege();
		model.addAttribute("collegelist", collegelist);

		List<students> studentlist = collegeservice.getStudentBycollegeID(colg);
		model.addAttribute("studentlist", studentlist);

		return "view";

	}
	
	
	@GetMapping(path = "/stud/getStudentbyid")
	public String getStudentid( Model model) {
         int id=12;
		students studentDetails= studentservice.getStudentByid(id);
		model.addAttribute("student", studentDetails);

		return "studentview";

	}

}
