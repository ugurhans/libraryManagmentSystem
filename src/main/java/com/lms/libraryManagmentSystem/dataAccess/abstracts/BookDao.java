package com.lms.libraryManagmentSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lms.libraryManagmentSystem.entities.concrates.Book;

public interface BookDao extends JpaRepository<Book, Integer>{

}
