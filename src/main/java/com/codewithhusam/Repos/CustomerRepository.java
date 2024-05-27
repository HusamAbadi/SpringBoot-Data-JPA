package com.codewithhusam.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithhusam.Entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}