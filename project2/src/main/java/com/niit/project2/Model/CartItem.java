package com.niit.project2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class CartItem{
	@Id
	private String cartItemid;
private String cartid;
	
private String customerid;
	
private String productid;
	
private int quantity;
	
private double totalPrice;

public String getCartItemid() {
	return cartItemid;
}

public void setCartItemid(String cartItemid) {
	this.cartItemid = cartItemid;
}

public String getCartid() {
	return cartid;
}

public void setCartid(String cartid) {
	this.cartid = cartid;
}

public String getCustomerid() {
	return customerid;
}

public void setCustomerid(String customerid) {
	this.customerid = customerid;
}

public String getProductid() {
	return productid;
}

public void setProductid(String productid) {
	this.productid = productid;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public double getTotalPrice() {
	return totalPrice;
}

public void setTotalPrice(double totalPrice) {
	this.totalPrice = totalPrice;
}
}
