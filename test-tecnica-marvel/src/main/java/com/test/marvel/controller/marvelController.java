package com.test.marvel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.marvel.models.Marvel;
import com.test.marvel.models.Post;
import com.test.marvel.service.marvelService;

@RestController
public class marvelController {

	@Autowired
	private marvelService marvelService;
	
	@GetMapping("/marvel")
	public ResponseEntity<List<Marvel>> listarMarvel(){
		List<Marvel> marvel = marvelService.getAll();
		if(marvel.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(marvel);
	}
	
	@GetMapping("/posts")
	public ResponseEntity<List<Post>> listPosts(){
		List<Post> posts = marvelService.getPosts();
		if(posts.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(posts);
	}
}
