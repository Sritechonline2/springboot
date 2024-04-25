package com.sritech.Ekart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.sritech.Ekart")
@SpringBootApplication
@EnableJpaRepositories("com.sritech.Ekart.repository")
@EntityScan("com.sritech.Ekart.adminEntity")

public class MainAnglePrintsApplication {

	public static void main(String[] args) {
		System.out.println("entred into main app");
		
		SpringApplication.run(MainAnglePrintsApplication.class, args);
		
	}

}
