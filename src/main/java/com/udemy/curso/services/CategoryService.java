package com.udemy.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.curso.entities.Category;
import com.udemy.curso.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll(){
		return this.repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> optional = this.repository.findById(id);
		return optional.get();
	}
}
