package com.marcoscouto.desafiobatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class DesafiobatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafiobatchApplication.class, args);
	}

}
