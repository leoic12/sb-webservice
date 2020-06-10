package com.example.sbwebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbwebservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
