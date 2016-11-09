package com.niit.project1.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.project2.DAO.CategoryDAO;
import com.niit.project2.DAO.ProductDAO;
import com.niit.project2.DAO.SupplierDAO;
import com.niit.project2.Model.Category;
import com.niit.project2.Model.Product;
import com.niit.project2.Model.Supplier;
@Controller
public class ProductController {
	
	@Autowired(required = true)
	private ProductDAO productDAO;
	
	@Autowired(required = true)
	private CategoryDAO categoryDAO;
	
	@Autowired(required = true)
	private SupplierDAO supplierDAO;
	
	@SuppressWarnings("unused")
	private String path = "C:\\mani\\img";
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String listProducts(Model model){
		model.addAttribute("product", new Product());
		model.addAttribute("category", new Category());
		model.addAttribute("supplier", new Supplier());
		model.addAttribute("productList",this.productDAO.list());
		model.addAttribute("categoryList",this.categoryDAO.list());
		model.addAttribute("supplierList", this.supplierDAO.list());
		return "product";	
		
	}
	@RequestMapping(value = "/product/add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product){
		
	  Category category = categoryDAO.get(product.getCategoryid());
	  Supplier supplier = supplierDAO.get(product.getSupplierid());
	
	
	  product.setCategoryid(category.getCategoryid());
	  product.setSupplierid(supplier.getSupplierid());
	  productDAO.update(product);

	  return "product";

}

 @RequestMapping("product/remove/{id}")
 public String removeProduct(@PathVariable("id")String id,Model model)throws Exception{
	 
	 try {
		 productDAO.delete(id);
		 model.addAttribute("message", "Successfully Added");
	 }catch(Exception e){
		 model.addAttribute("message", e.getMessage());
		 e.printStackTrace();
	 }
		 
	return "product";	 
	 }
 @RequestMapping("product/edit/{id}")
 public String editProduct(@PathVariable("id") String id, Model model){
	 System.out.println("editProduct");
	 model.addAttribute("product", this.productDAO.get(id));
	 model.addAttribute("listProducts", this.productDAO.list());
	 model.addAttribute("categoryList", this.categoryDAO.list());
	 model.addAttribute("supplierList", this.supplierDAO.list());
	 
	 return "product"; 
 
	 }
   @RequestMapping("product/get/{id}")
   public ModelAndView getProduct(@PathVariable("id") String id)
   {
	   @SuppressWarnings("unused")
	Product selectedProduct = productDAO.get(id);
	   ModelAndView mv = new ModelAndView("product");
	   mv.addObject("selectedProduct","selectedProduct");
	   return mv;
   }
   
 
 }
