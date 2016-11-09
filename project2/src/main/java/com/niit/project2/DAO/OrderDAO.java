package com.niit.project2.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.project2.Model.Order;

@Repository

public interface OrderDAO {
	public void saveOrUpdate(Order order);
	public void delete(String orderid);
	public List<Order> list();
	public Order getOrder(String Orderid);
	public void save(Order order);
}
