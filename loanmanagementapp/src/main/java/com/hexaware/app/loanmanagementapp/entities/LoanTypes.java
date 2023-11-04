package com.hexaware.app.loanmanagementapp.entities;

import java.util.Objects;

public class LoanTypes {

	private int loanTypeId;
	private String loanTypeName;
	private float loanInterestRate;
	private int loanTerm;
	private String loanDescription;
	private int loanManagementFees;
	
	
	
	public LoanTypes() {
		// TODO Auto-generated constructor stub
	}



	public LoanTypes(int loanTypeId, String loanTypeName, float loanInterestRate, int loanTerm, String loanDescription,
			int loanManagementFees) {
		super();
		this.loanTypeId = loanTypeId;
		this.loanTypeName = loanTypeName;
		this.loanInterestRate = loanInterestRate;
		this.loanTerm = loanTerm;
		this.loanDescription = loanDescription;
		this.loanManagementFees = loanManagementFees;
	}



	public int getLoanTypeId() {
		return loanTypeId;
	}



	public void setLoanTypeId(int loanTypeId) {
		this.loanTypeId = loanTypeId;
	}



	public String getLoanTypeName() {
		return loanTypeName;
	}



	public void setLoanTypeName(String loanTypeName) {
		this.loanTypeName = loanTypeName;
	}



	public float getLoanInterestRate() {
		return loanInterestRate;
	}



	public void setLoanInterestRate(float loanInterestRate) {
		this.loanInterestRate = loanInterestRate;
	}



	public int getLoanTerm() {
		return loanTerm;
	}



	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}



	public String getLoanDescription() {
		return loanDescription;
	}



	public void setLoanDescription(String loanDescription) {
		this.loanDescription = loanDescription;
	}



	public int getLoanManagementFees() {
		return loanManagementFees;
	}



	public void setLoanManagementFees(int loanManagementFees) {
		this.loanManagementFees = loanManagementFees;
	}



	@Override
	public int hashCode() {
		return Objects.hash(loanDescription, loanInterestRate, loanManagementFees, loanTerm, loanTypeId, loanTypeName);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoanTypes other = (LoanTypes) obj;
		return Objects.equals(loanDescription, other.loanDescription)
				&& Float.floatToIntBits(loanInterestRate) == Float.floatToIntBits(other.loanInterestRate)
				&& loanManagementFees == other.loanManagementFees && loanTerm == other.loanTerm
				&& loanTypeId == other.loanTypeId && Objects.equals(loanTypeName, other.loanTypeName);
	}



	@Override
	public String toString() {
		return "LoanTypes [loanTypeId=" + loanTypeId + ", loanTypeName=" + loanTypeName + ", loanInterestRate="
				+ loanInterestRate + ", loanTerm=" + loanTerm + ", loanDescription=" + loanDescription
				+ ", loanManagementFees=" + loanManagementFees + "]";
	}

	
	
}
