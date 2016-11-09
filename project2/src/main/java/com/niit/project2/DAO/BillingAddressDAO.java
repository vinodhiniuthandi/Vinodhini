package com.niit.project2.DAO;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.niit.project2.Model.BillingAddress;
@Repository
public interface BillingAddressDAO {

	 public void saveOrUpdate(BillingAddress billingAddress);
	 public void deleteBillingAddress(String BillingAddressid);
	 public BillingAddress getBillingAddress(String BillingAddressid);
	 public List<BillingAddress>list();
	public void save(BillingAddress billingAddress);

}
