package com.example.helloworld.controller.mapper;


import org.mapstruct.Mapper;

import com.example.helloworld.domain.Test;
import com.example.helloworld.api.dto.request.HelloWorldRequestDTO;
import com.example.helloworld.api.dto.response.HelloWorldResponseDTO;

@Mapper(componentModel="spring")
public interface TestMapper {


	public HelloWorldResponseDTO toHelloWorldResponseDTO(Test test);

	public Test toTest(HelloWorldRequestDTO request);
}
