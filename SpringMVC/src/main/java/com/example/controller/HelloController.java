package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

		@RequestMapping("/welcome")
		public String Welcome()
		{
			return "Welcome to Spring MVC";
		}

}
