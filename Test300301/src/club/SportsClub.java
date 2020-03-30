package club;

import java.time.LocalDate;

public class SportsClub  {

	String firstName;
	String lastName;
	String gender;
	LocalDate DOB;
	String nationality;
	String ageGroup;
	String role;
	
	
	String addressLine1;
	String addressLine2;
	String city;
	String state;
	 String country;
	String postcode;

	int count;
	
	/*
	 * public String getCount(int count2) { return count; }
	 */

public void setCount(int count) {
	this.count = count;
}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void  setDOB(LocalDate dOB) {
		 DOB = dOB;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return postcode;
	}

	public void setZipcode(String zipcode) {
		this.postcode = zipcode;
	}


	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	
	 

		


		 

}
