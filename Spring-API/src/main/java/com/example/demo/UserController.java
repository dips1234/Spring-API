package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users", produces = "application/json")
public class UserController {

	@GetMapping
	public List<String> getUsers(){
		List<String> names=new ArrayList<String>();
		names.add("John");
		names.add("David");
		return names;
		
	}
}
