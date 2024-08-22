package com.app.mongo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import reactor.core.publisher.Flux;
@Component
public class AppInit implements CommandLineRunner{
	@Autowired
	private ItemRepo repo;

	@Override
	public void run(String... args) throws Exception {
		 setup();
		}
public List<Item>data(){
		return Arrays.asList(
				new Item("101", "Samsung Phone", 40000.00),
				new Item("102", " IPhone", 30000.00),
				new Item("103", "Motorola Phone", 20000.00));
	}

private void setup() {
	
	 repo.deleteAll()
	.thenMany(Flux.fromIterable(data()))
	.flatMap(repo::save)
	.thenMany(repo.findAll())
	.subscribe((item -> {
		System.out.println(item);
	}));

	
}
}