package com.niit.project2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class OrderDetail {
	@Id
	private String orderDetailid;
	public String getOrderDetailid() {
		return orderDetailid;
	}
	public void setOrderDetailid(String orderDetailid) {
		this.orderDetailid = orderDetailid;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getShippingAddressid() {
		return shippingAddressid;
	}
	public void setShippingAddressid(String shippingAddressid) {
		this.shippingAddressid = shippingAddressid;
	}
	public String getBillingAddressid() {
		return billingAddressid;
	}
	public void setBillingAddressid(String billingAddressid) {
		this.billingAddressid = billingAddressid;
	}
	private String customerid;
	private String grandTotal;
	private String shippingAddressid;
	private String billingAddressid;
	
	public String getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(String grandTotal) {
		this.grandTotal = grandTotal;
	}
	
}