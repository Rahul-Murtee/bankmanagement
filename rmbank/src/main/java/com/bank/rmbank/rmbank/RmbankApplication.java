package com.bank.rmbank.rmbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bank.rmbank.rmbank.model.CustomerDataOp;

@SpringBootApplication
public class RmbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(RmbankApplication.class, args);
		CustomerDataOp cust = new CustomerDataOp();
		cust.addCustomer();
		cust.getCustomerData();
	}

}
