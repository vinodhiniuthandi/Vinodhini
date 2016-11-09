package com.niit.project1.Controller;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.niit.project2.DAO.BillingAddressDAO;
import com.niit.project2.DAO.CardDetailDAO;
import com.niit.project2.DAO.CartDAO;
import com.niit.project2.DAO.CartItemDAO;
import com.niit.project2.DAO.CustomerDAO;
import com.niit.project2.DAO.OrderDetailDAO;
import com.niit.project2.DAO.OrderedItemDAO;
import com.niit.project2.DAO.ProductDAO;
import com.niit.project2.DAO.ShippingAddressDAO;
import com.niit.project2.DAO.UserDAO;
import com.niit.project2.Model.BillingAddress;
import com.niit.project2.Model.CardDetail;
import com.niit.project2.Model.Cart;
import com.niit.project2.Model.CartItem;
import com.niit.project2.Model.Customer;
import com.niit.project2.Model.Order;
import com.niit.project2.Model.OrderDetail;
import com.niit.project2.Model.OrderedItem;
import com.niit.project2.Model.Product;
import com.niit.project2.Model.ShippingAddress;
import com.niit.project2.Model.User;


@Component
public class FlowController {
	
	@Autowired
	private ProductDAO productDAO;
	@Autowired
	private ShippingAddress shippingAddress;

	@Autowired
	private BillingAddress billingAddress;

	@Autowired
	private OrderDetail orderDetail;

	@Autowired
	private OrderedItem orderedItem;

	@Autowired
	private CardDetail cardDetail;

	@Autowired
	private ShippingAddressDAO shippingAddressDAO;

	@Autowired
	private BillingAddressDAO billingAddressDAO;

	@Autowired
	private OrderedItemDAO orderedItemDAO;

	@Autowired
	private OrderDetailDAO orderDetailDAO;

	@Autowired
	private CardDetailDAO cardDetailDAO;
	@Autowired
	Customer customer;
	@Autowired
	CustomerDAO customerDAO;

	@Autowired
	CartDAO cartDAO;

	@Autowired
	Cart cart;

	@Autowired
	CartItemDAO cartItemDAO;
	@Autowired
	HttpSession httpSession;
	@Autowired
	Product product;
	
	@Autowired
	Order order;
@Autowired
User user;
@Autowired
UserDAO userDAO;

	public Order initFlow() {
		customer = customerDAO.getCustomerByUserName(SecurityContextHolder.getContext()
				.getAuthentication().getName());
		order.setCart(cartDAO.getCartByCustomerid(customer.getCustomerid()));
		order.setCustomer(customerDAO.getCustomerByUserName(customer.getUsername()));
		return order;
	}

	public String addShippingAddress(Order order, ShippingAddress shippingAddress) {
		customer = customerDAO.getCustomerByUserName(SecurityContextHolder.getContext()
				.getAuthentication().getName());

		shippingAddress.setCustomerid(customer.getCustomerid());
		order.setShippingAddress(shippingAddress);

		this.shippingAddress.setCustomerid(customer.getCustomerid());
		this.shippingAddress.setLine1(shippingAddress.getLine1());
		this.shippingAddress.setLine2(shippingAddress.getLine2());
		this.shippingAddress.setCity(shippingAddress.getCity());
		this.shippingAddress.setState(shippingAddress.getState());
		this.shippingAddress.setCountry(shippingAddress.getCountry());
		this.shippingAddress.setZipcode(shippingAddress.getZipcode());

		return "success";
	}

	public String addBillingAddress(Order order, BillingAddress billingAddress) {
		customer = customerDAO.getCustomerByUserName(SecurityContextHolder.getContext().getAuthentication().getName());
		billingAddress.setCustomerid(customer.getCustomerid());
		order.setBillingAddress(billingAddress);

		this.billingAddress.setCustomerid(customer.getCustomerid());
		this.billingAddress.setLine1(billingAddress.getLine1());
		this.billingAddress.setLine2(billingAddress.getLine2());
		this.billingAddress.setCity(billingAddress.getCity());
		this.billingAddress.setState(billingAddress.getState());
		this.billingAddress.setCountry(billingAddress.getCountry());
		this.billingAddress.setZipcode(billingAddress.getZipcode());

		return "success";
	}

	public String addCardDetails(Order order, CardDetail cardDetail) {
		customer = customerDAO.getCustomerByUserName(SecurityContextHolder.getContext().getAuthentication().getName());

		cardDetail.setCustomerid(customer.getCustomerid());
		cardDetailDAO.saveOrUpdate(cardDetail);

		List<CartItem> listOfCartItem = cartItemDAO.getCartItemByCustomerid(customer.getCustomerid());

		listOfCartItem = cartItemDAO.getCartItemByCustomerid(customer.getCustomerid());

		cart = cartDAO.getCartByCustomerid(customer.getCustomerid());

		cart.setCartid(cart.getCartid());
		cart.setCustomerid(cart.getCustomerid());
		cart.setNoOfProducts(listOfCartItem.size());

		shippingAddressDAO.saveOrUpdate(order.getShippingAddress());
		billingAddressDAO.saveOrUpdate(order.getBillingAddress());
		cartDAO.saveOrUpdate(cart);

		httpSession.setAttribute("noOfProducts", cart.getNoOfProducts());

		return "success";
	}

}
