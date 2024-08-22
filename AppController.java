package com.app.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class AppController {
	@Autowired
	private ItemRepo repo;
	
	@GetMapping("/loadData")
	public Flux<Item> returnFlux() {
		return repo.findAll();
	}
	
}
