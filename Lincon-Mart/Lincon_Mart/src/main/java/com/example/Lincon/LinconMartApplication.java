package com.example.Lincon;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.Entities.*;


@SpringBootApplication
@ComponentScan(basePackages =  {"com"})
@EntityScan( basePackages= {"com"})
@EnableJpaRepositories("com")
public class LinconMartApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=SpringApplication.run(LinconMartApplication.class, args);
	
//CustomerService CustomerService= ctx.getBean(CustomerService.class);
//	
//	Customer customer=new Customer();
//	customer.setId(100);
//	customer.setName("Senku");
//	customer.setPassword("yasir");
//	customer.setAddress("Civilization");
//	customer.setCity("Pune");
//	CustomerService.createCustomer(customer);
//	
//	Customer customer1=CustomerService.getCustomer(100);
//	System.out.println(customer1);
	}

}
