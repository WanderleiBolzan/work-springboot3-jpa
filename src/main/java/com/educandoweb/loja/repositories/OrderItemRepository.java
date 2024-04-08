package com.educandoweb.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.loja.entities.OrderItem;
import com.educandoweb.loja.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
