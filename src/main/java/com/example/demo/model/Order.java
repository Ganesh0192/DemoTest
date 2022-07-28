package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="OrderId")
private int orderId;

@Column(name="OrderDate")
private int orderDate;

@Column(name="OredrStatus")
private String orderStatus;

@Column(name="CollectionOfItems")
private int collectionOfItems;

public int getOrderId() {
	return orderId;
}

public void setOrderId(int orderId) {
	this.orderId = orderId;
}

public int getOrderDate() {
	return orderDate;
}

public void setOrderDate(int orderDate) {
	this.orderDate = orderDate;
}

public String getOrderStatus() {
	return orderStatus;
}

public void setOrderStatus(String orderStatus) {
	this.orderStatus = orderStatus;
}

public int getCollectionOfItems() {
	return collectionOfItems;
}

public void setCollectionOfItems(int collectionOfItems) {
	this.collectionOfItems = collectionOfItems;
}

@Override
public String toString() {
	return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus
			+ ", collectionOfItems=" + collectionOfItems + "]";
}





}
