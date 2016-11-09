package com.niit.project2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import com.niit.project2.Model.BillingAddress;
import com.niit.project2.Model.ShippingAddress;
import com.niit.project2.Model.Cart;



@Entity
@Component
public class Order {
	@Id
	private String userid;
	private String orderid;
	private BillingAddress billingAddress;
	private ShippingAddress shippingAddress;
	private Cart cart;
	private long totalAmount;
	private String paymentMethod;
	private String customer;
	private Customer customerByUserName;
	public Customer getCustomerByUserName() {
		return customerByUserName;
	}
	public void setCustomerByUserName(Customer customerByUserName) {
		this.customerByUserName = customerByUserName;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public BillingAddress getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public long getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(long totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public void setCustomer(Customer customerByUserName) {
		// TODO Auto-generated method stub
		this.customerByUserName=customerByUserName;
	}
	public String getCustomer()
	{
		return customer;
	}

}
