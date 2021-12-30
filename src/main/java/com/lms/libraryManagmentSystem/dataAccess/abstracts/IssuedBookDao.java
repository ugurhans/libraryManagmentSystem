package com.lms.libraryManagmentSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.libraryManagmentSystem.entities.concrates.IssuedBook;

public interface IssuedBookDao extends JpaRepository<IssuedBook, Integer> {

}
