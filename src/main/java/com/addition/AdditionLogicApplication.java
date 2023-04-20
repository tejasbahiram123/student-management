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
<<<<<<< Updated upstream
	public String message3() {
		return "hello ok";
	}

=======
	//stash demo
	public String message2() {
		return "hello friends";
	}
>>>>>>> Stashed changes
}
