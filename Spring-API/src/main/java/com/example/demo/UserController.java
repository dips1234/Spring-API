package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping(value="/",produces="application/json")
	public List<String> getUsers(){
		List<String> names=new ArrayList<String>();
		names.add("John");
		names.add("David");
		return names;
		
	}
}
