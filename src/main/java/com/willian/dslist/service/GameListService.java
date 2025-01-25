package com.willian.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.willian.dslist.dto.GameListDTO;


import com.willian.dslist.entities.GameList;
import com.willian.dslist.repository.GameListRepository;

@Service
public class GameListService {
	@Autowired	
	private GameListRepository gameListRepository;
		
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		return dto;
	}
		

}
