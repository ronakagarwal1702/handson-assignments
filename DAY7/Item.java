package com.hsbc.collection;

public class Item implements Comparable<Item> {
	private int item_id;
	private String name;
	private double price;
	private double rating;
	
	
	public Item(int item_id, String name, double price, double rating) {
		super();
		this.item_id = item_id;
		this.name = name;
		this.price = price;
		this.rating = rating;
	}
	
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + item_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (item_id != other.item_id)
			return false;
		return true;
	}

	public String toString() {
		return "Item [ItemId=" + item_id + ", name=" + name + ", Price=" + price + ", Rating=" + rating + "]";
	}

	@Override
	public int compareTo(Item o) {
		return(this.item_id-o.getItem_id());
	}
	

}
