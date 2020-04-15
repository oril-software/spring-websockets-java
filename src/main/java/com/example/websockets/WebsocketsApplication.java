package com.example.websockets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WebsocketsApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketsApplication.class, args);
	}

}
