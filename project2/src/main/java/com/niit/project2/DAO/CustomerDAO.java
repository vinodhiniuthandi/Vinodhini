package com.niit.project2.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.project2.Model.Customer;

@Repository
public interface CustomerDAO {

	public void saveOrUpdate(Customer customer);
	public void delete(String customerid);
	public Customer get(String customerid);
	public List<Customer> list();
	public void save(Customer customer);
	public Customer getCustomerByUserName(String name);
}
