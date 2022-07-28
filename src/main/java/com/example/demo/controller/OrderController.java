package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;



@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderservice;
	
	@GetMapping("/getAll")
	public @ResponseBody Iterable<Order> getAllOrderDetail() throws Exception {
		
		return orderservice.getAllOrder();

}
	@PostMapping("/save")
	public ResponseEntity<Order> createOrder(@RequestBody Order order, HttpServletRequest request)
			throws Exception {
		Order createdOrder =this.orderservice.saveOrder(order); 
		
		return ResponseEntity.ok().body(createdOrder);
}
	@GetMapping("/get/{id}")  
	public ResponseEntity<Order> getOrderById(@PathVariable("id") Integer id) {
		Order order = orderservice.getOrderById(id); //id should be same
		
		return ResponseEntity.ok().body(order);
}
}
