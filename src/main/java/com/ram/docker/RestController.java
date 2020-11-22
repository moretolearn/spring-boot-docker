package com.ram.docker;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController

public class RestController {

	@RequestMapping("/docker-test")
	public String getDocker() {
		return "Spring Boot Docker Project Example";
	}
}
