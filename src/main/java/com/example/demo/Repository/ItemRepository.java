package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Item;
import com.example.demo.model.Order;

public interface ItemRepository extends JpaRepository<Item, Integer>{

	public Optional<Item> findById(Integer Id);
}
