package com.hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xiaohuichao
 * @createdDate 2022/9/3 23:39
 */
@SpringBootApplication
@EnableEurekaServer
public class HelloServiceCenterApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloServiceCenterApplication.class).run(args);
    }

}
