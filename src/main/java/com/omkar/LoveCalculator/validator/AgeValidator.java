package com.omkar.LoveCalculator.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer>{
	
	private int upper;
	private int lower;
	
	@Override
	public void initialize(Age age) {
		// all the initialization work will be done here .
		this.upper =  age.upper();
		this.lower = age.lower();
	}

	@Override
	public boolean isValid(Integer inputAge, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if ( inputAge == null) {
			return false;
		}
		
		if (inputAge < lower || inputAge > upper) {
			return false;
		}
		return true;
	}

}
