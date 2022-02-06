package com.Entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface customerRepo extends JpaRepository<Customer, Integer> {
	public Customer findByname(String name);
	
	@Query("select c from Customer c where c.email= :email")
	public Customer getCustomerByCustomerName(@Param("email") String email );
}
