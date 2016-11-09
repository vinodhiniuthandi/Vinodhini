package com.niit.project2.DAO;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.niit.project2.Model.Supplier;
@Repository
public interface SupplierDAO {
	public boolean  save(Supplier supplier);
	public boolean update(Supplier supplier);
	public boolean delete (String supplierid);

	public Supplier  get(String supplierid);

	public List<Supplier>list();
}
