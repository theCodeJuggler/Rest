package com.abcinc.web.controller;
import java.util.List;

import org.springframework.hateoas.Resources;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.abcinc.web.pojo.Customer;

@Controller
public class ViewController {
	
	@RequestMapping(value="/customer")
	public String viewCustomer(Model model) {
		
		RestTemplate restTemplate = new RestTemplate();
		List<Customer> rsources = restTemplate.getForObject("http://localhost:8080/viewCust", List.class);
		model.addAttribute("viewCust", rsources);
		
		return "customer";
	}

}
