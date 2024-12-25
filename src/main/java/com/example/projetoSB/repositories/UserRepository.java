package com.example.projetoSB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetoSB.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
