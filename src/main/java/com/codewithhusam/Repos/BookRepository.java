package com.codewithhusam.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithhusam.Entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
