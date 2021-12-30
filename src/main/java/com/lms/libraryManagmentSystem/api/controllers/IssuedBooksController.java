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

import com.lms.libraryManagmentSystem.business.abstracts.IssuedBookService;
import com.lms.libraryManagmentSystem.core.results.DataResult;
import com.lms.libraryManagmentSystem.core.results.Result;
import com.lms.libraryManagmentSystem.entities.concrates.IssuedBook;

@RestController
@RequestMapping("/api/issuedbooks")
@CrossOrigin
public class IssuedBooksController {

	private IssuedBookService issuedBookService;

	@Autowired
	public IssuedBooksController(IssuedBookService issuedBookService) {
		this.issuedBookService = issuedBookService;
	}
	
	@PutMapping("/update")
	public Result update(@RequestBody IssuedBook issuedBook) {
		return issuedBookService.update(issuedBook);
	}
	
	@PutMapping("/add")
	public Result add(@RequestBody IssuedBook issuedBook) {
		return issuedBookService.add(issuedBook);
	}
	
	@PutMapping("/delete")
	public Result delete(@RequestBody int id) {
		return issuedBookService.delete(id);
	}
	
	
	@GetMapping("/getAll")
	public DataResult<List<IssuedBook>> getAll(){
		return issuedBookService.getAll();
	}
	
	@GetMapping("getById")
	public DataResult<IssuedBook> getById(@RequestParam int id) {
		return issuedBookService.getById(id);
	}
}
