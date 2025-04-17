package com.PrimaryAndQualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.PrimaryAndQualifier.controller.ReportController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		ReportController b1 = context.getBean(ReportController.class);
		b1.generatedReport();
	}
}
