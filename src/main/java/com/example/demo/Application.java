package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
private static final String REST-URL ="https://www.equifax.com/getScores";

	public static void main(String[] args) {
		ConfigurableApplicationContext run= SpringApplication.run(Application.class, args);
		run.close();
		// changes for HIS-134
	}

}
