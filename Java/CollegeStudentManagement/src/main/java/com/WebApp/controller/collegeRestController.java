package com.WebApp.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.WebApp.model.college;
import com.WebApp.service.collegeService;

@RestController
@CrossOrigin
public class collegeRestController {

	@Autowired
	private collegeService collegeservice;
	
	// add new college to database
	
	
	@SuppressWarnings("unchecked")
	@PostMapping(path = "/addCollege")
	public @ResponseBody ResponseEntity<JSONObject> setCollege(@RequestBody college colg ) {
		JSONObject json = new JSONObject();
          System.out.println(colg);
          boolean isSave=collegeservice.addCollege(colg);
         System.out.println(isSave);
      	json.put("data", "success");
		return ResponseEntity.ok(json);
		
	}
	
}
