package com.test.publico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.test.publico.models.Post;
import com.test.publico.models.Test;
import com.test.publico.repository.publicRepository;
import com.test.publico.repository.postRepository;

@Service("serviceFeign")
@Primary
public class publicServiceFeign {

	@Autowired
	private publicRepository publicRepository;
	
	@Autowired
	private postRepository postRepository;
	
	public List<Test> getAll(){
		return publicRepository.getListTest();
	}
	
	public ResponseEntity<Test> getUserById(int id) {
		ResponseEntity<Test> test = publicRepository.obtenerTest(id);
		return test;
	}
	
	public ResponseEntity<Test> save(Test test) {
		ResponseEntity<Test> newUser = publicRepository.guardarTest(test);
		return newUser;
	}
	
	public List<Post> getPosts(){
		return postRepository.getListPosts();
	}
}
