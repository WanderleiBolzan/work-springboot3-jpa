package com.educandoweb.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.loja.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
