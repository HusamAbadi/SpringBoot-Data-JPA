package com.codewithhusam.springjpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codewithhusam.Entities.Book;
import com.codewithhusam.Repos.BookRepository;

@SpringBootTest
class SpringjpaApplicationTests {

	@Autowired
	private BookRepository bookRepository;

	@Test
	public void testSavePlayer() {
		Book book = new Book();
		book.setId(1L);
		book.setTitle("Book Title");
		book.setAuthor("Husam");
		book.setRating(2);

		bookRepository.save(book);

		Book savedBook = bookRepository.findById(1L).get();
		assertNotNull(savedBook);
	}

}
