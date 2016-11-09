package com.niit.project2.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.project2.Model.ShippingAddress;
@Repository
public interface ShippingAddressDAO {

	 public void saveOrUpdate(ShippingAddress shippingAddress);
	  public   void deleteShippingAddress(String ShippingAddressid);
		public ShippingAddress getShippingAddress(String ShippingAddressid);
		public List<ShippingAddress>list();
		public void save(ShippingAddress shippingAddress);
	}


