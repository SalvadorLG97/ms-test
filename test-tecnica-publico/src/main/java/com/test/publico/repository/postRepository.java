package com.test.publico.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.publico.models.Post;

@FeignClient(name = "test-tecnica-marvel-neg",url = "negocio-app:8082/negocio")
public interface postRepository {

	@GetMapping("/marvel")
	public List<Post> getListPost();
	
	@GetMapping("/posts")
	public List<Post> getListPosts();
}
