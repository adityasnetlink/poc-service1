package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class PocService1Application {

	public static void main(String[] args) {
		SpringApplication.run(PocService1Application.class, args);
	}

}
