package com.mario.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

@GetMapping("/hi")
public String hi(@RequestParam(value = "myVar", defaultValue = "<p>Please use /hi?myVar=NAME") String name) {
return String.format("My Lab 5 for mister/miss %s!", name);
}

}

