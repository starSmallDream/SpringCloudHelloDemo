package com.hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xiaohuichao
 * @createdDate 2022/9/4 9:25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HelloServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloServerApplication.class).run(args);
    }

}
