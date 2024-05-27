package com.codewithhusam.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithhusam.Entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
