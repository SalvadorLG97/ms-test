package com.test.negocio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class TestTecnicaNegocioApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestTecnicaNegocioApplication.class, args);
	}

}
