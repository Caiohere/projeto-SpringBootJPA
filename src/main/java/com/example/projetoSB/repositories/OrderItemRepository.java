package com.example.projetoSB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetoSB.entities.OrderItem;
import com.example.projetoSB.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
