package com.test.marvel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TestTecnicaMarvelApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestTecnicaMarvelApplication.class, args);
	}

}
