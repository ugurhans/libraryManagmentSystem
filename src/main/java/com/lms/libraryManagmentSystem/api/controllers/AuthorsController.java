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


import com.lms.libraryManagmentSystem.business.abstracts.AuthorService;
import com.lms.libraryManagmentSystem.core.results.DataResult;
import com.lms.libraryManagmentSystem.core.results.Result;
import com.lms.libraryManagmentSystem.entities.concrates.Author;

@RestController
@RequestMapping("/api/authors")
@CrossOrigin
public class AuthorsController {

	private AuthorService authorService;

	@Autowired
	public AuthorsController(AuthorService authorService) {
		this.authorService = authorService;
	}
	
	@PutMapping("/update")
	public Result update(@RequestBody Author author) {
		return authorService.update(author);
	}
	
	@PutMapping("/add")
	public Result add(@RequestBody Author author) {
		return authorService.add(author);
	}
	
	@PutMapping("/delete")
	public Result delete(@RequestBody int id) {
		return authorService.delete(id);
	}
	
	
	@GetMapping("/getAll")
	public DataResult<List<Author>> getAll(){
		return authorService.getAll();
	}
	
	@GetMapping("getById")
	public DataResult<Author> getById(@RequestParam int id) {
		return authorService.getById(id);
	}
}
