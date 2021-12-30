package com.lms.libraryManagmentSystem.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.lms.libraryManagmentSystem.business.abstracts.UserService;
import com.lms.libraryManagmentSystem.core.results.DataResult;
import com.lms.libraryManagmentSystem.core.results.Result;
import com.lms.libraryManagmentSystem.core.results.SuccessDataResult;
import com.lms.libraryManagmentSystem.core.results.SuccessResult;
import com.lms.libraryManagmentSystem.dataAccess.abstracts.UserDao;
import com.lms.libraryManagmentSystem.entities.concrates.User;

@Service
public class UserManager implements UserService {

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Result add(User entity) {
		userDao.save(entity);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result update(User entity) {
		userDao.save(entity);
		return new SuccessResult("Güncellendi");
	}

	@Override
	public Result delete(int id) {
		userDao.deleteById(id);
		return new SuccessResult("Silindi");
	}

	@Override
	public DataResult<List<User>> getAll() {
		Sort sort = Sort.by(Sort.Direction.ASC, "user");
		return new SuccessDataResult<List<User>>(userDao.findAll(sort),"Listelendi");
	}

	@Override
	public DataResult<User> getById(int id) {
	return new SuccessDataResult<User>(userDao.getById(id));
	}
	
}
