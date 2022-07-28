package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repository.ItemRepository;
import com.example.demo.Repository.OrderRepository;
import com.example.demo.model.Item;
import com.example.demo.model.Order;
import com.example.demo.service.ItemService;

public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository Irepo;

	@Override
	public Iterable<Item> getAllItem() {
		
		return Irepo.findAll();
	}

	@Override
	public Item saveItem(Item item) {
		
		return Irepo.saveAndFlush(item);
	}

	@Override
	public Item getItemById(Integer Id) {
		return Irepo.getById(Id);
		
		
	}

}
