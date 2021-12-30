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

import com.lms.libraryManagmentSystem.business.abstracts.BookCategoryService;
import com.lms.libraryManagmentSystem.core.results.DataResult;
import com.lms.libraryManagmentSystem.core.results.Result;
import com.lms.libraryManagmentSystem.entities.concrates.BookCategory;


@RestController
@RequestMapping("/api/bookcategories")
@CrossOrigin
public class BookCategoriesController {

	private BookCategoryService bookCategoryService;

	@Autowired
	public BookCategoriesController(BookCategoryService bookCategoryService) {
		this.bookCategoryService = bookCategoryService;
	}
	
	
	@PutMapping("/update")
	public Result update(@RequestBody BookCategory bookCategory) {
		return bookCategoryService.update(bookCategory);
	}
	
	@PutMapping("/add")
	public Result add(@RequestBody BookCategory bookCategory) {
		return bookCategoryService.add(bookCategory);
	}
	
	@PutMapping("/delete")
	public Result delete(@RequestBody int id) {
		return bookCategoryService.delete(id);
	}
	
	
	@GetMapping("/getAll")
	public DataResult<List<BookCategory>> getAll(){
		return bookCategoryService.getAll();
	}
	
	@GetMapping("getById")
	public DataResult<BookCategory> getById(@RequestParam int id) {
		return bookCategoryService.getById(id);
	}
	
	
}
