package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author xiaohuichao
 * @createdDate 2022/9/3 23:02
 */
@SpringBootApplication
@EnableConfigServer
public class HelloConfigServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloConfigServerApplication.class).run(args);
    }

}
