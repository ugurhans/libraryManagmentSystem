package com.lms.libraryManagmentSystem.business.concrates;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.lms.libraryManagmentSystem.business.abstracts.MemberService;
import com.lms.libraryManagmentSystem.core.results.DataResult;
import com.lms.libraryManagmentSystem.core.results.Result;
import com.lms.libraryManagmentSystem.core.results.SuccessDataResult;
import com.lms.libraryManagmentSystem.core.results.SuccessResult;
import com.lms.libraryManagmentSystem.dataAccess.abstracts.MemberDao;
import com.lms.libraryManagmentSystem.entities.concrates.Member;


@Service
public class MemberManager implements MemberService {

	private MemberDao memberDao;

	@Autowired
	public MemberManager(MemberDao memberDao) {
		
		this.memberDao = memberDao;
	}

	@Override
	public Result add(Member entity) {
		memberDao.save(entity);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result update(Member entity) {
		memberDao.save(entity);
		return new SuccessResult("Eklendi");
	}

	@Override
	public Result delete(int id) {
		memberDao.deleteById(id);
		return new SuccessResult("Silindi");
	}

	@Override
	public DataResult<List<Member>> getAll() {
		Sort sort = Sort.by(Sort.Direction.ASC, "member");
		return new SuccessDataResult<List<Member>>(memberDao.findAll(sort),"Listelendi");
	}

	@Override
	public DataResult<Member> getById(int id) {
		return new SuccessDataResult<Member>(memberDao.getById(id),"Listelendi");
	}
}
