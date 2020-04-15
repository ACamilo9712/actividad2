package com.example.actividad2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication(exclude = {JacksonAutoConfiguration.class})
public class Actividad2Application {

	public static void main(String[] args) {
		SpringApplication.run(Actividad2Application.class, args);
		System.out.println("Hola SpringBoot");
	}

}
