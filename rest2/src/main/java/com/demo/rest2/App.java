package com.demo.rest2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demo.rest2.pojo.Customer;
import com.demo.rest2.service.CustomerService;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
    
    /*@Bean
    public CommandLineRunner loadInitialData(CustomerService service) {
    	return (args) -> {
    		service.addCustomer(new Customer(1, "Holla", "9768453210", "07/07/1987", "Kolkata", "Indian", "Male"));
    		service.addCustomer(new Customer(1, "hota", "768413289", "04/12/1992", "Kolkata", "Indian", "Male"));
    		service.addCustomer(new Customer(1, "Bholla", "8459763210", "15/07/1967", "Mumbai", "Indian", "Female"));
    		service.addCustomer(new Customer(1, "Cholla", "6845973210", "07/10/2000", "Delhi", "Indian", "Female"));
    	};
    }*/
}
