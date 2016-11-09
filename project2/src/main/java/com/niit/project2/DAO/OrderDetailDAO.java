package com.niit.project2.DAO;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.niit.project2.Model.OrderDetail;
@Repository
public interface OrderDetailDAO {
	public void saveOrUpdate(OrderDetail orderDetail);
	public void delete(String orderDetailid);
	public List<OrderDetail> list();
	public OrderDetail getOrderDetail(String OrderDetailid);
	public void save(OrderDetail orderDetail);
	}
