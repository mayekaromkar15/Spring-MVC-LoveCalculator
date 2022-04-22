package com.omkar.LoveCalculator.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.omkar.LoveCalculator.Entity.Communication;
import com.omkar.LoveCalculator.Entity.Phone;
import com.omkar.LoveCalculator.Entity.UserRegisterDTO;

@Controller
public class LcAppRegisterController {

	@GetMapping("/register")
	public String register(@ModelAttribute("registerDTO") UserRegisterDTO userRegisterDTO) {
		System.out.println("Inside register method");
		
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("9876543212");
		Communication communication = new Communication();
		communication.setPhone(phone);
		
		userRegisterDTO.setCommunication(communication);
		return "register";
	}
	
	
	@GetMapping("process-result")
	public String processRegistration(@Valid @ModelAttribute("registerDTO") UserRegisterDTO userRegisterDTO, BindingResult result) {
		System.out.println("Inside process-result method");
		if(result.hasErrors()) {
			System.out.println("My page has errors.");
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError objectError : allErrors) {
				System.out.println(objectError);
			}
			return "register";
		}
		
		System.out.println("Inside process Registration method. ");
		return "register-result";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "name", stringTrimmer);
		
//		binder.setDisallowedFields("name");
		System.out.println("Init binder");
	}
}
