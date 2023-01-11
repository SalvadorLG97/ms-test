package com.test.marvel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.marvel.models.Marvel;
import com.test.marvel.models.Post;
import com.test.marvel.repository.marvelRepository;

@Service
public class marvelService {

	@Autowired
	private marvelRepository marvelRepository;
	
	public List<Marvel> getAll(){
		return marvelRepository.getListMarvel();
	}
	
	public List<Post> getPosts(){
		return marvelRepository.getListPosts();
	}
}
