package com.example.projetoSB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetoSB.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
