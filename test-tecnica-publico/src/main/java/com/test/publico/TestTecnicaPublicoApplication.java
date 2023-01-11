package com.test.publico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TestTecnicaPublicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestTecnicaPublicoApplication.class, args);
	}

}
