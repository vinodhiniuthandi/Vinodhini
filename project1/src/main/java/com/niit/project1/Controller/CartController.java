package com.niit.project1.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.project2.DAO.CartDAO;
import com.niit.project2.DAO.CartItemDAO;
import com.niit.project2.DAO.ProductDAO;
import com.niit.project2.DAO.UserDAO;
import com.niit.project2.Model.Cart;
import com.niit.project2.Model.CartItem;
import com.niit.project2.Model.Product;
import com.niit.project2.Model.User;

@Controller
@RequestMapping("/user/cart")
public class CartController {

    @SuppressWarnings("unused")
	@Autowired
    private User user;
    @Autowired
    UserDAO userDAO;
    @SuppressWarnings("unused")
	@Autowired
    private Cart cart;
    @Autowired
    CartDAO cartDAO;
    @SuppressWarnings("unused")
	@Autowired
    private CartItem cartItem;
    @Autowired
    CartItemDAO cartItemDAO;
    @Autowired
    Product product;
    @Autowired
    ProductDAO productDAO;
   // private String path="c:\\vino\\img";
    @RequestMapping(value="/cart" ,method=RequestMethod.GET)
    public String myCart(Model model,HttpSession session){
    	model.addAttribute("cart", new Cart());
    	String loggedInUserId=(String)session.getAttribute("loggedInUserId");
    	int cartsize=cartDAO.list().size();
    	if(cartsize==0){
    		model.addAttribute("error message", "you do not have any products in your cart");
    	}
    else{
    	model.addAttribute("cartlist",this.cartDAO.list());
    	model.addAttribute("displaycart","true");
    }
   return "Home";
}
    @RequestMapping(value="myCart/add/{cartid}",method=RequestMethod.GET)
    public String addToCart(@PathVariable("cartid")String cartid,HttpSession session){
    	Product product=productDAO.get(cartid);
    	cart.setGrandTotal(product.getPrice());
    	//cart.setProductName(product.getName());
    	//cart.setQuantity(1);
    	String loggedInUserId=(String)session.getAttribute("loggedInUserId");
    	cart.setCustomerid(loggedInUserId);
    	//cart.saveOrUpdate(cart);
    	return "Home";
    }
    
    @RequestMapping("myCart/delete/{cartid}")
    	public String deleteCart(@PathVariable("cartid")String cartid,ModelMap model)throws Exception{
    		try{
    			cartDAO.delete(cartid);
    			model.addAttribute("message", "Successfully deleted");
    		}
    		catch(Exception e){
    			model.addAttribute("message", e.getMessage());
    			e.printStackTrace();
    			}
    		return "redirect/Home";
    		}
	@RequestMapping(value="mycart/edit/{cartid}")
    public String editCart(@PathVariable("cartid")String cartid,Model model,HttpSession session){
    	System.out.println("editCart");
    	model.addAttribute("cart", this.cartDAO.get(cartid));
    	String loggedInUserId=(String)session.getAttribute("loggedInUserId");
    	model.addAttribute("listcart", this.cartDAO.list());
    	return "cart";
    }
    	}
    
   
    



