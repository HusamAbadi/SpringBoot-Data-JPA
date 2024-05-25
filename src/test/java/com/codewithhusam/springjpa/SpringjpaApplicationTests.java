package com.codewithhusam.springjpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.codewithhusam.model.Player;
import com.codewithhusam.repo.PlayerRepository;

@SpringBootTest
class SpringjpaApplicationTests {

	@Autowired
	private PlayerRepository playerRepository;

	@Test
	public void testSavePlayer() {
		Player player = new Player();
		player.setId(1L);
		player.setName("Husam");
		player.setScore(2);

		playerRepository.save(player);

		Player savedPlayer = playerRepository.findById(1L).get();
		assertNotNull(savedPlayer);
	}

}
