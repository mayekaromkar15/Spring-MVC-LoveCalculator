package com.omkar.LoveCalculator.Entity;

import javax.validation.constraints.NotEmpty;

import com.omkar.LoveCalculator.validator.Age;

public class UserRegisterDTO {

	@NotEmpty(message = "* cannot be null")
	private String name;
	private String userName;
	private char[] password;
	private String[] hobbies;
	private String countries;
	private String gender;
	
	@Age(lower = 21, upper = 65)
	private int age;
	private Communication communication;
	
	
	public UserRegisterDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getCountries() {
		return countries;
	}

	public void setCountries(String countries) {
		this.countries = countries;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Communication getCommunication() {
		return communication;
	}

	public void setCommunication(Communication communication) {
		this.communication = communication;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public UserRegisterDTO(String name, String userName, char[] password, String[] hobbies, String countries,
			String gender, int age, Communication communication) {
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.hobbies = hobbies;
		this.countries = countries;
		this.gender = gender;
		this.age = age;
		this.communication = communication;
	}
	
	
	
	
	
}
