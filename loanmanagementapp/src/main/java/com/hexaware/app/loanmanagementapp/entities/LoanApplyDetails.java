package com.hexaware.app.loanmanagementapp.entities;

import java.util.Objects;

public class LoanApplyDetails {

	private int loanNo;
	private int loanTypeId;
	private double loanAmount;
	private String loanApplyDetails;
	private String propertyAddress;
	private int CustomerId;
	
	
	public LoanApplyDetails() {
		// TODO Auto-generated constructor stub
	}


	public LoanApplyDetails(int loanNo, int loanTypeId, double loanAmount, String loanApplyDetails,
			String propertyAddress, int customerId) {
		super();
		this.loanNo = loanNo;
		this.loanTypeId = loanTypeId;
		this.loanAmount = loanAmount;
		this.loanApplyDetails = loanApplyDetails;
		this.propertyAddress = propertyAddress;
		CustomerId = customerId;
	}


	public int getLoanNo() {
		return loanNo;
	}


	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}


	public int getLoanTypeId() {
		return loanTypeId;
	}


	public void setLoanTypeId(int loanTypeId) {
		this.loanTypeId = loanTypeId;
	}


	public double getLoanAmount() {
		return loanAmount;
	}


	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}


	public String getLoanApplyDetails() {
		return loanApplyDetails;
	}


	public void setLoanApplyDetails(String loanApplyDetails) {
		this.loanApplyDetails = loanApplyDetails;
	}


	public String getPropertyAddress() {
		return propertyAddress;
	}


	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}


	public int getCustomerId() {
		return CustomerId;
	}


	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}


	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(CustomerId, loanAmount, loanApplyDetails, loanNo, loanTypeId, propertyAddress);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoanApplyDetails other = (LoanApplyDetails) obj;
		return CustomerId == other.CustomerId
				&& Double.doubleToLongBits(loanAmount) == Double.doubleToLongBits(other.loanAmount)
				&& Objects.equals(loanApplyDetails, other.loanApplyDetails) && loanNo == other.loanNo
				&& loanTypeId == other.loanTypeId && Objects.equals(propertyAddress, other.propertyAddress);
	}


	@Override
	public String toString() {
		return "LoanApplyDetails [loanNo=" + loanNo + ", loanTypeId=" + loanTypeId + ", loanAmount=" + loanAmount
				+ ", loanApplyDetails=" + loanApplyDetails + ", propertyAddress=" + propertyAddress + ", CustomerId="
				+ CustomerId + "]";
	}

	
	
}
