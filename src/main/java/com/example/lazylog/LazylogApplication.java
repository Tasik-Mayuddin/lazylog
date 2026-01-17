package com.example.lazylog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LazylogApplication {

	public static void main(String[] args) {
		SpringApplication.run(LazylogApplication.class, args);
	}

}
