package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repository.OrderRepository;
import com.example.demo.model.Order;
import com.example.demo.service.OrderService;


public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository repo;

	@Override
	public Iterable<Order> getAllOrder() {
		
		return repo.findAll();
	}

	@Override
	public Order saveOrder(Order order) {
		
		return repo.saveAndFlush(order);
	}

	@Override
	public Order getOrderById(Integer Id) {
		return repo.getById(Id);
		
		
	}

}
