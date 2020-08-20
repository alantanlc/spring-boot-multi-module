package com.example.demo.customer.service.implementation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.customer.domain.aggregate.Customer;
import com.example.demo.customer.domain.aggregate.CustomerRepository;
import com.example.demo.customer.domain.aggregate.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer getCustomerById(Integer customerId) {
		logger.info("Inside CustomerServiceImpl.........");
		Customer customer = customerRepository.getCustomerById(customerId);
		return customer;
	}
}
