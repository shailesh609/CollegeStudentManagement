package com.WebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.WebApp.model.college;
import com.WebApp.service.collegeService;

@Controller
@RequestMapping("/mvc")
public class collegeController {
	
	@Autowired
	private collegeService collegeservice;
	
	@PostMapping(path = "/addCollege")
	public  String setCollege( college colg ) {
          System.out.println(colg);
          boolean isSave=collegeservice.addCollege(colg);
          System.out.println(isSave);
		return "success";
		
	}

}
