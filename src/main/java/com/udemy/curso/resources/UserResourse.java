package com.udemy.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemy.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResourse {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1, "Maria", "maria@teste.com", "9999-9999", "teste124");
		return ResponseEntity.ok().body(u);
	}
}
