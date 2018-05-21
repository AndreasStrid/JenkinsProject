package com.deploy.jenkins;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application{

	private static Class<Application> applicationClass = Application.class;

	public static void main(String[] args) {
		SpringApplication.run(applicationClass, args); //"--degug"
	}
}

