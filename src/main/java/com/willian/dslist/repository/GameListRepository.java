package com.willian.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.willian.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
