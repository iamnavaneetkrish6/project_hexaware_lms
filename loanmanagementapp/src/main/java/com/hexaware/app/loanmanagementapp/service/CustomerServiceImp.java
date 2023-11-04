package com.hexaware.app.loanmanagementapp.service;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.app.loanmanagementapp.entities.CustomerDetails;
import com.hexaware.app.loanmanagementapp.entities.LoanStatus;

public class CustomerServiceImp implements ICustomerService {

	@Override
	public int customerRegisteration(CustomerDetails customer) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public int updateCustomer(CustomerDetails customer) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public int deleteCustomer(int customerId) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public CustomerDetails getCustomerById(int customerId) {
		
		CustomerDetails c1 = new CustomerDetails(1, "Navaneet", "ink", "admin", "coimbatore","Tn", "india", "ink@gmail.com");
		
		
		
		return c1;
	}

	@Override
	public List<CustomerDetails> getAllCustomer() {
		
		List<CustomerDetails> list = new ArrayList<>();
		
		CustomerDetails c1 = new CustomerDetails(1, "Navaneet", "ink", "admin", "coimbatore","Tn", "india", "ink@gmail.com");
		CustomerDetails c2 = new CustomerDetails(1, "Sumnn", "ink2", "devlopment", "coimbatore","Tn", "india", "ink1@gmail.com");
		
		list.add(c1);
		list.add(c2);
		
		return list;
	}

	@Override
	public LoanStatus getLoanStatus(int loanNo) {
		
		LoanStatus ls1 = new LoanStatus(101, "Approved");
		
		return ls1;
	}

}
