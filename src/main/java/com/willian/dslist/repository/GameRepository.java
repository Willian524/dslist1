package com.willian.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.willian.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
