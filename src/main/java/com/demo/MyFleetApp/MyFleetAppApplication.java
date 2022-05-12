package com.demo.MyFleetApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.demo.MyFleetApp")
public class MyFleetAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFleetAppApplication.class, args);
	}

}
