package com.test.negocio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.negocio.models.Post;
import com.test.negocio.models.Test;
import com.test.negocio.service.negocioServiceFeign;

@RestController
@RequestMapping("/negocio")
public class negocioController {

	@Autowired
	private negocioServiceFeign negocioServiceFeign;
	
	@GetMapping
	public ResponseEntity<List<Test>> listarTest(){
		List<Test> test = negocioServiceFeign.getAll();
		if(test.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(test);
	}
	
	@GetMapping("/{idUser}")
	public ResponseEntity<Test> obtenerTest(@PathVariable("idUser") int id){
		Test test = negocioServiceFeign.getUserById(id);
		if(test == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(test);
	}
	
	@PostMapping
	public ResponseEntity<Test> guardarTest(@RequestBody Test test){
		Test newTest = negocioServiceFeign.save(test);
		return ResponseEntity.ok(newTest);
	} 
	
	@GetMapping("/posts")
	public ResponseEntity<List<Post>> getPost(){
		List<Post> post = negocioServiceFeign.getPosts();
		if(post.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(post);
	}
}
