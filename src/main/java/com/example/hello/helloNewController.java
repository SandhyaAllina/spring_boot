package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class helloNewController {

	@GetMapping("/hello")
	public String greet() {
		
        return "This is Develop Branch !";
	}
}
