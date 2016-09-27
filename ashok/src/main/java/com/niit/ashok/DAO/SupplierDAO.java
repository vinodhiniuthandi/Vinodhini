package com.niit.ashok.DAO;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.ashok.model.Supplier;

@Repository
public interface SupplierDAO {
	public boolean save(Supplier supplier);
	public boolean update(Supplier supplier);
	public boolean delete(String id);
	public Supplier get(String id);
	public List<Supplier> list();


}
