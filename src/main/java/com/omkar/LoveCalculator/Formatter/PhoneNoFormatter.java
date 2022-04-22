package com.omkar.LoveCalculator.Formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.omkar.LoveCalculator.Entity.Phone;

public class PhoneNoFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		// TODO Auto-generated method stub
		System.out.println("Inside print method");
		return phone.getCountryCode() + "-" + phone.getUserNumber();
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Inside the parse method of phone no interface");
		Phone phone = new Phone();
		// split the string received from the user.
		String[] phoneNumberArray = completePhoneNumber.split("-");
		System.out.println(phoneNumberArray);
		int indexOf = completePhoneNumber.indexOf("-");
		if (indexOf == -1) {
			phone.setCountryCode("91");
			phone.setUserNumber(phoneNumberArray[0]);

		} else {

			phone.setCountryCode(phoneNumberArray[0]);
			phone.setUserNumber(phoneNumberArray[1]);
			// Extract the country code
		}
		return phone;
	}

}
