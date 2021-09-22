package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;

@Controller
public class LoginController {

	@RequestMapping("/first")
	public String function(){
		return "success";
	}
	@RequestMapping("/Login")
	public String loginPage(){
		return "Login";
	}
	//@RequestMapping(value= "/submit" , method = RequestMethod.POST)
	@PostMapping(value = "/submit")
	public ModelAndView submitPage(@RequestParam("userName") String  a , @RequestParam("password") String b){
		
		//System.out.println("Entered UserName: " + a);
		//System.out.println("Entered Password: " + b);
		ModelAndView modelAndView;
		if(b.equals("hcl")) { 
			modelAndView = new ModelAndView("success");
			modelAndView.addObject("key1", a);
			modelAndView.addObject("key2", b);
		}
		else {
			modelAndView = new ModelAndView("Error");
		}
		
		return modelAndView;
	}
	@RequestMapping("/submitobj")
	public String submitPageObject(@ModelAttribute User user){
		return "successobj";
	}
}
