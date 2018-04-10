package com.example.demo;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;



@RestController
public class WebController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ProxyInterface proxy;
	
	@PostMapping("/user")
	@HystrixCommand(fallbackMethod="fallback")
	public String check(@RequestBody Customer customer) {
		
		
		System.out.println("1");
		logger.info("{}", "Getting entered mobile no. and password during login");
		Optional<Customer> details=proxy.find(customer.getMobileNo());
		System.out.println("hello"+details.get());
		System.out.println(proxy.find(customer.getMobileNo()));
		
		System.out.println("hi");
		if(details.isPresent()) {
	    Customer toGetPassword = details.get();
	    String password = toGetPassword.getPassword();
		if((customer.getPassword()).equals(password))
	           return "successfully login";
		else
			return "wrong username or password";
		}
		return "wrong credentials";
	     
	   }
		
	
	public String fallback(Customer customer) {
		return "fallback";
	}
}
