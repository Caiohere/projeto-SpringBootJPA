package com.example.projetoSB.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoSB.entities.Order;
import com.example.projetoSB.services.OrderService;

@RestController
@RequestMapping(value="/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.FindAll();
		return ResponseEntity.ok().body(list);		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Order> findById (@PathVariable Long id) {
		Order order = service.findById(id);
		return ResponseEntity.ok().body(order);
	}
	
}
