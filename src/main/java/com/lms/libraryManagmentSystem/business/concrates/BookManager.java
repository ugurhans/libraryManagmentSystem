package com.lms.libraryManagmentSystem.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.lms.libraryManagmentSystem.business.abstracts.BookService;

import com.lms.libraryManagmentSystem.core.results.DataResult;
import com.lms.libraryManagmentSystem.core.results.Result;
import com.lms.libraryManagmentSystem.core.results.SuccessDataResult;
import com.lms.libraryManagmentSystem.core.results.SuccessResult;
import com.lms.libraryManagmentSystem.dataAccess.abstracts.BookDao;
import com.lms.libraryManagmentSystem.entities.concrates.Book;

@Service
public class BookManager implements BookService{

	private BookDao bookDao;

	@Autowired
	public BookManager(BookDao bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public Result add(Book entity) {
		bookDao.save(entity);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result update(Book entity) {
		bookDao.save(entity);
		return new SuccessResult("Güncellendi");
	}

	@Override
	public Result delete(int id) {
		bookDao.deleteById(id);
		return new SuccessResult("Silindi");
	}

	@Override
	public DataResult<List<Book>> getAll() {
		Sort sort = Sort.by(Sort.Direction.ASC, "book");
		return new SuccessDataResult<List<Book>>(bookDao.findAll(sort),"Listelendi");
	}

	@Override
	public DataResult<Book> getById(int id) {
		return new SuccessDataResult<Book>(bookDao.getById(id),"Listelendi");
	}

	

}
