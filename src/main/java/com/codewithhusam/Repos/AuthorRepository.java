package com.codewithhusam.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithhusam.Entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
