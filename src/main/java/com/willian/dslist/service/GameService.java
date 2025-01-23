package com.willian.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.willian.dslist.dto.GameMinDTO;
import com.willian.dslist.entities.Game;
import com.willian.dslist.repository.GameRepository;
@Service
public class GameService {
	@Autowired	
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
		

}
