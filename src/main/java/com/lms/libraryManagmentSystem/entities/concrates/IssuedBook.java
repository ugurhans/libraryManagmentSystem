package com.lms.libraryManagmentSystem.entities.concrates;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="IssuedBooks")
public class IssuedBook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "bookId")
	private int bookId;
	

	@Column(name = "purchaseDate")
	private Date purchaseDate;
	

	@Column(name = "deliveryDate")
	private Date deliveryDate;
}

