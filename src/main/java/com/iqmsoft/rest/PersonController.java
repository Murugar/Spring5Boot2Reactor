package com.iqmsoft.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iqmsoft.model.Person;
import com.iqmsoft.repository.PersonRepository;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/")
public class PersonController {
	
	@Autowired
    private PersonRepository personRespository;
	
	@GetMapping
    public Flux<Person> index() {
        return personRespository.findAll();
    }
	
	
}
