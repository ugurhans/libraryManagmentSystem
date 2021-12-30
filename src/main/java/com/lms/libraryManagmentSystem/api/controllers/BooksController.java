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

import com.lms.libraryManagmentSystem.business.abstracts.BookService;
import com.lms.libraryManagmentSystem.core.results.DataResult;
import com.lms.libraryManagmentSystem.core.results.Result;

import com.lms.libraryManagmentSystem.entities.concrates.Book;


@RestController
@RequestMapping("/api/books")
@CrossOrigin
public class BooksController {

	private BookService bookService;
	
	@Autowired
	public BooksController(BookService bookService) {
		this.bookService = bookService;
	}

	@PutMapping("/update")
	public Result update(@RequestBody Book book) {
		return bookService.update(book);
	}
	
	@PutMapping("/add")
	public Result add(@RequestBody Book book) {
		return bookService.add(book);
	}
	
	@PutMapping("/delete")
	public Result delete(@RequestBody int id) {
		return bookService.delete(id);
	}
	
	
	@GetMapping("/getAll")
	public DataResult<List<Book>> getAll(){
		return bookService.getAll();
	}
	
	@GetMapping("getById")
	public DataResult<Book> getById(@RequestParam int id) {
		return bookService.getById(id);
	}
}
