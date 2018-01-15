package com.iqmsoft.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.MapUserDetailsRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsRepository;

@Configuration
public class SecurityConfiguration {
	
	@Bean
	UserDetailsRepository userDetailsRepository() {
	    UserDetails user = User.withUsername("user").password("user").roles("USER").build();
	    UserDetails admin = User.withUsername("admin").password("admin").roles("USER", "ADMIN").build();
	    return new MapUserDetailsRepository(user, admin);
	}
	
}
