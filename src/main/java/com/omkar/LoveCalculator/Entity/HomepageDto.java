package com.omkar.LoveCalculator.Entity;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class HomepageDto {

	@NotBlank(message = " * User Name Cannot be blank")
	@Size(min = 3, max = 6 , message = " * User Name must be in between 3 to 6 characters")
	private String userName;
	@NotBlank(message = " * Crush Name Cannot be blank")
	@Size(min = 3, max = 6 , message = " * Crush Name must be in between 3 to 6 characters")
	private String crushName;
	@AssertTrue(message = " * You will have to agree to the terms and condition")
	private boolean termAndCondition;
	
//	private String userName = "Mr Xx";
//	private String crushName = "Mrs Y";
	
	public HomepageDto() {
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	

	@Override
	public String toString() {
		return "HomepageDto [userName=" + userName + ", crushName=" + crushName + ", termAndCondition="
				+ termAndCondition + "]";
	}

	public boolean isTermAndCondition() {
		return termAndCondition;
	}

	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}
	
	
	
}
