package com.test.negocio.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.negocio.models.Post;

@FeignClient(name = "test-tecnica-marvel",url = "http://localhost:8083")
public interface postRepository {

	@GetMapping("/marvel")
	public List<Post> getListPost();
	
	@GetMapping("/posts")
	public List<Post> getListPosts();
}
