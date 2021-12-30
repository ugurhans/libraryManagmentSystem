package com.lms.libraryManagmentSystem.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.lms.libraryManagmentSystem.business.abstracts.AuthorService;
import com.lms.libraryManagmentSystem.core.results.DataResult;
import com.lms.libraryManagmentSystem.core.results.Result;
import com.lms.libraryManagmentSystem.core.results.SuccessDataResult;
import com.lms.libraryManagmentSystem.core.results.SuccessResult;
import com.lms.libraryManagmentSystem.dataAccess.abstracts.AuthorDao;
import com.lms.libraryManagmentSystem.entities.concrates.Author;

@Service
public class AuthorManager implements AuthorService {
	
	private AuthorDao authorDao;
	
	@Autowired
	public AuthorManager(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}
	
	@Override
	public Result add(Author entity) {
		authorDao.save(entity);
		return new SuccessResult("Yazar eklendi.");
	}
	@Override
	public Result update(Author entity) {
		authorDao.save(entity);
		return new SuccessResult("Yazar güncellendi");
	}

	@Override
	public Result delete(int id) {
		
		authorDao.deleteById(id);
		return new SuccessResult("Yazar silindi");
	}

	@Override
	public DataResult<List<Author>> getAll() {
		Sort sort = Sort.by(Sort.Direction.ASC, "author");
		
		return new SuccessDataResult<List<Author>>(authorDao.findAll(sort));
	}

	@Override
	public DataResult<Author> getById(int id) {
		return new SuccessDataResult<Author>(authorDao.getById(id));
	}

}
