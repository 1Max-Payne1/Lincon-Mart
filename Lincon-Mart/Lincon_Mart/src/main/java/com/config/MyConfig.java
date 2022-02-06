//package com.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class MyConfig extends WebSecurityConfigurerAdapter {
//
//	@Bean
//	public CustomDetailService getCustomDetailService() {
//		return new CustomDetailService();
//		
//	}
//	
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//		
//	}
//	
//	@Bean
//	public  DaoAuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider daoAuthenticationProvider= new DaoAuthenticationProvider();
//		
//		daoAuthenticationProvider.setUserDetailsService(this.getCustomDetailService());
//		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
//		return DaoAuthenticationProvider();
//		
//	}
//
//	private DaoAuthenticationProvider DaoAuthenticationProvider() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.authenticationProvider(authenticationProvider());
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/user/**").hasRole("USER")
//		.antMatchers("/**").permitAll().and().formLogin().and().csrf().disable();
//	}
//	
//	
//	
//}
