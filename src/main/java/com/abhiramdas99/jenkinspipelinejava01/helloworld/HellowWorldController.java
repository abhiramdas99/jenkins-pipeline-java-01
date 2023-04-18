package com.abhiramdas99.jenkinspipelinejava01.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowWorldController {
	
	@RequestMapping(method=RequestMethod.GET, path="/abhiram")
	public String helloWorld() {
		return "welcome";
	}
}
