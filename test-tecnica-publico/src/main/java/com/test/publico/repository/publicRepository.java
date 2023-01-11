package com.test.publico.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.publico.models.Test;

@FeignClient(name = "test-tecnica-persistencia-neg", url = "http://localhost:8082/negocio")
public interface publicRepository{

	@GetMapping
	public List<Test> getListTest();
	
	@GetMapping("/{idUser}")
	public Test obtenerTest(@PathVariable("idUser") int id);
	
	@PostMapping
	public Test guardarTest(@RequestBody Test test);
	
}
