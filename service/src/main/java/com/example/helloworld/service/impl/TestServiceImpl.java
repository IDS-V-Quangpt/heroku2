package com.example.helloworld.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.helloworld.service.TestService;
import com.example.helloworld.domain.Test;
import com.example.helloworld.domain.repository.TestRepository;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestRepository testRepository;

	public Test helloBitgrip(Test test) {
		return testRepository.save(test);

	}
}
