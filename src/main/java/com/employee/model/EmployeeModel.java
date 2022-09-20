package com.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="employeeinfo")
@Getter
@Setter

public class EmployeeModel {
	@Id
    public int EmployeeID;
	public String EmployeeFullName;
	public String JobTitle;
	public String PhoneNumber;
	public String Email;
	public String Address;
	public String City;
	public String State;
	public String PrimaryEmergencyContact;
	public String PECPhoneNumber;
	public String PECRelationship;
	public String SecondaryEmergencyContact;
	public String SECPhoneNumber;
	public String SECRelationship;
	
	
	public EmployeeModel() {
		super();
	}
	
	public EmployeeModel(int employeeID,String employeeFullName, String jobTitle, String phoneNumber, String email, String address,
			String city, String state, String primaryEmergencyContact, String pECPhoneNumber, String pECRelationship,
			String secondaryEmergencyContact, String sECPhoneNumber, String sECRelationship) {
		
		super();
		EmployeeID = employeeID;
		EmployeeFullName = employeeFullName;
		JobTitle = jobTitle;
		PhoneNumber = phoneNumber;
		Email = email;
		Address = address;
		City = city;
		State = state;
		PrimaryEmergencyContact = primaryEmergencyContact;
		PECPhoneNumber = pECPhoneNumber;
		PECRelationship = pECRelationship;
		SecondaryEmergencyContact = secondaryEmergencyContact;
		SECPhoneNumber = sECPhoneNumber;
		SECRelationship = sECRelationship;
	}

	
	@Column
	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	
	@Column
	public String getEmployeeFullName() {
		return EmployeeFullName;
	}
	public void setEmployeeFullName(String employeeFullName) {
		EmployeeFullName = employeeFullName;
	}

	@Column
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}

	@Column
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	@Column
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

	@Column
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

	@Column
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}

	@Column
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}

	@Column
	public String getPrimaryEmergencyContact() {
		return PrimaryEmergencyContact;
	}
	public void setPrimaryEmergencyContact(String primaryEmergencyContact) {
		PrimaryEmergencyContact = primaryEmergencyContact;
	}

	@Column
	public String getPECPhoneNumber() {
		return PECPhoneNumber;
	}
	public void setPECPhoneNumber(String pECPhoneNumber) {
		PECPhoneNumber = pECPhoneNumber;
	}

	@Column
	public String getPECRelationship() {
		return PECRelationship;
	}
	public void setPECRelationship(String pECRelationship) {
		PECRelationship = pECRelationship;
	}

	@Column
	public String getSecondaryEmergencyContact() {
		return SecondaryEmergencyContact;
	}
	public void setSecondaryEmergencyContact(String secondaryEmergencyContact) {
		SecondaryEmergencyContact = secondaryEmergencyContact;
	}

	@Column
	public String getSECPhoneNumber() {
		return SECPhoneNumber;
	}
	public void setSECPhoneNumber(String sECPhoneNumber) {
		SECPhoneNumber = sECPhoneNumber;
	}

	@Column
	public String getSECRelationship() {
		return SECRelationship;
	}
	public void setSECRelationship(String sECRelationship) {
		SECRelationship = sECRelationship;
	}

	@Override
	public String toString() {
		return "EmployeeModel [EmployeeID=" + EmployeeID + ", EmployeeFullName=" + EmployeeFullName + ", JobTitle="
				+ JobTitle + ", PhoneNumber=" + PhoneNumber + ", Email=" + Email + ", Address=" + Address + ", City="
				+ City + ", State=" + State + ", PrimaryEmergencyContact=" + PrimaryEmergencyContact
				+ ", PECPhoneNumber=" + PECPhoneNumber + ", PECRelationship=" + PECRelationship
				+ ", SecondaryEmergencyContact=" + SecondaryEmergencyContact + ", SECPhoneNumber=" + SECPhoneNumber
				+ ", SECRelationship=" + SECRelationship + "]";
	}

	
	
}

// {
//     "EmployeeFullName" :"Jishnu",
//     "JobTitle" : "Intern",
//     "PhoneNumber" : "901834682",
//     "Email" : "jishnu@gmail.com",
//     "Address" : "ddk",
//     "City" : "RJY",
//     "State" : "Andhra pradesh",
//     "PrimaryEmergencyContact" : "subbu",
//     "PECPhoneNumber" : "728164918",
//     "PECRelationship" : "Father",
//     "SecondaryEmergencyContact" : "Lakshmi",
//     "SECPhoneNumber" : "9218740211",
//     "SECRelationship" : "Mother" 
// }
