package com.test.negocio.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.negocio.models.Test;

@FeignClient(name = "test-tecnica-persistencia", url = "http://localhost:8081")
public interface negocioRepository{

	@GetMapping("/test")
	public List<Test> getListTest();
	
	@GetMapping("/test/{idUser}")
	public Test obtenerTest(@PathVariable("idUser") int id);
	
	@PostMapping("/test")
	public Test guardarTest(@RequestBody Test test);
	
}
