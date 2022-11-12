package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run= SpringApplication.run(Application.class, args);
		run.close();
		// changes for HIS-134
	}
    public void doProcess(){
    //method HIH-200 PART
    }
}
