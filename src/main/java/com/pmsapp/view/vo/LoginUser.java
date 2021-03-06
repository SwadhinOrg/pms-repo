package com.pmsapp.view.vo;

import java.util.ArrayList;
import java.util.List;

import com.jpa.entities.AppFeature;
import com.jpa.entities.Company;
import com.jpa.entities.UserRole;

public class LoginUser {

	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private Long userId;
	private Long employeeId;
	private List<AppFeature> featureList = new ArrayList<AppFeature>();
	private List<String> accessLevelList = new ArrayList<String>();
	private String sysPassword;
	private Company company;
	private List<UserRole> userRoles=new ArrayList<UserRole>();

	public String getUsername() {
		return username;
	}
	public void setUsername(final String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(final String email) {
		this.email = email;
	}
	public List<UserRole> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(final List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(final Long userId) {
		this.userId = userId;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(final Long employeeId) {
		this.employeeId = employeeId;
	}
	public List<AppFeature> getFeatureList() {
		return featureList;
	}
	public void setFeatureList(final List<AppFeature> featureList) {
		this.featureList = featureList;
	}
	public List<String> getAccessLevelList() {
		return accessLevelList;
	}
	public void setAccessLevelList(final List<String> accessLevelList) {
		this.accessLevelList = accessLevelList;
	}
	public String getSysPassword() {
		return sysPassword;
	}
	public void setSysPassword(final String sysPassword) {
		this.sysPassword = sysPassword;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(final Company company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "LoginUser [username=" + username + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", userId="
				+ userId + ", featureList=" + featureList
				+ ", accessLevelList=" + accessLevelList + ", userRoles="
				+ userRoles + "]";
	}


}
