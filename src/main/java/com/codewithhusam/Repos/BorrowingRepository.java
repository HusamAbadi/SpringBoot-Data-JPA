package com.codewithhusam.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithhusam.Entities.Borrowing;

public interface BorrowingRepository extends JpaRepository<Borrowing, Long> {
}
