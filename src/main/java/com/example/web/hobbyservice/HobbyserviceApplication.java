package com.example.web.hobbyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HobbyserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HobbyserviceApplication.class, args);
	}

}
