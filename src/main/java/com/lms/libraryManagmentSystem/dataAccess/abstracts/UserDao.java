package com.lms.libraryManagmentSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lms.libraryManagmentSystem.entities.concrates.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
