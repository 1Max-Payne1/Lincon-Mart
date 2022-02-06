package com.Entities;

import javax.persistence.Column;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	

		@Id
		@GeneratedValue(strategy= GenerationType.AUTO)
		private int id;
		private String name;
		@Column(unique = true)
		private String email;
		private String password;
		private String address;
		private String role;
		private String city;
		private boolean enabled;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String i) {
			this.password = i;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public boolean isEnabled() {
			return enabled;
		}
		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}
		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password
					+ ", address=" + address + ", role=" + role + ", city=" + city + ", enabled=" + enabled + "]";
		}
		public static int getpassword() {
			return getpassword();
		}
		public static String getname() {
			return getname();
		}
	
		
		

	}



