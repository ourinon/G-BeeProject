package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication

@CrossOrigin("*")
public class GBeeWikiApplication {

	public static void main(String[] args) {
		System.out.println("Run");
		SpringApplication.run(GBeeWikiApplication.class, args);
	}

}
