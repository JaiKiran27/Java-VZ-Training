package com.app.mongo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Mono;

public interface ItemRepo extends ReactiveMongoRepository<Item, String> {
	
	Mono<Item> findByDescription(String Desc);

}
