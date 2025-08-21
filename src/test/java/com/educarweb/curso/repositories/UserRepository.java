package com.educarweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educarweb.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
