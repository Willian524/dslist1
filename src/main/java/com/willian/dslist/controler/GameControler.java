package com.willian.dslist.controler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willian.dslist.dto.GameMinDTO;
import com.willian.dslist.entities.Game;
import com.willian.dslist.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping(value = "/games")
public class GameControler {
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
	

}
