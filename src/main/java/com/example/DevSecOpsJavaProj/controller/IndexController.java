package com.example.DevSecOpsJavaProj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.DevSecOpsJavaProj.model.User;

import ch.qos.logback.core.model.Model;

@Controller
public class IndexController {
     
	 @GetMapping("/")
	 public String Index()
	 {
		 return "index";
	 }
	 
	 @PostMapping("/register")
	 public String userRegistration(@ModelAttribute User user, Model model)
	 {
		 System.out.println(user.toString());
		 
		 System.out.println(user.getName());
		 System.out.println(user.getBirthday());
		 System.out.println(user.getEmail());
		 System.out.println(user.getPhone());
		 System.out.println(user.getMessage());
		 
		 return "Welcome";
	 }
}
