package com.hello.feign;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaohuichao
 * @createdDate 2022/9/4 9:43
 */
@RestController
public class HelloWorldFeignImpl implements HelloWorldFeign {

    @Override
    public Integer computedFib(Integer fibN) {
        return fib(fibN);
    }

}
