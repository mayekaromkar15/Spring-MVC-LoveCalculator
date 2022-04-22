package com.omkar.LoveCalculator.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.omkar.LoveCalculator.Entity.EmailDto;

@Controller
public class EmailController {

	@RequestMapping("sendEmail")
	public String sendEmail(Model model) {
//		public String sendEmail(@CookieValue("LcApp.username") String userName, Model model) {
				
		System.out.println("Came to this method	");
		model.addAttribute("emailDTO", new EmailDto());
		return "send-email-page";
	}

	@GetMapping("/process-email")
	public String processEmail(@ModelAttribute("emailDTO") EmailDto emailDto) {
//		HttpSession httpsession, Model model) {
		
//		String username = (String)httpsession.getAttribute("username");
//		String newUsername = "Mr " + username;
//		model.addAttribute("newUsername", newUsername);
		
		return "process-email-page";
	}
}
