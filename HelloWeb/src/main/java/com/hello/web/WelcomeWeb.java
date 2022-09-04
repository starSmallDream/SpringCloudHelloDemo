package com.hello.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaohuichao
 * @createdDate 2022/9/4 11:43
 */
@RestController
@RefreshScope
public class WelcomeWeb {

    @Value("${welcome}")
    private String welcome;

    @GetMapping(value = "/welcome")
    public String welcome(){
        return "welcome => " + welcome;
    }

}
