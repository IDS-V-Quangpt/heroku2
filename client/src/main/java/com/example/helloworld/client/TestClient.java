package com.example.helloworld.client;


import org.springframework.cloud.openfeign.FeignClient;
import com.example.helloworld.api.TestController;

@FeignClient(name = "test", url = TestClientConfiguration.TEST_CLIENT_URL)
public interface TestClient extends TestController {

}
