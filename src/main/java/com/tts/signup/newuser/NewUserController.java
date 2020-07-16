package com.tts.signup.newuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.subscriberlist.subscriber.Subscriber;

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
		newUserRepository.save(new Subscriber(subscriber.getFirstName(),
	    subscriber.getLastname(), subscriber.getUserName(), subscriber.getSignedUp()));
		model.addAttribute("firstName", subscriber.getFirstName());
		model.addAttribute("lastName", subscriber.getLastname());
		model.addAttribute("userName", subscriber.getUserName());
		return "subscriber/result";

	
}
