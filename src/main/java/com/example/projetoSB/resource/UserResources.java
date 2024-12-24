package com.example.projetoSB.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoSB.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(0, "Caio", "caio@gmail.com", "777-777", "231823");
		return  ResponseEntity.ok().body(u);		
	}
	
}
