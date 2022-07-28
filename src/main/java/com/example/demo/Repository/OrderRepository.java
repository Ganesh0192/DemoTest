package com.example.demo.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Order;



public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	public Optional<Order> findById(Integer Id);
}


