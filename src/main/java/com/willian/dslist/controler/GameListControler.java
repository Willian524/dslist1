package com.willian.dslist.controler;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.willian.dslist.dto.GameDTO;
import com.willian.dslist.dto.GameListDTO;
import com.willian.dslist.dto.GameMinDTO;
import com.willian.dslist.service.GameListService;
import com.willian.dslist.service.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping(value = "/lists")
public class GameListControler {
	@Autowired
	private GameListService gameListService;
			
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	

}
