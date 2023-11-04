package com.hexaware.app.loanmanagementapp;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.app.loanmanagementapp.entities.CustomerLoanHistory;
import com.hexaware.app.loanmanagementapp.service.CustomerLoanHistoryServiceImp;

class CustomerLoanHistoryServiceImpTest {

	
	
	CustomerLoanHistoryServiceImp history = new CustomerLoanHistoryServiceImp();
	CustomerLoanHistory ch = new CustomerLoanHistory();
	
	
	@Test
	void testCreateLoanHistory() {
		
		int actual = history.createLoanHistory(ch);
		int expected = 0;
		assertEquals(expected, actual);
		
	}

	@Test
	void testUpdateLoanHistory() {
	
		int actual = history.updateLoanHistory(ch);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	void testDeleteLoanHistory() {
		
		int actual = history.deleteLoanHistory(1);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	void testGetByLoanNo() {
		
		CustomerLoanHistory actual = history.getByLoanNo(1);
		CustomerLoanHistory expected = new CustomerLoanHistory(100, 1000, "Done", 101);
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testGetLoanHistory() {
		
		List<CustomerLoanHistory> actual =history.getLoanHistory();
		
		List<CustomerLoanHistory> expected = new ArrayList<>();
		CustomerLoanHistory ch2 = new CustomerLoanHistory(100, 1000, "Done", 101);
		CustomerLoanHistory ch1 = new CustomerLoanHistory(100, 1000, "Done", 101);
		expected.add(ch1);
		expected.add(ch2);
		assertEquals(expected, actual);
		
	}

}
