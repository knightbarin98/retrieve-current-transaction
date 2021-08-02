package com.mrbarin.microservicios.retrievecurrenttransaction.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import lombok.extern.slf4j.Slf4j;

@EnableEurekaClient
@SpringBootApplication
@Slf4j
public class RetrieveCurentTransactionApplication {

	public static void main(String[] args) {
		log.info("Application start");
		SpringApplication.run(RetrieveCurentTransactionApplication.class, args);
	}

}
