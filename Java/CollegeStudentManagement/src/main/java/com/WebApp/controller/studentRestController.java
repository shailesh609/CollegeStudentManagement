package com.WebApp.controller;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.WebApp.model.students;
import com.WebApp.service.collegeService;
import com.WebApp.service.studentService;

@RestController
@CrossOrigin
public class studentRestController {


	@Autowired
	studentService studentservice;

	@Autowired
	private collegeService collegeservice;

	@SuppressWarnings("unchecked")
	@PostMapping(path = "/addStudent")
	public @ResponseBody  ResponseEntity<JSONObject> setStudent(@RequestBody students student) {
		JSONObject json = new JSONObject();
		System.out.println(student);

		boolean isSave = studentservice.addStudent(student);
		System.out.println(isSave);
		json.put("data", "success");
		return ResponseEntity.ok(json);

	}
	
	// find student by college  id

	@GetMapping(path = "/getStudent")
	public  List<students> getStudentByid(@RequestParam int colg) {

	//	List<college> collegelist = collegeservice.findcollege();
	//	model.addAttribute("collegelist", collegelist);

		List<students> studentlist = collegeservice.getStudentBycollegeID(colg);
	//	model.addAttribute("studentlist", studentlist);

		return studentlist;

	}
	
	// get student by student id
	
	@GetMapping(path = "/stud/getStudentbyid")
	public  students getStudentid( Model model) {
         int id=12;
		students studentDetails= studentservice.getStudentByid(id);
		model.addAttribute("student", studentDetails);

		return studentDetails;

	}
	
	
}
