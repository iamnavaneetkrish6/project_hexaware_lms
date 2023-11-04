package com.hexaware.app.loanmanagementapp.entities;

import java.util.Objects;

public class AdminDetails {

	private int adminId;
	private String adminName;
	private String emailId;
	private String adminUsername;
	private String password;
	
	
	public AdminDetails() {
		// TODO Auto-generated constructor stub
	}


	public AdminDetails(int adminId, String adminName, String emailId, String adminUsername, String password) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.emailId = emailId;
		this.adminUsername = adminUsername;
		this.password = password;
	}


	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public String getAdminName() {
		return adminName;
	}


	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getAdminUsername() {
		return adminUsername;
	}


	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public int hashCode() {
		return Objects.hash(adminId, adminName, adminUsername, emailId, password);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdminDetails other = (AdminDetails) obj;
		return adminId == other.adminId && Objects.equals(adminName, other.adminName)
				&& Objects.equals(adminUsername, other.adminUsername) && Objects.equals(emailId, other.emailId)
				&& Objects.equals(password, other.password);
	}


	@Override
	public String toString() {
		return "AdminDetails [adminId=" + adminId + ", adminName=" + adminName + ", emailId=" + emailId
				+ ", adminUsername=" + adminUsername + ", password=" + password + "]";
	}

	
	
	
	
}
