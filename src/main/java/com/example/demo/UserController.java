package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserController {
	


    
   //===============Hardcoded=========================================//
    @GetMapping(path="/allbasic")
	public Hello getallbasicusers() {
		return new Hello("fafaaaaaaa");
	}
    @GetMapping(path="/allbasic/{name}")
	public Hello retrieveAllUsersbasic(@PathVariable String name) {
		return new Hello(name);
	}
	
}