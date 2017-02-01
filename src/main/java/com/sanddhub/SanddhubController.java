package com.sanddhub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sanddhub.services.HelloWorldService;
import com.sanddhub.services.UserDAOImpl;

@Controller
public class SanddhubController {

	// Wire the UserDao used inside this controller.
	@Autowired
	private UserDAOImpl userDao;

	private final Logger logger = LoggerFactory.getLogger(SanddhubController.class);
	private final HelloWorldService helloWorldService;

	@Autowired
	public SanddhubController(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	// @RequestMapping(value = "/", method = RequestMethod.GET)
	// public String index(Map<String, Object> model) {
	//
	// logger.debug("index() is executed!");
	//
	// model.put("title", helloWorldService.getTitle(""));
	// model.put("msg", helloWorldService.getDesc());
	//
	// return "index";
	// }

	@RequestMapping("/")
	public String callIndexPage() {
		return "index";
	}

	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("name") String name) {

		logger.debug("hello() is executed - $name {}", name);

		ModelAndView model = new ModelAndView();
		model.setViewName("index");

		model.addObject("title", helloWorldService.getTitle(name));
		model.addObject("msg", helloWorldService.getDesc());

		return model;

	}

	// @RequestMapping("/")
	// @ResponseBody
	// String getWelcomeMessage() {
	// return "Hello World!";
	// }
	//
	// @RequestMapping(value = "/create")
	// @ResponseBody
	// public String create() {
	// try {
	// User user = new User("jj@wp.pl", "pass");
	// userDao.create(user);
	// } catch (Exception ex) {
	// return "Error creating the user: " + ex.toString();
	// }
	// return "User succesfully created!";
	// }


}