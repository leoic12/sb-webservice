package com.example.sbwebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbwebservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
