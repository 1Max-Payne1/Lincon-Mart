package com.Entities;


	import java.util.List;

	import java.util.Optional;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	@Service
	public class CustomerService {
		@Autowired
		private customerRepo customrepo;
		
		public void createUser(Customer customer) {
			customrepo.save(customer);
		}
		public Customer getCustomer(int id) {
			Customer  customer=null;
			Optional<Customer> optional=customrepo.findById(Integer.valueOf(id));
			if(!optional.isEmpty()) {
				customer=(Customer)optional.get();
				System.out.println(Customer.getname()+":"+Customer.getpassword());
			}
			return customer;
		}
		
		public void getCustomerByCustomerName() {
			List<Customer> list=(List<Customer>) customrepo.getCustomerByCustomerName("email");
			for(Customer c:list) {
				System.out.println(c);
			}
		}
		public customerRepo getCustomrepo() {
			return customrepo;
		}
		public void setCustomrepo(customerRepo customrepo) {
			this.customrepo = customrepo;
		}
		public void createCustomer(Customer customer) {
		
			
		}
		
		
	}

