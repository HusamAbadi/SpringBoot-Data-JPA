package com.codewithhusam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjpaApplication.class, args);
	}

}
// Book: (id, title, author, isbn) - O2M relationship with Author
// Author: (id, name) - M2O relationship with Book
// Genre: (id, name) - M2M relationship with Book (through a separate table)
// BookGenre (bookId, genreId) - M2M relationship table (linking Book and Genre)
// Customer: (id, name, email) - O2M relationship with Borrowing
// Borrowing: (id, customerId, bookId, borrowedDate, returnedDate) - M2O
// relationship with Customer and Book