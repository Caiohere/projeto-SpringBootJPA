package com.example.projetoSB.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetoSB.entities.Order;
import com.example.projetoSB.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> FindAll () {
		return repository.findAll();
	}
	
	public Order findById (Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
