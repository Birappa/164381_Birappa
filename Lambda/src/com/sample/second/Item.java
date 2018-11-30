package com.sample.second;

public class Item {

	private String itemName;
	private double price;
	private String orderStatus;
	public Item(String itemName, double price,String orderStatus) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.orderStatus=orderStatus;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", price=" + price
				+ ", orderStatus=" + orderStatus + "]";
	}
	
}
