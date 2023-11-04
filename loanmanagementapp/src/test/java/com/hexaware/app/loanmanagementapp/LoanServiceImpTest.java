package com.hexaware.app.loanmanagementapp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.app.loanmanagementapp.entities.LoanApplyDetails;
import com.hexaware.app.loanmanagementapp.service.LoanServiceImp;

class LoanServiceImpTest {

	LoanApplyDetails lad = new LoanApplyDetails();
	LoanServiceImp loanService = new LoanServiceImp();
	
	@Test
	void testCreateLoan() {
		 int actual = loanService.createLoan(lad);
		 int expected = 0;
		 assertEquals(expected,actual);
		
		
	}

	@Test
	void testUpdateLoan() {
		 int actual = loanService.updateLoan(lad);
		 int expected = 0;
		 assertEquals(expected,actual);
	}

	@Test
	void testDeleteLoan() {
		 int actual = loanService.deleteLoan(1);
		 int expected = 0;
		 assertEquals(expected,actual);
	}

	@Test
	void testLoanDetails() {
	
		LoanApplyDetails actual = loanService.loanDetails(1);
		
		LoanApplyDetails expected = new LoanApplyDetails(100, 01, 1000, "10/01/2012", "Chennai", 6000);
	
		assertEquals(expected,actual);
	}

	@Test
	void testGetAllLoanDetails() {
		
		List<LoanApplyDetails> actual = loanService.getAllLoanDetails();
		
		List<LoanApplyDetails> expected = new ArrayList<>();
		LoanApplyDetails ld = new LoanApplyDetails(200, 02, 2000, "10/01/2012", "Chennai", 7000);
		LoanApplyDetails ld1 = new LoanApplyDetails(100, 01, 1000, "10/01/2012", "Chennai", 6000);
		expected.add(ld);
		expected.add(ld1);
		
		assertEquals(expected,actual);
		
	}

}
