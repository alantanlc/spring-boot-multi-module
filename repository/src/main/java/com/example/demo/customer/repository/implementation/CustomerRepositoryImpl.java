package com.example.demo.customer.repository.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.example.demo.customer.domain.aggregate.Customer;
import com.example.demo.customer.domain.aggregate.CustomerRepository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
	private static final Logger logger = LoggerFactory.getLogger(CustomerRepositoryImpl.class);
	
	@Override
	public Customer getCustomerById(Integer customerId) {
		logger.info("Inside CustomerRepositoryImpl........");
		// Replace this code to retrieve from database
		Customer customer = new Customer(100, "A New Customer");
		return customer;
	}
}
