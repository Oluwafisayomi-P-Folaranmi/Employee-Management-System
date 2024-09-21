package com.opf.student_management_system;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {

		return runner -> {
			String devName = "<developer's name>";
			System.out.println("Welcome " + devName);
			System.out.println("Your program is running...");
		};
	}
}
