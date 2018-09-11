
package org.arpit.java2blog.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public ModelAndView hello() {
		String helloWorldMessage = "Hello world from java2blog!";
		return new ModelAndView("hello", "message", helloWorldMessage);
	}
	
	@RequestMapping("/dashboard")
	public ModelAndView getHome() {
		String helloWorldMessage = "Dashboard!";
		return new ModelAndView("dashboard", "message", helloWorldMessage);
	}
	
	@RequestMapping(value={"", "/", "login"}, method = RequestMethod.GET)
	public String login(ModelMap model) {
		return "login";
	}
}
