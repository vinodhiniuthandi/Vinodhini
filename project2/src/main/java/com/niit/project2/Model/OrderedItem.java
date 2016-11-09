package com.niit.project2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class OrderedItem {
	@Id
	private String orderedItemid;
	private String customerid;
	private String productid;
	private String productName;
	private String totalPrice;
	private String quantity;
	public String getOrderedItemid() {
		return orderedItemid;
	}
	public void setOrderedItemid(String orderedItemid) {
		this.orderedItemid = orderedItemid;
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
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	}
