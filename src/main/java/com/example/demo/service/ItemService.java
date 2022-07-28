package com.example.demo.service;

import com.example.demo.model.Item;
import com.example.demo.model.Order;

public interface ItemService {

	public Iterable<Item> getAllItem();
	public Item saveItem(Item item);
	public <optional>Item getItemById(Integer Id);
}
