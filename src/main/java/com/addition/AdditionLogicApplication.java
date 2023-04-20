package com.addition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdditionLogicApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdditionLogicApplication.class, args);
	}

	public String message() {
		return "hello";
	}
	public String message3() {
		return "hello ok";
	}

}
