package com.lms.libraryManagmentSystem.core.results;

public class SuccessResult extends Result{

	public SuccessResult(boolean succes, String message) {
		super(true,message);
		
	}

	public SuccessResult(String message) {
		super(true,message);
		
	}
}
