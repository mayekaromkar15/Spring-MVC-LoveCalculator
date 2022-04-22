package com.omkar.LoveCalculator.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.omkar.LoveCalculator.Entity.HomepageDto;

@Controller
@SessionAttributes("homepage")
public class LcAppController {
	
	@GetMapping("/")
	public String homepage(Model model,HttpServletRequest request) {
		
		model.addAttribute("homepage", new HomepageDto());
//		Homepage homepageDTO = new Homepage();
//		model.addAttribute("homepage", homepageDTO);
		/*
		 * Cookie[] cookies = request.getCookies(); for (Cookie cookie : cookies) {
		 * 
		 * if("LcApp.username".equals(cookie.getName())) { String userNameVal =
		 * cookie.getValue(); homepageDTO.setUserName(userNameVal); } }
		 */
		return "homepage";
	} 

	@GetMapping("/process-homepage")
	public String processHomepage(@Valid @ModelAttribute("homepage") HomepageDto homepageDTO,
			BindingResult result, HttpServletRequest request) {
		System.out.println(homepageDTO.isTermAndCondition());
		if(result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError objectError : allErrors) {
				System.out.println(objectError);
			}
			
			return "homepage";
		}
//		model.addAttribute("homepage", homepageDTO.getUserName());
		
		/*
		 * // adding cookie to the browser. Cookie theCookie = new
		 * Cookie("LcApp.username", homepageDTO.getUserName() );
		 * theCookie.setMaxAge(120);
		 * 
		 * // add cookie to the response.
		 * 
		 * response.addCookie(theCookie);
		 */
		
		/*
		 * Creating a session object. 
		*/
		
		HttpSession session = request.getSession();
		session.setAttribute("username", homepageDTO.getUserName());
		session.setMaxInactiveInterval(120);
		//logic to calculate % between crush and username
		return "homepage-result";
	}
}
