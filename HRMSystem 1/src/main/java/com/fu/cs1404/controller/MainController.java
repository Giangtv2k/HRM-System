package com.fu.cs1404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {


	@RequestMapping(value = { "/home", "/" }, method = RequestMethod.GET)
	public String home(Model model) {
			
		return "home";
	}
	
	@RequestMapping(value = { "/homepage"}, method = RequestMethod.GET)
	public String homepage(Model model) {
			
		return "homepage";
	}
}
