package com.codewithhusam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithhusam.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
