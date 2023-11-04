package com.hexaware.app.loanmanagementapp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.hexaware.app.loanmanagementapp.entities.CustomerDetails;
import com.hexaware.app.loanmanagementapp.entities.LoanStatus;
import com.hexaware.app.loanmanagementapp.service.CustomerServiceImp;

class CustomerServiceImpTest {

	CustomerServiceImp cust = new CustomerServiceImp();
	CustomerDetails cd = new CustomerDetails();
	@Test
	void testCustomerRegisteration() {
		
		int actual = cust.customerRegisteration(cd);
		int expected = 0;
		assertEquals(expected,actual);
		
	}

	@Test
	void testUpdateCustomer() {
		
		int actual = cust.updateCustomer(cd);
		int expected = 0;
		assertEquals(expected,actual);
	}

	@Test
	void testDeleteCustomer() {
		
		int actual = cust.deleteCustomer(1);
		int expected = 0;
		assertEquals(expected,actual);
		
	}

	@Test
	void testGetCustomerById() {
		
		CustomerDetails actual = cust.getCustomerById(1);
		CustomerDetails expected = new CustomerDetails(1, "Navaneet", "ink", "admin", "coimbatore","Tn", "india", "ink@gmail.com");
				assertEquals(expected,actual);
	}

	@Test
	void testGetAllCustomer() {
		
		List<CustomerDetails> actual = cust.getAllCustomer();
		
		List<CustomerDetails> expected = new ArrayList<>();
		
		CustomerDetails c1 = new CustomerDetails(1, "Navaneet", "ink", "admin", "coimbatore","Tn", "india", "ink@gmail.com");
		CustomerDetails c2 = new CustomerDetails(1, "Sumnn", "ink2", "devlopment", "coimbatore","Tn", "india", "ink1@gmail.com");
		
		expected.add(c1);
		expected.add(c2);
		assertEquals(expected,actual);
	}

	@Test
	void testGetLoanStatus() {
		
		LoanStatus actual = cust.getLoanStatus(1);
		
		LoanStatus expected = new LoanStatus(101, "Approved");
		
		assertEquals(expected,actual);
		
	}

}
