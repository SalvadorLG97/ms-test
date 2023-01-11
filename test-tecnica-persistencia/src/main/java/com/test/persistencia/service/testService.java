package com.test.persistencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.persistencia.models.Test;
import com.test.persistencia.repository.testRepository;

@Service
public class testService {

	@Autowired
	private testRepository testRepository;
	
	public List<Test> getAll(){
		return testRepository.findAll();
	}
	
	public Test getUserById(int id) {
		return testRepository.findById(id).orElse(null);
	}
	
	public Test save(Test test) {
		Test newUser = testRepository.save(test);
		return newUser;
	}
}
