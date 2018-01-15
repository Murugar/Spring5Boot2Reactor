
package com.iqmsoft;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

@SpringBootApplication
@EnableReactiveMongoRepositories
@EnableWebFluxSecurity
public class SpringReactorDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringReactorDemoApplication.class, args);
	}
}
