package com.lms.libraryManagmentSystem.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.lms.libraryManagmentSystem.business.abstracts.BookCategoryService;
import com.lms.libraryManagmentSystem.core.results.DataResult;
import com.lms.libraryManagmentSystem.core.results.Result;
import com.lms.libraryManagmentSystem.core.results.SuccessDataResult;
import com.lms.libraryManagmentSystem.core.results.SuccessResult;
import com.lms.libraryManagmentSystem.dataAccess.abstracts.BookCategoryDao;
import com.lms.libraryManagmentSystem.entities.concrates.BookCategory;

@Service
public class BookCategoryManager implements BookCategoryService{

	private BookCategoryDao bookCategoryDao;

	@Autowired
	public BookCategoryManager(BookCategoryDao bookCategoryDao) {
		this.bookCategoryDao = bookCategoryDao;
	}

	@Override
	public Result add(BookCategory entity) {
		bookCategoryDao.save(entity);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result update(BookCategory entity) {
		bookCategoryDao.save(entity);
		return new SuccessResult("Güncellendi");
	}

	@Override
	public Result delete(int id) {
		bookCategoryDao.deleteById(id);
		return new SuccessResult("Silindi");
	}

	@Override
	public DataResult<List<BookCategory>> getAll() {
		Sort sort = Sort.by(Sort.Direction.ASC, "bookcategory");
		return new SuccessDataResult<List<BookCategory>>(bookCategoryDao.findAll(sort),"Listelendi");
	}

	@Override
	public DataResult<BookCategory> getById(int id) {
		return new SuccessDataResult<BookCategory>(bookCategoryDao.getById(id),"Listelendi");
	}
}
