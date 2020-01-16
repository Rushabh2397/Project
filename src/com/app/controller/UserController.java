package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.daos.IUserDao;
import com.app.pojos.RegistrationDetails;
import com.app.pojos.Role;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private IUserDao dao;
	public UserController() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside user Controller"+getClass().getName());
	}
	
	
	
	
	@GetMapping("/login") // @RequestMapping(method = RequestMethod.GET)
	public String showLoginForm() {
	
		System.out.println("in show loging form");
		return "/user/login";
	}
	@PostMapping("/login") // @RequestMapping(method = RequestMethod.POST)
	public String processLoginForm(@RequestParam String email, @RequestParam(name = "password") String pass)
	{
	System.out.println("in process login form " + email + " " + pass);
//		// validate user from DB
	try {
			// invoke Dao's method
         RegistrationDetails r = dao.validateUser(email, pass);

		if (r.getRole().equals(Role.ADMIN))
				return "redirect:/vendor/details";
		return "redirect:/admin/list";
	} catch (RuntimeException e) {

     		return "/user/login";
	}

	}

}
