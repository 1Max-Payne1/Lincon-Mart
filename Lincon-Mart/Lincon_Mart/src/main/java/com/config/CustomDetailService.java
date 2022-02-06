//package com.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import com.Entities.Customer;
//import com.Entities.customerRepo;
//
//public class CustomDetailService implements UserDetailsService {
//  
//	@Autowired
//	private customerRepo customerRepo;
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		Customer customer= customerRepo.getCustomerByCustomerName(username);
//		if(customer==null) {
//			throw new UsernameNotFoundException("could not find user");
//		}
//		
//		CustomDetails customDetails= new CustomDetails(customer);
//		return customDetails;
//	}
//
//}
