package com.niit.project2.DAO;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.niit.project2.Model.OrderedItem;
@Repository
public interface OrderedItemDAO {
	public void saveOrUpdate(OrderedItem orderedItem);
	public void delete(String orderedItemid);
	public List<OrderedItem> list();
	public OrderedItem getOrderedItem(String OrderedItemid);
	public void save (OrderedItem orderedItem);
	public List<OrderedItem> listOrderedItem(String customerid) ;
		
}


