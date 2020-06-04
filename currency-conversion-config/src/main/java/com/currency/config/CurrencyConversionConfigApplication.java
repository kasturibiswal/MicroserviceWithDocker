package com.currency.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CurrencyConversionConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionConfigApplication.class, args);
	}

}
