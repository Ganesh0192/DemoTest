package com.example.demo.service;

import com.example.demo.model.Order;

public interface OrderService {

	public Iterable<Order> getAllOrder();
	public Order saveOrder(Order order);
	public <optional>Order getOrderById(Integer Id);
	
	
}
