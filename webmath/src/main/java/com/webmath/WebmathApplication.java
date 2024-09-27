package com.webmath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = { "com.webmath", "com.math" })
public class WebmathApplication {

	@Value("${server.port}")
	private static int port;

	public static void main(String[] args) {
		SpringApplication.run(WebmathApplication.class, args);
		log.info("WebmathApplication started in " + port);
	}

}
