package com.hexaware.app.loanmanagementapp.service;

import java.util.List;

import com.hexaware.app.loanmanagementapp.entities.LoanApplyDetails;

public interface ILoanService {

	int createLoan(LoanApplyDetails loan);
	int updateLoan(LoanApplyDetails loan);
	
	int deleteLoan(int loanNo);
	
	LoanApplyDetails loanDetails(int loanNo);
	List<LoanApplyDetails> getAllLoanDetails();
	
	
}
