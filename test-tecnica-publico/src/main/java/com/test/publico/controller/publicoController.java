package com.test.publico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.publico.models.Post;
import com.test.publico.models.Test;
import com.test.publico.service.publicServiceFeign;

@RestController
@RequestMapping("/publico")
public class publicoController {

	@Autowired
	private publicServiceFeign publicServiceFeign;
	
	@GetMapping
	public ResponseEntity<List<Test>> listarTest(){
		List<Test> test = publicServiceFeign.getAll();
		if(test.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(test);
	}
	
	@GetMapping("/{idUser}")
	public ResponseEntity<ResponseEntity<Test>> obtenerTest(@PathVariable("idUser") int id){
		ResponseEntity<Test> test = publicServiceFeign.getUserById(id);
		if(test == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(test);
	}
	
	@PostMapping
	public ResponseEntity<ResponseEntity<Test>> guardarTest(@RequestBody Test test){
		ResponseEntity<Test> newTest = publicServiceFeign.save(test);
		return ResponseEntity.ok(newTest);
	} 
	
	@GetMapping("/posts")
	public ResponseEntity<List<Post>> getPost(){
		List<Post> post = publicServiceFeign.getPosts();
		if(post.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(post);
	}
}
