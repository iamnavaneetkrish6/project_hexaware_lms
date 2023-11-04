package com.hexaware.app.loanmanagementapp.service;

import java.util.List;

import com.hexaware.app.loanmanagementapp.entities.CustomerLoanHistory;

public interface ICustomerLoanHistoryService {

	int createLoanHistory(CustomerLoanHistory customerId);
	int updateLoanHistory(CustomerLoanHistory customerId);
	
	int deleteLoanHistory(int loanNo);
	
	CustomerLoanHistory getByLoanNo(int loanNo);
	List<CustomerLoanHistory> getLoanHistory();
	
}
