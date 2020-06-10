package com.example.sbwebservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sbwebservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
