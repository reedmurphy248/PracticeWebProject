package com.tts.signup.newuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NewUserController {
	
	@Autowired
	private NewUserRepository newUserRepository;
	
	@GetMapping(value="/")
	public String index(NewUser newUser) {
		return "newUser/index";
	}
	
	@PostMapping(value = "/")
	public String addNewUser(NewUser newUser, Model model) {
		newUserRepository.save(new NewUser(newUser.getUserName(), newUser.getEmailAddress(), 
		newUser.getPassword(), newUser.getSignedUp()));
		model.addAttribute("userName", newUser.getUserName());
		model.addAttribute("emailAddress", newUser.getEmailAddress());
		model.addAttribute("passWord", newUser.getPassword());
		return "newUser/result";
	}

	
}
