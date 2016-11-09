package com.niit.project2.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.project2.Model.Product;
@Repository
public interface ProductDAO {
	public boolean  save(Product product);
	public boolean update(Product product);
	public boolean delete (String productid);

	public Product  get(String productid);

	public List<Product>list();
}

