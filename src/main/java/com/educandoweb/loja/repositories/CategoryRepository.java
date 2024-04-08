package com.educandoweb.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.loja.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
