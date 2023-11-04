package com.hexaware.app.loanmanagementapp.entities;

import java.util.Objects;

public class LoanStatus {

	private int loanNo;
	private String loanStatus;
	
	public LoanStatus() {
		// TODO Auto-generated constructor stub
	}

	public LoanStatus(int loanNo, String loanStatus) {
		super();
		this.loanNo = loanNo;
		this.loanStatus = loanStatus;
	}

	public int getLoanNo() {
		return loanNo;
	}

	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(loanNo, loanStatus);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoanStatus other = (LoanStatus) obj;
		return loanNo == other.loanNo && Objects.equals(loanStatus, other.loanStatus);
	}

	@Override
	public String toString() {
		return "LoanStatus [loanNo=" + loanNo + ", loanStatus=" + loanStatus + "]";
	}

	
	
	
}
