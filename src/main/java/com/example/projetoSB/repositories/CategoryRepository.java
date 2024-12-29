package com.example.projetoSB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetoSB.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
