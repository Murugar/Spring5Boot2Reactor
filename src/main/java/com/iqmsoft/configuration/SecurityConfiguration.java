package com.iqmsoft.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
//import org.springframework.security.core.userdetails.MapUserDetailsRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.core.userdetails.UserDetailsRepository;

@Configuration
public class SecurityConfiguration {
	
	@Bean
	MapReactiveUserDetailsService userDetailsRepository() {
	    UserDetails user = User.withUsername("user").password("user").roles("USER").build();
	    UserDetails admin = User.withUsername("admin").password("admin").roles("USER", "ADMIN").build();
	    return new MapReactiveUserDetailsService(user, admin);
	}
	
	
	@Bean public PasswordEncoder passwordEncoder() { 
	    return NoOpPasswordEncoder.getInstance(); 
	}
	
	/*@Bean
	public PasswordEncoder passwordEncoder() {
	    return NoOpPasswordEncoder.getInstance();
	}*/
	
	/*@Bean
	PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	}*/
	
}
