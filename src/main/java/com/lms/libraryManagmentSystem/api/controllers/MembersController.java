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

import com.lms.libraryManagmentSystem.business.abstracts.MemberService;
import com.lms.libraryManagmentSystem.core.results.DataResult;
import com.lms.libraryManagmentSystem.core.results.Result;
import com.lms.libraryManagmentSystem.entities.concrates.Member;

@RestController
@RequestMapping("/api/members")
@CrossOrigin
public class MembersController {

	private MemberService memberService;

	@Autowired
	public MembersController(MemberService memberService) {
		this.memberService = memberService;
	}

	@PutMapping("/update")
	public Result update(@RequestBody Member member) {
		return memberService.update(member);
	}
	
	@PutMapping("/add")
	public Result add(@RequestBody Member member) {
		return memberService.add(member);
	}
	
	@PutMapping("/delete")
	public Result delete(@RequestBody int id) {
		return memberService.delete(id);
	}
	
	
	@GetMapping("/getAll")
	public DataResult<List<Member>> getAll(){
		return memberService.getAll();
	}
	
	@GetMapping("getById")
	public DataResult<Member> getById(@RequestParam int id) {
		return memberService.getById(id);
	}
}
