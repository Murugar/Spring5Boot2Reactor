package com.iqmsoft.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.iqmsoft.model.Person;

import reactor.core.publisher.Flux;

public interface PersonRepository extends ReactiveMongoRepository<Person, String> {
	
	Flux<Person> findByName(String name);
	
}
