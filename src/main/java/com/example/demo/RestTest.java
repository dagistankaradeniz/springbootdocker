package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTest {

	@RequestMapping("/")
	public String hello1() {
		return "Hello";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/")
	public String hello2(@RequestBody String name) {
		return "Hello "+name;
	}
}
