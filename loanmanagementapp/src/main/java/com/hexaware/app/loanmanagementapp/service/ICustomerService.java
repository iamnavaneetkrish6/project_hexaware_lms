package com.hexaware.app.loanmanagementapp.service;

import java.util.List;

import com.hexaware.app.loanmanagementapp.entities.CustomerDetails;
import com.hexaware.app.loanmanagementapp.entities.LoanStatus;

public interface ICustomerService {

	int customerRegisteration(CustomerDetails customer);
	int updateCustomer(CustomerDetails customer);
	
	int deleteCustomer(int customerId);
	
	CustomerDetails getCustomerById (int customerId);
	List<CustomerDetails> getAllCustomer();
	
	LoanStatus getLoanStatus (int loanNo);
	
}
