package com.codewithhusam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithhusam.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
