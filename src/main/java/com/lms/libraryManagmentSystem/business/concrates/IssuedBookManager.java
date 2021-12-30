package com.lms.libraryManagmentSystem.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.lms.libraryManagmentSystem.business.abstracts.IssuedBookService;
import com.lms.libraryManagmentSystem.core.results.DataResult;
import com.lms.libraryManagmentSystem.core.results.Result;
import com.lms.libraryManagmentSystem.core.results.SuccessDataResult;
import com.lms.libraryManagmentSystem.core.results.SuccessResult;
import com.lms.libraryManagmentSystem.dataAccess.abstracts.IssuedBookDao;
import com.lms.libraryManagmentSystem.entities.concrates.IssuedBook;



@Service
public class IssuedBookManager implements IssuedBookService {

	private IssuedBookDao issuedBookDao;

	@Autowired
	public IssuedBookManager(IssuedBookDao issuedBookDao) {
		this.issuedBookDao = issuedBookDao;
	}

	@Override
	public Result add(IssuedBook entity) {
		issuedBookDao.save(entity);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result update(IssuedBook entity) {
		issuedBookDao.save(entity);
		return new SuccessResult("Güncellendi");
	}

	@Override
	public Result delete(int id) {
		issuedBookDao.deleteById(id);
		return new SuccessResult("Silindi");
	}

	@Override
	public DataResult<List<IssuedBook>> getAll() {
		Sort sort = Sort.by(Sort.Direction.ASC, "book");
		return new SuccessDataResult<List<IssuedBook>>(issuedBookDao.findAll(sort),"Listelendi");
	}

	@Override
	public DataResult<IssuedBook> getById(int id) {
		return new SuccessDataResult<IssuedBook>(issuedBookDao.getById(id));
	}
	
	
}
