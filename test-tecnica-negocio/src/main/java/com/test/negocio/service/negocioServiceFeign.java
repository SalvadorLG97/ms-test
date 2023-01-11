package com.test.negocio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.test.negocio.models.Post;
import com.test.negocio.models.Test;
import com.test.negocio.repository.negocioRepository;
import com.test.negocio.repository.postRepository;

@Service("serviceFeign")
@Primary
public class negocioServiceFeign {

	@Autowired
	private negocioRepository negocioRepository;
	
	@Autowired
	private postRepository postRepository;
	
	public List<Test> getAll(){
		return negocioRepository.getListTest();
	}
	
	public ResponseEntity<Test> getUserById(int id) {
		ResponseEntity<Test> test = negocioRepository.obtenerTest(id);
		return test;
	}
	
	public ResponseEntity<Test> save(Test test) {
		ResponseEntity<Test> newUser = negocioRepository.guardarTest(test);
		return newUser;
	}
	
	public List<Post> getPosts(){
		return postRepository.getListPosts();
	}
}
