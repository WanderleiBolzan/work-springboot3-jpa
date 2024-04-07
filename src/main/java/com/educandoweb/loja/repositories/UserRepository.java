package com.educandoweb.loja.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.loja.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
