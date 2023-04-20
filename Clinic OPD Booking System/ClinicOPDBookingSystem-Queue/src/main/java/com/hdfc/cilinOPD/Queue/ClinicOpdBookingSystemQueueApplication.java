package com.hdfc.cilinOPD.Queue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClinicOpdBookingSystemQueueApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicOpdBookingSystemQueueApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}

}
