package com.Lincon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Entities.Customer;
import com.Entities.customerRepo;

@Controller
public class Lincon_Controller {
	
	@Autowired
	private customerRepo customerRepo;
	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
	
	
	
	@RequestMapping( path= {"/"}, method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping( path= {"/electronics"}, method = RequestMethod.GET)
	public String electronics() {
		return "electronics";
	}
	
	@RequestMapping( path= {"/clothes"}, method = RequestMethod.GET)
	public String clothes() {
		return "clothes";
	}	
	

	
	@RequestMapping( path= {"/featured"}, method = RequestMethod.GET)
	public String featured() {
		return "featured";
	}
	
	@RequestMapping( path= {"/contact"}, method = RequestMethod.GET)
	public String contact() {
		return "contact";
	}
	
	@RequestMapping( path= {"/checkout"}, method = RequestMethod.GET)
	public String checkout() {
		return "checkout";
	}
	
	@RequestMapping( value="/index", method = RequestMethod.POST)
	public String registercustomer(@ModelAttribute("customer") Customer customer) {
		customer.setEnabled(true);
		customer.setRole("USER");
		//customer.setPassword(passwordEncoder.encode(customer.getPassword()));
		
		Customer customer2= this.customerRepo.save(customer);
		return "index";
	}
}
