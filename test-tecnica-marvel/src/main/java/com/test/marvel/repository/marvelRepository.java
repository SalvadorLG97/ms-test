package com.test.marvel.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.marvel.models.Marvel;
import com.test.marvel.models.Post;

@FeignClient(name = "marvel-api",url = "${marvel-api.url}")
public interface marvelRepository {

	@GetMapping
	public List<Marvel> getListMarvel();
	
	@GetMapping("/posts")
	public List<Post> getListPosts();
}
