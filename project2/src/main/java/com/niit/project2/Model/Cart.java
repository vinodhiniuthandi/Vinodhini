package com.niit.project2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="cart")
@Component
public class Cart {
	@Id
	private String cartid;
	
    private String customerid;
	
    private String grandTotal;
	
    private int noOfProducts;
    private String orderedItemid;
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
	public String getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(String grandtotal) {
		this.grandTotal = grandtotal;
	}
	public int getNoOfProducts() {
		return noOfProducts;
	}
	public void setNoOfProducts(int noOfProducts) {
		this.noOfProducts = noOfProducts;
	}
	public String getOrderedItemid() {
		return orderedItemid;
	}
	public void setOrderedItemid(String orderedItemid) {
		this.orderedItemid = orderedItemid;
	}

}