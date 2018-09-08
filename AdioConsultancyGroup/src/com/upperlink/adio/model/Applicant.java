package com.upperlink.adio.model;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Applicant {
	@NotNull
	private String firstname;
	
	@NotNull
	@Size(min=2, max= 50, message="Invalid Length for account holder name")
	@Pattern(regexp="[A-Za-z(\\s)]+", message="Invalid Account holder name")
	private String surname;
	
	@NotNull(message="Balance cant be blank")
	@Min(value=5000, message="Minimum balance must not be less than 5000")
	private String phoneNo;
	
	@NotNull(message="AccountType cant be blank")
	private String email;
	
	
	public Applicant() {
		firstname= "";
		surname = "";
		phoneNo = "";
		email = "";
	}
	
	public Applicant(String Firstname, String Surname, String Phone, String Email) {
		this.firstname = Firstname;
		this.surname = Surname;
		this.phoneNo = Phone;
		this.email = Email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	


}
