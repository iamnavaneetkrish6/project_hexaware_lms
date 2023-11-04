package com.hexaware.app.loanmanagementapp.service;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.app.loanmanagementapp.entities.AdminDetails;
import com.hexaware.app.loanmanagementapp.entities.LoanStatus;
import com.hexaware.app.loanmanagementapp.entities.LoanTypes;

public class AdminServiceImp implements IAdminService {

	@Override
	public int createAdmin(AdminDetails customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateAdmin(AdminDetails customer) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public int deleteAdmin(int customerId) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public AdminDetails getAdminById(int adminId) {
		// TODO Auto-generated method stub
		AdminDetails a1 = new AdminDetails(1, "Dhone", "Dhoni@gmail.com", "Dhoni7", "dhnioj");
		
		return a1;
	}

	@Override
	public List<AdminDetails> getAllAdmin() {
		// TODO Auto-generated method stub
		
		List<AdminDetails> list = new ArrayList<>();
		AdminDetails a1 = new AdminDetails(1, "Dhone", "Dhoni@gmail.com", "Dhoni7", "dhnioj");
		AdminDetails a2 = new AdminDetails(1, "virat", "virat@gmail.com", "virat18", "virat0");
		list.add(a1);
		list.add(a2);
		
		return list;
	}

	@Override
	public int createLoanType(LoanTypes loanTypes) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public int updateLoanType(LoanTypes loanTypes) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public int deleteLoanType(int customerId) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public LoanTypes getLoanType(int adminId) {
		// TODO Auto-generated method stub
		
		LoanTypes loantype = new LoanTypes(1, "Car loan", 13.7f, 5, "Collateral required", 5000);
		return loantype;
	}

	@Override
	public List<LoanTypes> getAllLoanType() {
		// TODO Auto-generated method stub
		List<LoanTypes> list = new ArrayList<>();
		LoanTypes loantype = new LoanTypes(1, "Car loan", 13.7f, 5, "Collateral required", 5000);
		LoanTypes loantype2 = new LoanTypes(2, "bike loan", 11.7f, 5, "Collateral required", 1000);
		
		list.add(loantype);
		list.add(loantype2);
		
		return list;
	}

	@Override
	public int createLoanStatus(LoanStatus loanStatus) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public int updateLoanStatus(LoanStatus loanStatus) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public int deleteLoanStatus(int loanNo) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public LoanStatus getLoanStatus(int loanNo) {
		// TODO Auto-generated method stub
		
		LoanStatus loanStatus = new LoanStatus(1, "Approved");
		
		return loanStatus;
	}

	@Override
	public List<LoanStatus> getAllLoanStatus() {
		// TODO Auto-generated method stub
		List<LoanStatus> list = new ArrayList<>();
	    LoanStatus loanStatus = new LoanStatus(1, "Approved");
		LoanStatus loanStatus1 = new LoanStatus(2, "Approved");
		list.add(loanStatus);
		list.add(loanStatus1);
		
		return list;
	}

}
