package com.abcinc.web.controller;
import java.util.List;

import org.springframework.hateoas.Resources;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping(value="/vwCustId/{start}/{count}")
	public String updtCustomer(@PathVariable int start, @PathVariable int count, Model model) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		String url = "http://localhost:8080/viewCust/"+start+"/"+count;
		System.out.println("DEKHO BEFORE");
		Resources customers = restTemplate.getForObject(url, Resources.class);
		
		System.out.println("DEKHO"+customers.getContent());
		System.out.println("HUKHO"+customers.getLinks());
		model.addAttribute("vwCust", customers.getContent());
		model.addAttribute("links", customers.getLinks());
		
		return "customerPg";
	}
}
