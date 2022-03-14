package com.example.HelloInternet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloInternetApplication {

	public static void main(String[] args) {
		String string = "Hello Internet";

		SpringApplication.run(HelloInternetApplication.class, args);

	}

}
