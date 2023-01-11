package com.test.persistencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.persistencia.models.Test;
import com.test.persistencia.service.testService;

@RestController
@RequestMapping("/test")
public class testController {

	@Autowired
	private testService testService;
	
	@GetMapping
	public ResponseEntity<List<Test>> listarTest(){
		List<Test> test = testService.getAll();
		if(test.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(test);
	}
	
	@GetMapping("/{idUser}")
	public ResponseEntity<Test> obtenerTest(@PathVariable("idUser") int id){
		Test test = testService.getUserById(id);
		if(test == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(test);
	}
	
	@PostMapping
	public ResponseEntity<Test> guardarTest(@RequestBody Test test){
		Test newTest = testService.save(test);
		return ResponseEntity.ok(newTest);
	}
}
