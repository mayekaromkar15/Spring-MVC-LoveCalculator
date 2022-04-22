package com.omkar.LoveCalculator.Entity;

public class Communication {

	private String email;
	private Phone phone;
	
	public Communication() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Communication [email=" + email + "]";
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	
}
