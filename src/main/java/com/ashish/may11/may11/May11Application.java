package com.ashish.may11.may11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class May11Application {

	public static void main(String[] args) {

		SpringApplication.run(May11Application.class, args);
	}

	@RequestMapping(value = "/hello")
	public String hello()
	{
		return "Hello World";
	}

	@RequestMapping(value = "/hi")
	public String hi()
	{
		return "Hi ,How are ya";
	}
}
