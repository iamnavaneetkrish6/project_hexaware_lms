package com.hexaware.app.loanmanagementapp;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.app.loanmanagementapp.entities.AdminDetails;
import com.hexaware.app.loanmanagementapp.entities.LoanStatus;
import com.hexaware.app.loanmanagementapp.entities.LoanTypes;
import com.hexaware.app.loanmanagementapp.service.AdminServiceImp;

class AdminServiceImpTest {
  
    AdminServiceImp admin = new AdminServiceImp(); 
	AdminDetails ad1 = new AdminDetails();
	LoanTypes loantype = new LoanTypes();
	LoanStatus loanstatus = new LoanStatus();
	
	@Test
	void testCreateAdmin() {
			int actual = admin.createAdmin(ad1);
			int expected = 0;
			assertEquals(expected, actual);
		 
	}

	@Test
	void testUpdateAdmin() {
		int actual = admin.updateAdmin(ad1);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	void testDeleteAdmin() {
		int actual = admin.deleteAdmin(1);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	void testGetAdminById() {
		
		AdminDetails actual = admin.getAdminById(1);
		AdminDetails expected = new AdminDetails(1, "Dhone", "Dhoni@gmail.com", "Dhoni7", "dhnioj");
		assertEquals(expected, actual);
	}

	@Test
	void testGetAllAdmin() {
		
		List<AdminDetails> actual = admin.getAllAdmin();
		
		List<AdminDetails> expected = new ArrayList<>();
		AdminDetails a1 = new AdminDetails(1, "Dhone", "Dhoni@gmail.com", "Dhoni7", "dhnioj");
		AdminDetails a2 = new AdminDetails(1, "virat", "virat@gmail.com", "virat18", "virat0");
		expected.add(a1);
		expected.add(a2);
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testCreateLoanType() {
		
		int actual = admin.createLoanType(loantype);
		int expected = 0;
		assertEquals(expected, actual);
		
	}

	@Test
	void testUpdateLoanType() {
		
		int actual = admin.updateLoanType(loantype);
		int expected = 0;
		assertEquals(expected, actual);
		
	}

	@Test
	void testDeleteLoanType() {
		
		int actual = admin.deleteLoanType(1);
		int expected = 0;
		assertEquals(expected, actual);
		
	}

	@Test
	void testGetLoanType() {
		LoanTypes actual = admin.getLoanType(1);
		LoanTypes expected = new LoanTypes(1, "Car loan", 13.7f, 5, "Collateral required", 5000);
		assertEquals(expected, actual);
	}

	@Test
	void testGetAllLoanType() {
		
		List<LoanTypes> actual = admin.getAllLoanType();
		List<LoanTypes> expected = new ArrayList<>();
		LoanTypes loantype = new LoanTypes(1, "Car loan", 13.7f, 5, "Collateral required", 5000);
		LoanTypes loantype2 = new LoanTypes(2, "bike loan", 11.7f, 5, "Collateral required", 1000);
		expected.add(loantype);
		expected.add(loantype2);
		assertEquals(expected, actual);
		
	}

	@Test
	void testCreateLoanStatus() {
		int actual = admin.createLoanStatus(loanstatus);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	void testUpdateLoanStatus() {
		int actual = admin.updateLoanStatus(loanstatus);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	void testDeleteLoanStatus() {
		int actual = admin.deleteLoanStatus(1);
		int expected = 0;
		assertEquals(expected, actual);
	}

	@Test
	void testGetLoanStatus() {
		LoanStatus actual = admin.getLoanStatus(1);
		LoanStatus expected = new LoanStatus(1, "Approved");
		assertEquals(expected, actual);
	}

	@Test
	void testGetAllLoanStatus() {
	
		List<LoanStatus> actual = admin.getAllLoanStatus();
		
		List<LoanStatus> expected = new ArrayList<>();
	    LoanStatus loanStatus = new LoanStatus(1, "Approved");
		LoanStatus loanStatus1 = new LoanStatus(2, "Approved");
		expected.add(loanStatus);
		expected.add(loanStatus1);
		assertEquals(expected, actual);
	}

}
