package com.hexaware.app.loanmanagementapp.service;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.app.loanmanagementapp.entities.CustomerLoanHistory;

public class CustomerLoanHistoryServiceImp implements ICustomerLoanHistoryService {

	@Override
	public int createLoanHistory(CustomerLoanHistory customerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateLoanHistory(CustomerLoanHistory customerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteLoanHistory(int loanNo) {
		// TODO Auto-generated method stub
		return 0;

	}

	@Override
	public CustomerLoanHistory getByLoanNo(int loanNo) {
		// TODO Auto-generated method stub
		
		CustomerLoanHistory ch = new CustomerLoanHistory(100, 1000, "Done", 101);
		
		return ch;
	}

	@Override
	public List<CustomerLoanHistory> getLoanHistory() {
		
		List<CustomerLoanHistory> list = new ArrayList<>();
		
		CustomerLoanHistory ch2 = new CustomerLoanHistory(100, 1000, "Done", 101);
		CustomerLoanHistory ch1 = new CustomerLoanHistory(100, 1000, "Done", 101);
		
		list.add(ch1);
		list.add(ch2);
		
		return list;
	}

}
