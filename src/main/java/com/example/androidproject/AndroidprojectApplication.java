package com.example.androidproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.androidproject")
@EnableAutoConfiguration
public class AndroidprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AndroidprojectApplication.class, args);
	}
// 로그인까지
}
