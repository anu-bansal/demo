package com.example.demo;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="customer-details-service", url="10.151.60.178:8012")
public interface ProxyInterface {
	
	@GetMapping("/customer/user/mobile/{mobile}")
	public Optional<Customer> find(@PathVariable("mobile") String mobile);

}
