package com.lms.libraryManagmentSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.libraryManagmentSystem.entities.concrates.BookCategory;

public interface BookCategoryDao extends JpaRepository<BookCategory, Integer>{

}
