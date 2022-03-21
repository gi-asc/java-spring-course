package com.udemy.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udemy.curso.entities.Product;
import com.udemy.curso.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;

	public List<Product> findAll(){
		return this.repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> optional = this.repository.findById(id);
		return optional.get();
	}
}
