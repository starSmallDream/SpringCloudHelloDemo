package com.hello;

import com.hello.feign.HelloWorldFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaohuichao
 * @createdDate 2022/9/4 10:20
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class HelloWebApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloWebApplication.class).run(args);
    }

    @Autowired
    private HelloWorldFeign helloWorldFeign;

    @GetMapping("/hello")
    public Integer hello(Integer fibN){
        return helloWorldFeign.computedFib(fibN);
    }


}
