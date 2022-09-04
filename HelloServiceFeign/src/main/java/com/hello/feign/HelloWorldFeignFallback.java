package com.hello.feign;

import org.springframework.stereotype.Component;

/**
 * @author xiaohuichao
 * @createdDate 2022/9/4 11:14
 */
@Component
public class HelloWorldFeignFallback implements HelloWorldFeign {
    @Override
    public Integer computedFib(Integer fibN) {
        return -1;
    }
}
