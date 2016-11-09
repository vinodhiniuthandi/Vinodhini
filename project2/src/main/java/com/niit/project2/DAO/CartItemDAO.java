package com.niit.project2.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.project2.Model.CartItem;
@Repository
public interface CartItemDAO {
public void saveOrUpdate(CartItem cartItem);
public void delete(String cartItemid);
public CartItem getCartItem(String cartItemid);
public List<CartItem> getCartItemByCustomerid(String customerid);
public List<CartItem> list();
public void save(CartItem cartItem);
}



