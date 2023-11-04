package com.hexaware.app.loanmanagementapp.service;

import java.util.List;

import com.hexaware.app.loanmanagementapp.entities.AdminDetails;
import com.hexaware.app.loanmanagementapp.entities.LoanStatus;
import com.hexaware.app.loanmanagementapp.entities.LoanTypes;

public interface IAdminService {

	int createAdmin(AdminDetails customer);
	int updateAdmin(AdminDetails customer);
	
	int deleteAdmin(int customerId);
	
	AdminDetails getAdminById (int adminId);
	List<AdminDetails> getAllAdmin();
	
	
	int createLoanType(LoanTypes loanTypes);
	int updateLoanType(LoanTypes loanTypes);
	
	int deleteLoanType(int customerId);
	
	LoanTypes getLoanType (int adminId);
	List<LoanTypes> getAllLoanType();
	
	
	
	int createLoanStatus(LoanStatus loanStatus);
	int updateLoanStatus(LoanStatus loanStatus);
	
	int deleteLoanStatus(int loanNo);
	
	LoanStatus getLoanStatus (int loanNo);
	List<LoanStatus> getAllLoanStatus();
	
	
}
