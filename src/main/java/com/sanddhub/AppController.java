package com.sanddhub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanddhub.model.User;
import com.sanddhub.services.UserDAOImpl;

@Controller
@SpringBootApplication
public class AppController {

	// Wire the UserDao used inside this controller.
	@Autowired
	private UserDAOImpl userDao;

	@RequestMapping("/")
	@ResponseBody
	String getWelcomeMessage() {
		return "Hello World!";
	}

	@RequestMapping(value = "/create")
	@ResponseBody
	public String create() {
		try {
			User user = new User("jj@wp.pl", "pass");
			userDao.create(user);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "User succesfully created!";
	}

	public static void main(String[] args) {
		SpringApplication.run(AppController.class, args);
	}
}