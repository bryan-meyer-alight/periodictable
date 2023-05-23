package com.brm.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.brm"})
public class PeriodicTableApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeriodicTableApplication.class, args);
	}

}
