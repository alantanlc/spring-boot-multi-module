package com.example.demo.customer.domain.aggregate;

import com.example.demo.customer.domain.aggregate.Customer;

public interface CustomerService {
	public Customer getCustomerById(Integer customerId);
}