package com.niit.project1.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.project2.DAO.SupplierDAO;
import com.niit.project2.Model.Supplier;
@Controller
public class SupplierController {
	
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	@SuppressWarnings("unused")
	@Autowired
	private Supplier supplier;
	
	@Autowired
	Model mv;
	
	@RequestMapping(value = "/suppliers", method = RequestMethod.GET)
	public String listCategories(Model model){
		model.addAttribute("supplier", "supplier");
		model.addAttribute("supplierList",this.supplierDAO.list());
		return "supplier";
		
	}
	@RequestMapping(value = "/supplier/add", method = RequestMethod.POST)
	public String addSupplier(@ModelAttribute("supplier") Supplier supplier){
		//String newID = Util.removeComma(supplier.getId());
		//supplier.setId(newID);
		if(supplierDAO.save(supplier)==true)
		{
			mv.addAttribute("msg", "Successfully created the supplier");
			
		}
		else
		{
			mv.addAttribute("msg", "not able to create the supplier");
		}
		return "supplier";
	}
	
	@RequestMapping("supplier/remove/{id}")
	public ModelAndView deletesupplier(@PathVariable("id") String id) throws Exception{
		
		boolean flag = supplierDAO.delete(id);
		ModelAndView mv = new ModelAndView("supplier");
		String msg = "Successfully done the operation";
		if(flag!=true)
		{
			msg = "the operation could not success";
			
		}
		mv.addObject("msg",msg);
		
		return mv;
	 	
	}
	@RequestMapping("supplier/edit/{id}")
	public String editsupplier(@ModelAttribute("supplier")Supplier supplier){
		
		if(supplierDAO.update(supplier) == true)
		{
		   mv.addAttribute("msg", "Successfully updated the supplier");
		}
		else
		{
			mv.addAttribute("msg", "unable to delete the supplier");
	}
		return "supplier";
	
		
	}

}

