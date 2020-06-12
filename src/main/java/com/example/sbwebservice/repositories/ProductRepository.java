package com.example.sbwebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbwebservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
