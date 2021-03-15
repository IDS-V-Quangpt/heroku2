package com.example.helloworld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.helloworld.controller.mapper.TestMapper;
import com.example.helloworld.api.dto.request.HelloWorldRequestDTO;
import com.example.helloworld.domain.Test;
import com.example.helloworld.api.dto.response.HelloWorldResponseDTO;
import com.example.helloworld.api.TestController;
import com.example.helloworld.service.TestService;


@RestController
public class TestControllerImpl implements TestController{

	@Autowired
	private TestService testService;

	@Autowired
	private TestMapper testMapper;


	public  HelloWorldResponseDTO helloBitgrip(@RequestBody HelloWorldRequestDTO request) {
		Test result = testService.helloBitgrip(testMapper.toTest(request));
		return testMapper.toHelloWorldResponseDTO(result);
	}
}
