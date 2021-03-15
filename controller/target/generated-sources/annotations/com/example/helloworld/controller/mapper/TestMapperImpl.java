package com.example.helloworld.controller.mapper;

import com.example.helloworld.api.dto.request.HelloWorldRequestDTO;
import com.example.helloworld.api.dto.response.HelloWorldResponseDTO;
import com.example.helloworld.domain.Test;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-15T17:11:04+0700",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 1.3.1200.v20200916-0645, environment: Java 15.0.1 (Oracle Corporation)"
)
@Component
public class TestMapperImpl implements TestMapper {

    @Override
    public HelloWorldResponseDTO toHelloWorldResponseDTO(Test test) {
        if ( test == null ) {
            return null;
        }

        HelloWorldResponseDTO helloWorldResponseDTO = new HelloWorldResponseDTO();

        helloWorldResponseDTO.setId( test.getId() );
        helloWorldResponseDTO.setMessage( test.getMessage() );

        return helloWorldResponseDTO;
    }

    @Override
    public Test toTest(HelloWorldRequestDTO request) {
        if ( request == null ) {
            return null;
        }

        Test test = new Test();

        test.setMessage( request.getMessage() );

        return test;
    }
}
