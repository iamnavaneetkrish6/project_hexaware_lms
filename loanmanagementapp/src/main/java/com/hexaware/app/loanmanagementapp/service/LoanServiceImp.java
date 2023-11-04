package com.hexaware.app.loanmanagementapp.service;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.app.loanmanagementapp.entities.LoanApplyDetails;

public class LoanServiceImp implements ILoanService {

	@Override
	public int createLoan(LoanApplyDetails loan) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public int updateLoan(LoanApplyDetails loan) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public int deleteLoan(int loanNo) {
		// TODO Auto-generated method stub

		return 0;
	}

	@Override
	public LoanApplyDetails loanDetails(int loanNo) {
		
		LoanApplyDetails ld = new LoanApplyDetails(100, 01, 1000, "10/01/2012", "Chennai", 6000);
		
		
		return ld;
	}

	@Override
	public List<LoanApplyDetails> getAllLoanDetails() {
		// TODO Auto-generated method stub
		
		List<LoanApplyDetails> list = new ArrayList<>();
		LoanApplyDetails ld = new LoanApplyDetails(200, 02, 2000, "10/01/2012", "Chennai", 7000);
		LoanApplyDetails ld1 = new LoanApplyDetails(100, 01, 1000, "10/01/2012", "Chennai", 6000);
		list.add(ld);
		list.add(ld1);
		
		return list;
	}

}
