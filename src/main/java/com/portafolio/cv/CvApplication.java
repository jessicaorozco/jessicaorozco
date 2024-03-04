package com.portafolio.cv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CvApplication {

	public static void main(String[] args) {
		SpringApplication.run(CvApplication.class, args);
		System.err.println("Hola cv");
	}

}
