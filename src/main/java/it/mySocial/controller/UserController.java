package it.mySocial.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.mySocial.model.User;

//qui per far si che una volta lanciato sia un rest
@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {
	
	//qui dichiaro che è una richiesta get
	@GetMapping
	public List<User> getUser(){
		return List.of(
				new User(1, "Tony Pova", "tony@gmail.com", "Habemus tanica"),
				new User(2, "Jonny Pova", "Jonny@gmail.com", "Habemus la tanicas"),
				new User(3, "Franco Pova", "a@gmail.com", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."),
				new User(4, "Alfons Pova", "b@gmail.com", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."),
				new User(5, "Giulia Pova", "c@gmail.com", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Dui vivamus arcu felis bibendum ut tristique et egestas quis.")
				);
	}
}
