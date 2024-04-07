package com.educandoweb.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.loja.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
