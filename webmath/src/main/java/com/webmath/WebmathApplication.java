package com.webmath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.webmath", "com.math" })
public class WebmathApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebmathApplication.class, args);
	}

}
