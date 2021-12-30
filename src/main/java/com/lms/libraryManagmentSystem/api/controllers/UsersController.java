package com.lms.libraryManagmentSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lms.libraryManagmentSystem.business.abstracts.UserService;
import com.lms.libraryManagmentSystem.core.results.DataResult;
import com.lms.libraryManagmentSystem.core.results.Result;
import com.lms.libraryManagmentSystem.entities.concrates.User;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UsersController {

	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		this.userService = userService;
	}
	@PutMapping("/update")
	public Result update(@RequestBody User user) {
		return userService.update(user);
	}
	
	@PutMapping("/add")
	public Result add(@RequestBody User user) {
		return userService.add(user);
	}
	
	@PutMapping("/delete")
	public Result delete(@RequestBody int id) {
		return userService.delete(id);
	}
	
	
	@GetMapping("/getAll")
	public DataResult<List<User>> getAll(){
		return userService.getAll();
	}
	
	@GetMapping("getById")
	public DataResult<User> getById(@RequestParam int id) {
		return userService.getById(id);
	}
	
	
}
