package com.niit.project2.DAO;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.niit.project2.Model.Cart;
import com.niit.project2.Model.OrderedItem;
@Repository
public interface CartDAO {
	public void saveOrUpdate(Cart cart);
	public void delete(String cartid);

	public Cart getCartByCustomerid(String customerid);
	public List<Cart> list();
	public List<OrderedItem> listOrderedItem(String customerid);
	public void save(Cart cart);
	public Cart get(String cartid);
}
