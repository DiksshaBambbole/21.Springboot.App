package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
int a=2;
// HIS-302

	public static void main(String[] args) {
		ConfigurableApplicationContext run= SpringApplication.run(Application.class, args);
		run.close();
		// changes for HIS-134
	}

}
