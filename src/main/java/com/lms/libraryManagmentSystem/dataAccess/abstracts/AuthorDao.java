package com.lms.libraryManagmentSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.libraryManagmentSystem.entities.concrates.Author;

public interface AuthorDao extends JpaRepository<Author, Integer> {

}
