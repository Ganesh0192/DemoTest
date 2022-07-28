package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ItemId")
	private int itemId;
	
	private String itemName;
	
	private int itemUnitPrice;
	
	private int itemQuantity;
	
	@OneToOne(targetEntity = Order.class, cascade = CascadeType.ALL)
	private Order order;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemUnitPrice() {
		return itemUnitPrice;
	}

	public void setItemUnitPrice(int itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemUnitPrice=" + itemUnitPrice
				+ ", itemQuantity=" + itemQuantity + ", order=" + order + "]";
	}
	
	
	
}
