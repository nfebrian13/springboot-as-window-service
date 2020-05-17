package com.boot.window;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class SpringbootAsWindowServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAsWindowServiceApplication.class, args);
	}

	@Scheduled(fixedRate = 5000)
	public void printDate() {
		System.out.println("Hello World service: " + new Date());
	}

}
