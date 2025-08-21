package com.educarweb.curso.Confi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educarweb.curso.entities.User;
import com.educarweb.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User (null,"Giovanni","giovanni@gmail.com","89897687","12345");
		User u2 = new User (null,"Pamela", "pamela@gmail.com", "5435345", "2020");
		User u3 = new User(null, "Rui","ruizao@cao.com","3424","453953");
		userRepository.saveAll(Arrays.asList(u1,u2,u3));
		
	}
	
	
}

