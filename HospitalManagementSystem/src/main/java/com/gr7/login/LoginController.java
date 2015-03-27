package com.gr7.login;


import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginview(Locale locale, Model model) {
		
		LoginForm loginForm= new LoginForm();
		model.addAttribute("loginForm",loginForm);
			
	logger.info("Forwarding to Login jsp");
	return "login";
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST,params = { "login" })
	public String login(@Validated LoginForm loginForm,BindingResult result,Locale locale, Model model) {
		
		String username = loginForm.getUserName();
		String password = loginForm.getPassword();
		logger.info("The user trying to login is.." + username + "password.." + password);
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
			return "home";
		}else{
		return "login";
		}
		
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST, params = { "signup" })
	public String signup(@Validated LoginForm loginForm,BindingResult result,Locale locale, Model model) {
		
		
		return "signup";
		}
	
	
}
