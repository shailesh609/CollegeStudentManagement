package com.WebApp.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.WebApp.model.college;
import com.WebApp.model.students;
import com.WebApp.service.collegeService;

@Controller
@RequestMapping("/mvc")
public class mainController {

	@Autowired
	private collegeService collegeservice;

	
	@RequestMapping("/home")
	public String homePage() {
		return "home";
	}

	@RequestMapping("/student")
	public String studentPage(Model md) {
		List<college> list = collegeservice.findcollege();
		md.addAttribute("collegelist", list);

		return "student";
	}

	@RequestMapping("/college")
	public String collegePage() {
		return "college";
	}

	@RequestMapping("/view")
	public String viewPage(Model md) {

		List<college> list = collegeservice.findcollege();

		List<students> studentlist = new ArrayList<>();

		md.addAttribute("studentlist", studentlist);
		md.addAttribute("collegelist", list);

		return "view";
	}

}
