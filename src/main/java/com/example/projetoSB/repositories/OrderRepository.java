package com.example.projetoSB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetoSB.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
