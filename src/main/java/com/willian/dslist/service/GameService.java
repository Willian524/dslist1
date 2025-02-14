package com.willian.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.willian.dslist.dto.GameDTO;
import com.willian.dslist.dto.GameMinDTO;
import com.willian.dslist.entities.Game;
import com.willian.dslist.projections.GameMinProjection;
import com.willian.dslist.repository.GameRepository;
@Service
public class GameService {
	@Autowired	
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
		
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
		

	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}
}
